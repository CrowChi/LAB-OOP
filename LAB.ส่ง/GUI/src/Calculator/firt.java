package Calculator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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

public class firt {

	protected Shell shlCalculator;
	private Text text;
	
	double EnterNum1;
	double EnterNum2;
	double Result;
	String Operate;
	String Answer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			firt window = new firt();
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
		shlCalculator.open();
		shlCalculator.layout();
		while (!shlCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCalculator = new Shell();
		shlCalculator.setSize(386, 391);
		shlCalculator.setText("calculator");
		
		Button btn0 = new Button(shlCalculator, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				String number=text.getText()+btn0.getText();
				text.setText(number);
			}
		});
		btn0.setBounds(24, 272, 163, 61);
		btn0.setText("0");
		
		Button btn1 = new Button(shlCalculator, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
//				if(text.getText() != "") {
				String number=text.getText()+btn1.getText();
				text.setText(number);
//				}//end if
			}
		});
		btn1.setBounds(24, 223, 51, 43);
		btn1.setText("1");
		
		Button btn2 = new Button(shlCalculator, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn2.getText();
				text.setText(number);
			}
		});
		btn2.setBounds(81, 223, 47, 43);
		btn2.setText("2");
		
		Button btn3 = new Button(shlCalculator, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn3.getText();
				text.setText(number);
			}
		});
		btn3.setBounds(134, 223, 53, 43);
		btn3.setText("3");
		
		Button btn4 = new Button(shlCalculator, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn4.getText();
				text.setText(number);
			}
		});
		btn4.setBounds(24, 174, 51, 43);
		btn4.setText("4");
		
		Button btn5 = new Button(shlCalculator, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn5.getText();
				text.setText(number);
			}
		});
		btn5.setBounds(81, 174, 47, 43);
		btn5.setText("5");
		
		Button btn6 = new Button(shlCalculator, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn6.getText();
				text.setText(number);
			}
		});
		btn6.setBounds(134, 174, 53, 43);
		btn6.setText("6");
		
		Button btn7 = new Button(shlCalculator, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn7.getText();
				text.setText(number);
			}
		});
		btn7.setBounds(24, 130, 51, 38);
		btn7.setText("7");
		
		Button btn8 = new Button(shlCalculator, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn8.getText();
				text.setText(number);
			}
		});
		btn8.setBounds(81, 130, 47, 38);
		btn8.setText("8");
		
		Button btn9 = new Button(shlCalculator, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String number=text.getText()+btn9.getText();
				text.setText(number);
			}
		});
		btn9.setBounds(134, 130, 53, 38);
		btn9.setText("9");
		
		Button btnPlus = new Button(shlCalculator, SWT.NONE);
		btnPlus.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				EnterNum1 = Double.parseDouble(text.getText());
				text.setText("");
				Operate="+";
			}
		});
		btnPlus.setBounds(198, 170, 141, 34);
		btnPlus.setText("+");
		
		Button btnMinus = new Button(shlCalculator, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				EnterNum1 = Double.parseDouble(text.getText());
				text.setText("");
				Operate="-";
			}
		});
		btnMinus.setBounds(198, 130, 141, 34);
		btnMinus.setText("-");
		
		Button btnMultiplication = new Button(shlCalculator, SWT.NONE);
		btnMultiplication.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				EnterNum1 = Double.parseDouble(text.getText());
				text.setText("");
				Operate="*";
			}
		});
		btnMultiplication.setBounds(198, 250, 141, 34);
		btnMultiplication.setText("*");
		
		Button btnDivision = new Button(shlCalculator, SWT.NONE);
		btnDivision.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				EnterNum1 = Double.parseDouble(text.getText());
				text.setText("");
				Operate="/";
			}
		});
		btnDivision.setBounds(198, 210, 141, 34);
		btnDivision.setText("/");
		
		Button btnEqual = new Button(shlCalculator, SWT.NONE);
		btnEqual.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				EnterNum2 = Double.parseDouble(text.getText());
				switch (Operate) {
				case "+" :
					Result = EnterNum1+EnterNum2;
					Answer = String.format("%.2f",Result);
					//System.out.println("%.2f + %.2f = %.2f",EnterNum1 ,EnterNum2 ,Result);
					text.setText(String.valueOf(EnterNum1+" + "+EnterNum2 +"=\n"+ Result));
					break;
				case "-" :
					Result = EnterNum1-EnterNum2;
					Answer = String.format("%.2f",Result);
					text.setText(String.valueOf(EnterNum1+" - "+EnterNum2 +"=\n"+ Result));			
					break;
				case "*" :
					Result = EnterNum1*EnterNum2;
					Answer = String.format("%.2f",Result);
					text.setText(String.valueOf(EnterNum1+" * "+EnterNum2 +"=\n"+ Result));
					break;
				case "/" :
					if(EnterNum2 !=0) {
					Result = EnterNum1/EnterNum2;
					Answer = String.format("%.2f",Result);
					text.setText(String.valueOf(EnterNum1+" / "+EnterNum2 +"=\n"+ Result));
					}
					else {
						text.setText("Not div with 0");
					}
					break;
				}
				
				
//				if (Operate = "+") {
//					Result = EnterNum1+EnterNum2;
//					Answer = String.format("%.2f",Result);
//					text.setText(String.valueOf(Result));
//					break;
//				}
//				if (Operate == "-") {
//					Result = EnterNum1-EnterNum2;
//					Answer = String.format("%.2f",Result);
//					text.setText(String.valueOf(Result));
//				}
//				if (Operate == "*") {
//					Result = EnterNum1*EnterNum2;
//					Answer = String.format("%.2f",Result);
//					text.setText(String.valueOf(Result));
//				}
//				if (Operate == "/") {
//					Result = EnterNum1/EnterNum2;
//					Answer = String.format("%.2f",Result);
//					text.setText(String.valueOf(Result));
//				}
				
				
			}
		});
		btnEqual.setBounds(198, 290, 141, 43);
		btnEqual.setText("=");
		
		text = new Text(shlCalculator, SWT.BORDER | SWT.MULTI);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text.setBounds(29, 10, 310, 114);

	}
}