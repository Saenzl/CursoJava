package main.layouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FlowLayoutEx extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel label;

	private JButton button;

	private JTextField text;

	public FlowLayoutEx(){
		super("Layouts");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}

	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		createLabel(container);
		createText(container);
		createButton(container);
	}

	public void createLabel(Container container){
		label = new JLabel("Nombre");
		container.add(label);
	}
	
	public void createText(Container container){
		text = new JTextField(20);
		container.add(text);
	}
	
	public void createButton(Container container){
		button = new JButton("Button");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		container.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String textStr = text.getText();
		JOptionPane.showMessageDialog(null, "Hola " + textStr);
	}

	



}
