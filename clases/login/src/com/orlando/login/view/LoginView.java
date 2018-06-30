package com.orlando.login.view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.orlando.login.dao.PersonDAO;
import com.orlando.login.daoimpl.PersonDAOImpl;
import com.orlando.login.model.Person;
import com.orlando.login.util.SessionData;
import com.orlando.login.util.UtilFunctions;

public class LoginView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton loginBtn;

	private JButton registerBtn;

	private Input userIn;

	private PasswordInput passwordIn;

	public LoginView(){
		super("Login");

		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildGUI();
	}

	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		createUserInput(container);
		createPasswordInput(container);
		createButtons(container);
	}

	public void createUserInput(Container container){
		userIn = new Input("Username: ");
		container.add(userIn);
	}

	public void createPasswordInput(Container container){
		passwordIn = new PasswordInput("Password: ");
		container.add(passwordIn);
	}

	public void createButtons(Container container){
		loginBtn = new JButton("Login");
		registerBtn = new JButton("Register");

		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login();
			}
		});

		registerBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UtilFunctions.redirect(LoginView.this, new RegisterView());
			}
		});

		container.add(loginBtn);
		container.add(registerBtn);
	}

	public void login(){
		String personEmail = userIn.getText();
		PersonDAO personDao = new PersonDAOImpl();
		Person person = personDao.getByEmail(personEmail);

		String hashedPassword = UtilFunctions.hash(passwordIn.getText());

		try{
			if(hashedPassword.equals(person.getPassword())){
				SessionData.setCurrentPerson(person);
				UtilFunctions.redirect(this, new MainView());
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect Password");
			}
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "User doesn't exist.");
		}
	}

}
