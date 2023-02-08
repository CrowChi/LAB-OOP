package Calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class MID {
	 protected Shell shlLogin;
	    private Text userNameTxt;
	    private Text passwordTxt;
	    private String userName = null;
	    private String password = null;
	 
	    public static void main(String[] args) {
	        try {
	        	MID window = new MID();
	            window.open();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    public void open() {
	        Display display = Display.getDefault();
	        createContents();
	        shlLogin.open();
	        shlLogin.layout();
	        while (!shlLogin.isDisposed()) {
	            if (!display.readAndDispatch()) {
	                display.sleep();
	            }
	        }
	    }
	 
	    /**
	     * Create contents of the window.
	     */
	    protected void createContents() {
	        shlLogin = new Shell(SWT.CLOSE | SWT.TITLE | SWT.MIN);
	        shlLogin.setSize(450, 300);
	        shlLogin.setText("Login");
	 
	        Label lblUsername = new Label(shlLogin, SWT.NONE);
	        lblUsername.setBounds(125, 115, 55, 15);
	        lblUsername.setText("Username");
	 
	        Label lblPassword = new Label(shlLogin, SWT.NONE);
	        lblPassword.setBounds(125, 144, 55, 15);
	        lblPassword.setText("Password");
	 
	        userNameTxt = new Text(shlLogin, SWT.BORDER);
	        userNameTxt.setBounds(206, 109, 173, 21);
	 
	        passwordTxt = new Text(shlLogin, SWT.BORDER | SWT.PASSWORD);
	        passwordTxt.setBounds(206, 144, 173, 21);
	 
	        Button btnLogin = new Button(shlLogin, SWT.NONE);
	        btnLogin.setBounds(206, 185, 75, 25);
	        btnLogin.setText("Login");
	 
	        btnLogin.addListener(SWT.Selection, new Listener() {
	            public void handleEvent(Event event) {
	 
	                userName = userNameTxt.getText();
	                password = passwordTxt.getText();
	 
	                if (userNameTxt.equals("1234") && passwordTxt.equals("1234")) {
	                    JOptionPane.showMessageDialog(null, "Login");
	                } else {
	                	JOptionPane.showMessageDialog(null, "Login failed");
	                }
	                
	                    String errorMsg = null;
	                    MessageBox messageBox = new MessageBox(shlLogin, SWT.OK | SWT.ICON_ERROR);
	 
	                    messageBox.setText("Alert");
	                    if (userName == null || userName.isEmpty()) {
	                        errorMsg = "Please enter username";
	                    } else if (password == null || password.isEmpty()) {
	                        errorMsg = "Please enter password";
	                    }
	                    if (errorMsg != null) {
	                        messageBox.setMessage(errorMsg);
	                        messageBox.open();
	                    }
	                } 
	        });
	 
	    }
	 
	}