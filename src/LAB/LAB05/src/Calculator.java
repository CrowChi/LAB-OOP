import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculator {

	protected Shell shell;
	private Text text_display;
	
	double result = 0 ;
	String operation = "no";
	String answer = "no";
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator window = new Calculator();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(915, 475);
		shell.setText("SWT Application");
		
		Label lblJong = new Label(shell, SWT.NONE);
		lblJong.setBounds(406, 21, 70, 20);
		lblJong.setText("Jong");
		
		text_display = new Text(shell, SWT.BORDER);
		text_display.setBounds(39, 48, 829, 84);
		
		// ปุ่ม Res
		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				answer = "no";
				operation = "no";
				text_display.setText("");
			}
		});
		btnReset.setBounds(39, 151, 90, 30);
		btnReset.setText("Reset");
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn1.getText();
				text_display.setText(number);
			}
		});
		btn1.setBounds(39, 207, 90, 30);
		btn1.setText("1");
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn2.getText();
				text_display.setText(number);
			}
		});
		btn2.setBounds(39, 260, 90, 30);
		btn2.setText("2");
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn3.getText();
				text_display.setText(number);
			}
		});
		btn3.setBounds(39, 312, 90, 30);
		btn3.setText("3");
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn4.getText();
				text_display.setText(number);
			}
		});
		btn4.setText("4");
		btn4.setBounds(172, 207, 90, 30);
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn5.getText();
				text_display.setText(number);
			}
		});
		btn5.setText("5");
		btn5.setBounds(172, 260, 90, 30);
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn6.getText();
				text_display.setText(number);
			}
		});
		btn6.setText("6");
		btn6.setBounds(172, 312, 90, 30);
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn7.getText();
				text_display.setText(number);
			}
		});
		btn7.setText("7");
		btn7.setBounds(309, 207, 90, 30);
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn8.getText();
				text_display.setText(number);
			}
		});
		btn8.setText("8");
		btn8.setBounds(309, 260, 90, 30);
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String number = text_display.getText()+btn9.getText();
				text_display.setText(number);
			}
		});
		btn9.setText("9");
		btn9.setBounds(309, 312, 90, 30);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!answer.equals("no")) {
					return;
				}
				String display = text_display.getText();
				if(display.isEmpty()) {
					
				} else {
					String number = text_display.getText()+btn0.getText();
					text_display.setText(number);
				}
			}
		});
		btn0.setBounds(39, 373, 90, 30);
		btn0.setText("0");
		
		Button btnSub = new Button(shell, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					String display = text_display.getText();
					if(!operation.equals("no")) {
						return;
					}
					if(display.isEmpty() || !answer.equals("no") ) {
						
					}  else {
						String number = text_display.getText()+btnSub.getText();
						if(answer.equals("no")) {
							System.out.print(answer);
							text_display.setText(number);
							operation="+";
						}
					}
			}
		});
		btnSub.setBounds(440, 207, 90, 30);
		btnSub.setText("+");
		
		Button btnDel = new Button(shell, SWT.NONE);
		btnDel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String display = text_display.getText();
				if(!operation.equals("no")) {
					return;
				}
				if(display.isEmpty() || !answer.equals("no") ) {
					
					
				} else {
					String number = text_display.getText()+btnDel.getText();
					text_display.setText(number);
					operation="-";
				}
			}
		});
		btnDel.setText("-");
		btnDel.setBounds(440, 260, 90, 30);
		
		Button btnMul = new Button(shell, SWT.NONE);
		btnMul.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String display = text_display.getText();
				if(!operation.equals("no")) {
					return;
				}
				if(display.isEmpty() || !answer.equals("no") ) {
					
					
				} else {
	
					String number = text_display.getText()+btnMul.getText();
					text_display.setText(number);
					operation="*";
				}
			}
		});
		btnMul.setText("*");
		btnMul.setBounds(440, 312, 90, 30);
		
		Button btnDivide = new Button(shell, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String display = text_display.getText();
				if(!operation.equals("no")) {
					return;
				}
				if(display.isEmpty() || !answer.equals("no") ) {
					
					
				} else {
		
					String number = text_display.getText()+btnDivide.getText();
					text_display.setText(number);
					operation="/";
				}
				
			}
		});
		btnDivide.setText("/");
		btnDivide.setBounds(440, 373, 90, 30);
		
		Button btnEquel = new Button(shell, SWT.NONE);
		btnEquel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String display = text_display.getText();
				if(display.isEmpty() || !answer.equals("no") ) {
					
				} else {
					try {
						String s = text_display.getText();
						String[] parts = s.split("[+\\-*/]");
						int num1 = Integer.parseInt(parts[0]);
						int num2 = Integer.parseInt(parts[1]);
						if(operation == "+") {
							result = num1 + num2;
							answer = String.format("%.0f", result) ;
							text_display.setText(parts[0] + "+" + parts[1] + "=" +answer);					
						}else if(operation == "-") {
							result = num1 - num2;
							answer = String.format("%.0f", result) ;
							text_display.setText(parts[0] + "-" + parts[1] + "=" +answer);	
						}else if(operation == "*") {
							result = num1 * num2;
							answer = String.format("%.0f", result) ;
							text_display.setText(parts[0] + "*" + parts[1] + "=" +answer);					
						}else if(operation == "/") {
							if(num2 == 0) {
								text_display.setText("หารมั้ยดั๊ย");
							}else {
								result = num1 / num2;
								answer = String.format("%.0f", result) ;
								text_display.setText(parts[0] + "/" + parts[1] + "=" +answer);
							}
						}
					} catch(Exception e1) {
			            
			        }

					
				}
				
			}
		});
		btnEquel.setText("=");
		btnEquel.setBounds(309, 373, 90, 30);
		
	}
}
