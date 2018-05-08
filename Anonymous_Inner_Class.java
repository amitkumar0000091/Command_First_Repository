package vskill_examples;
import java.awt.*;
import java.awt.event.*;

public class Anonymous_Inner_Class extends Frame {
	
	Anonymous_Inner_Class()
	{
		Button br = new  Button("OK");
		add(br);
		br.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);		
			}
			
		});
	}
	
	
	public static void main(String args[])
	{
		Anonymous_Inner_Class obj = new Anonymous_Inner_Class();
		obj.setSize(400, 200);
		obj.setVisible(true);
	}
}

class myclass implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(1);		
	}
}
