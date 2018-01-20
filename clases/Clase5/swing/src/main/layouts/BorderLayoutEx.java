package main.layouts;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class BorderLayoutEx extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel northLabel;
	private JLabel southLabel;
	private JLabel westLabel;
	private JLabel eastLabel;
	private JLabel centerLabel;

	public BorderLayoutEx(){
		super("BorderLayout");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		northLabel = new JLabel("North Label");
		container.add(northLabel, BorderLayout.NORTH);

		southLabel = new JLabel("South Label");
		container.add(southLabel, BorderLayout.SOUTH);

		westLabel = new JLabel("West Label");
		container.add(westLabel, BorderLayout.WEST);

		eastLabel = new JLabel("East Label");
		container.add(eastLabel, BorderLayout.EAST);

		centerLabel = new JLabel("Center Label");
		container.add(centerLabel, BorderLayout.CENTER);
	}
}
