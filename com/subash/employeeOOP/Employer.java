package com.subash.employeeOOP;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Employer {
	static JFrame frame = new JFrame();
	static ArrayList list=new ArrayList();
	static int empId=0;
	public static void main(String[] args) {

		guiDemo();
		getInfo();
		
	}

	public static void accountDepartment() {
		AccountsDepartment em1=new AccountsDepartment();
		
		em1.setEmployeeName(JOptionPane.showInputDialog(frame,"Enter the name","Welcome to account dept",JOptionPane.PLAIN_MESSAGE));
		em1.setEmployeeNumber(++empId);
		//em1.setEmployeeNumber(Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter the Employee num","Welcome to account",JOptionPane.PLAIN_MESSAGE)));
		em1.setDesignation(JOptionPane.showInputDialog(frame,"Enter the designation","Welcome to account",JOptionPane.PLAIN_MESSAGE));
		em1.CalculateSalary(em1.getDesignation());
		JOptionPane.showMessageDialog(frame, em1.toString(),"Welcome to account",JOptionPane.PLAIN_MESSAGE);
		System.out.println(em1.toString());
		list.add(em1);
		list.set(--empId, em1);
		guiDemo();
		
	}
		
	public static void ItDepartment() {
		ItDepartment em1=new ItDepartment();
		em1.setEmployeeName(JOptionPane.showInputDialog(frame,"Enter the name","Welcome to IT dept",JOptionPane.PLAIN_MESSAGE));
		//em1.setEmployeeNumber(Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter the Employee num", "Welcome to IT dept",JOptionPane.PLAIN_MESSAGE)));
		em1.setEmployeeNumber(++empId);
		em1.setDesignation(JOptionPane.showInputDialog(frame,"Enter the designation","Welcome to IT dept",JOptionPane.PLAIN_MESSAGE));
		em1.CalculateSalary(em1.getDesignation());
		JOptionPane.showMessageDialog(frame, em1.toString(),"Welcome to IT dept",JOptionPane.PLAIN_MESSAGE);
		System.out.println(em1.toString());
		list.add(em1);
		list.set(--empId, em1);
		guiDemo();
		
	}
	

	public static void HrDepartment() {
		HrDepartment em1=new HrDepartment();
		em1.setEmployeeName(JOptionPane.showInputDialog(frame,"Enter the name","Welcome to HR dept",JOptionPane.PLAIN_MESSAGE));
		//em1.setEmployeeNumber(Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter the Employee num", "Welcome to HR dept",JOptionPane.PLAIN_MESSAGE)));
		em1.setEmployeeNumber(++empId);
		em1.setDesignation(JOptionPane.showInputDialog(frame,"Enter the designation","Welcome to HR dept",JOptionPane.PLAIN_MESSAGE));
		em1.CalculateSalary(em1.getDesignation());
		JOptionPane.showMessageDialog(frame, em1.toString(),"Welcome to HR dept",JOptionPane.PLAIN_MESSAGE);
		System.out.println(em1.toString());
		list.add(em1);
		list.set(--empId, em1);
		guiDemo();
		
	}
	public static void guiDemo() {
		//j.addInputMethodListener(l);
	    frame.setAlwaysOnTop(true);
	    String [] buttons = {"ADD","FIND"};
	    int optionVal=JOptionPane.showOptionDialog(frame, "Choose your option","Subash's Company", JOptionPane.INFORMATION_MESSAGE,1,null, buttons, buttons[0]);

	    if(optionVal==0) {
	Object[] possibilities = {"accountDepartment", "ItDepartment", "HrDepartment"};
	String s=(String) JOptionPane.showInputDialog(
            null, "choose the department",
            "Subash's company",
            JOptionPane.PLAIN_MESSAGE,
            null, possibilities,
            "accountDepartment");
	if(s==possibilities[0]) {
		accountDepartment();
	}

	if(s==possibilities[1]) {
		ItDepartment();
	}
	if(s==possibilities[2]) {
		HrDepartment();
	}
	    }
	  if(optionVal==1) {
		  getInfo();
	  }else {
		  int result = JOptionPane.showConfirmDialog(frame,
			        "Are you sure you want to quit?",
			        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
			if (result == JOptionPane.YES_OPTION) System.exit(0);
		  guiDemo();
		  
	  }
	}
	
public static void getInfo() {
	int id=Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the employee ID number", "Subash's Company", JOptionPane.PLAIN_MESSAGE));
	if(!list.isEmpty()) {
	JOptionPane.showMessageDialog(frame, list.get(--id));
	String [] buttons = {"EDIT","REMOVE","BACK"};
	int optionVal=JOptionPane.showOptionDialog(frame, "Choose your option","Subash's Company", JOptionPane.INFORMATION_MESSAGE,1,null, buttons, buttons[0]);
	if(optionVal==0) {
		
		Object[] possibilities = {"accountDepartment", "ItDepartment", "HrDepartment"};
		String s=(String) JOptionPane.showInputDialog(
	            null, "choose the department",
	            "Subash's company",
	            JOptionPane.PLAIN_MESSAGE,
	            null, possibilities,
	            "accountDepartment");
		if(s==possibilities[0]) {
			accountDepartment();
			
		}

		if(s==possibilities[1]) {
			ItDepartment();
		}
		if(s==possibilities[2]) {
			HrDepartment();
		}
		guiDemo();
	}
	if(optionVal==1) {
		JOptionPane.showMessageDialog(frame, "Object "+list.get(id)+" is removed", "Subash's Company", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(frame, "Object "+list.get(id)+" is removed","Subash's Company");
		list.remove(id);
		guiDemo();
	}
	if(optionVal==2) {
		guiDemo();
	}
	}else {
		JOptionPane.showMessageDialog(frame,  "Object with id : "+id +" is not found ! ", "Subash's Company", JOptionPane.PLAIN_MESSAGE);
		guiDemo();
	}
	
	
	
	
}


}
