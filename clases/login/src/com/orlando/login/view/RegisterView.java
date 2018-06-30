package com.orlando.login.view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.orlando.login.dao.PersonDAO;
import com.orlando.login.daoimpl.PersonDAOImpl;
import com.orlando.login.model.Person;
import com.orlando.login.util.UtilFunctions;

public class RegisterView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5876853625642300559L;
	
	private Input name;
	
	private Input lastName;
	
	private Input email;
	
	private Input age;
	
	private Input address;
	
	private PasswordInput password;
	
	private PasswordInput passwordConfirm;
	
	private JButton registerBtn;
	
	private JButton cancelBtn;
	
	public RegisterView(){
		super("Register.");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		createInputs(container);
		createButtons(container);
	}
	
	public void createInputs(Container container){
		name = new Input("Name: ");
		lastName = new Input("Last Name: ");
		email = new Input("Email: ");
		age = new Input("Age: ");
		address = new Input("Address: ");
		password = new PasswordInput("Password: ");
		passwordConfirm = new PasswordInput("Confirm Password");
		
		container.add(name);
		container.add(lastName);
		container.add(email);
		container.add(age);
		container.add(address);
		container.add(password);
		container.add(passwordConfirm);
	}
	
	public void createButtons(Container container){
		registerBtn = new JButton("Register");
		cancelBtn = new JButton("Cancel");
		
		registerBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UtilFunctions.redirect(RegisterView.this, new LoginView());
			}
		});
		
		container.add(registerBtn);
		container.add(cancelBtn);
	}
	
	/*
	 * Register business logic
	 */
	public void register(){
		Person person = new Person();
		
		if(password.getText().equals(passwordConfirm.getText())){
			String hashedPassword = UtilFunctions.hash(password.getText());
			
			person.setName(name.getText());
			person.setLastName(lastName.getText());
			person.setEmail(email.getText());
			person.setAge(Integer.parseInt(age.getText()));
			person.setAddress(address.getText());
			person.setPassword(hashedPassword);
			
			PersonDAO personDao = new PersonDAOImpl();
			personDao.insert(person);
			
			UtilFunctions.redirect(RegisterView.this, new LoginView());
		}else{
			JOptionPane.showMessageDialog(null, "Passwords doesn't match");
		}
		
	}
	
}
