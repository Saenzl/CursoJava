package com.tecgurus.login.views;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.tecgurus.login.util.SessionData;

public class DashboardView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel welcomeLbl;
	
	public DashboardView(){
		super();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		welcomeLbl = new JLabel("Hola: " + SessionData.getCurrentUser().getName()); 
		container.add(welcomeLbl, BorderLayout.NORTH);
	}
	
}
