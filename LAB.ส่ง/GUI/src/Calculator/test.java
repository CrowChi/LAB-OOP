package Calculator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ViewForm;

public class test {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test window = new test();
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
		shell.setSize(509, 576);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		text = new Text(shell, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Leelawadee UI", 16, SWT.BOLD));
		text.setBounds(37, 23, 415, 132);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setBounds(37, 345, 90, 65);
		button.setText("1");
		
		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setSize(0, 0);
		viewForm.setLocation(0, 0);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(133, 345, 90, 65);
		button_1.setText("2");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(229, 345, 90, 65);
		button_2.setText("3");
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setBounds(37, 274, 90, 65);
		button_3.setText("4");
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(133, 274, 90, 65);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_4.setText("5");
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setBounds(229, 274, 90, 65);
		button_5.setText("6");
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(37, 203, 90, 65);
		button_6.setText("7");
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(133, 203, 90, 65);
		button_7.setText("8");
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setBounds(229, 203, 90, 65);
		button_8.setText("9");
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setBounds(133, 416, 90, 65);
		button_9.setText("0");
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(362, 203, 90, 65);
		button_10.setText("+");
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setBounds(362, 274, 90, 65);
		button_11.setText("-");
		
		Button btnX = new Button(shell, SWT.NONE);
		btnX.setBounds(362, 345, 90, 65);
		btnX.setText("x");
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setBounds(362, 416, 90, 65);
		button_12.setText("%");
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(229, 416, 90, 63);
		button_13.setText("=");

	}
}
