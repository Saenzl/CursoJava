package layouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame implements ActionListener{
	
	private JButton borderBtn;
	
	private JButton gridBtn;
		
	public Layouts(){
		super("Layouts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		
		borderBtn = new JButton("BorderLayout window");
		borderBtn.addActionListener(this);
		
		gridBtn = new JButton("GridLayout window");
		gridBtn.addActionListener(this);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(borderBtn);
		container.add(gridBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String btnText = btn.getText();
		if(btnText.equals("BorderLayout window")){
			BorderLayoutEx borderLayout = new BorderLayoutEx();
			borderLayout.setVisible(true);
		}else{
			GridLayoutEx gridLayout = new GridLayoutEx();
			gridLayout.setVisible(true);
		}
		
	}
}
