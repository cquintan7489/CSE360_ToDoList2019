import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.awt.event.ActionEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;

public class GUI360 {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI360 window = new GUI360();
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
		shell.setSize(695, 473);
		shell.setText("SWT Application");
		
		
		
		Label lblWelcomeToTodo = new Label(shell, SWT.NONE);
		Label lblCreateAnEntry = new Label(shell, SWT.NONE);
		Label lblDescription = new Label(shell, SWT.NONE);
		Label lblPriority = new Label(shell, SWT.NONE);
		Label lblDueDate = new Label(shell, SWT.NONE);
		Label lblStatus = new Label(shell, SWT.NONE);
		Combo combo = new Combo(shell, SWT.NONE);
		text = new Text(shell, SWT.BORDER);
		text_1 = new Text(shell, SWT.BORDER);
		text_2 = new Text(shell, SWT.BORDER);
		Button btnEnter = new Button(shell, SWT.NONE);
		Label lblChooseTheOrder = new Label(shell, SWT.NONE);
		Combo comboDisplay = new Combo(shell, SWT.NONE);
		//lblWelcomeToTodo.setBounds(380, 10, 185, 20);
		//lblWelcomeToTodo.setText("Welcome to To-Do List");
		
		Button btnHome = new Button(shell, SWT.NONE);
	
		
		
		btnHome.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				 
				 lblCreateAnEntry.setVisible(false);
				 lblDescription.setVisible(false);
				 lblPriority.setVisible(false);
				 lblDueDate.setVisible(false);
				 lblStatus.setVisible(false);
				 combo.setVisible(false);
				 text.setVisible(false);
				 text_1.setVisible(false);
				 text_2.setVisible(false);
				 btnEnter.setVisible(false);
				
				lblWelcomeToTodo.setVisible(true);
				lblWelcomeToTodo.setBounds(380, 10, 185, 20);
				lblWelcomeToTodo.setText("Welcome to To-Do List");
				}
				
				
			
			
		});
		
		
		btnHome.setBounds(0, 0, 128, 79);
		btnHome.setText("Home");
		
		
		
		Button btnAdd = new Button(shell, SWT.NONE);
		
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				lblWelcomeToTodo.setVisible(false);
				lblCreateAnEntry.setVisible(true);
				lblDescription.setVisible(true);
				lblPriority.setVisible(true);
				lblDueDate.setVisible(true);
				lblStatus.setVisible(true);
				combo.setVisible(true);
				text.setVisible(true);
				text_1.setVisible(true);
				text_2.setVisible(true);
				btnEnter.setVisible(true);
				
				lblCreateAnEntry.setBounds(401, 10, 121, 20);
				lblCreateAnEntry.setText("Create an Entry");
				
				
				lblDescription.setBounds(281, 41, 105, 20);
				lblDescription.setText("Description:");
				
				
				lblPriority.setText("Priority #:");
				lblPriority.setBounds(281, 199, 65, 20);
				
				
				lblDueDate.setText("Due Date:");
				lblDueDate.setBounds(281, 243, 65, 20);
				
				
				lblStatus.setText("Status:");
				lblStatus.setBounds(281, 284, 55, 20);
				
				
				text.setBounds(292, 67, 364, 105);
				
				
				
				combo.setItems(new String[] {"Not Started", "In-Progress", "Complete"});
				combo.setBounds(343, 287, 97, 28);
				
				
				text_1.setBounds(355, 199, 78, 26);
				
				
				text_2.setBounds(355, 243, 78, 26);
				
				
				btnEnter.setBounds(480, 306, 176, 91);
				btnEnter.setText("Enter");
				
			}
		});
		btnAdd.setText("Add");
		btnAdd.setBounds(0, 85, 128, 79);
		
		Button btnComplete = new Button(shell, SWT.NONE);
		btnComplete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
		
				
			}
		});
		btnComplete.setText("Complete");
		btnComplete.setBounds(0, 170, 128, 79);
		
		Button btnPrint = new Button(shell, SWT.NONE);
		btnPrint.setText("Print");
		btnPrint.setBounds(0, 255, 128, 79);
		
		Button btnRestore = new Button(shell, SWT.NONE);
		btnRestore.setText("Restore");
		btnRestore.setBounds(0, 340, 128, 79);
		
		Button btnDisplay = new Button(shell, SWT.NONE);
		btnDisplay.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				
				lblChooseTheOrder.setBounds(353, 47, 221, 20);
				lblChooseTheOrder.setText("Choose the order for the Display");
				
				
				comboDisplay.setLayoutDeferred(true);
				comboDisplay.setDragDetect(false);
				comboDisplay.setVisible(true);
				comboDisplay.setItems(new String[] {"Priority", "Due Date", "Status"});
				comboDisplay.setToolTipText("");
				comboDisplay.setBounds(406, 85, 97, 28);
				comboDisplay.select(0);
				
				
			}
		});
		btnDisplay.setText("Display");
		btnDisplay.setBounds(135, 0, 128, 79);
		
		Button btnChange = new Button(shell, SWT.NONE);
		btnChange.setText("Change");
		btnChange.setBounds(135, 85, 128, 79);
		
		Button btnDelete = new Button(shell, SWT.NONE);
		btnDelete.setText("Delete");
		btnDelete.setBounds(135, 170, 128, 79);
		
		Button btnSave = new Button(shell, SWT.NONE);
		btnSave.setText("Save");
		btnSave.setBounds(135, 255, 128, 79);
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.setText("Exit");
		btnExit.setBounds(135, 340, 128, 79);
		
		
		
		
		
		

	}
}
