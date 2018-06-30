package com.orlando.login.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.orlando.login.util.SessionData;

public class MainView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel welcomeLbl;
	
	public MainView(){
		super("Main");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		welcomeLbl = new JLabel("Welcome " + SessionData.getCurrentPerson().getName());
		container.add(welcomeLbl, BorderLayout.NORTH);
	}

}
