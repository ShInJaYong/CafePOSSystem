package view;

import javax.swing.JFrame;

import model.Coffee;
import model.Drink;

public class MainFrame extends JFrame{
	
	public OrderView orderview = null;
	public Coffee coffee = null;
	public Drink drink = null;

	
	public void change(String panelName){
		
		if(panelName.equals("Coffee")){
			getContentPane().removeAll();
			getContentPane().add(coffee);
			revalidate();
			repaint();
		} else if(panelName.equals("Drink")){
			getContentPane().removeAll();
			getContentPane().add(drink);
			revalidate();
			repaint();
		} else{
			getContentPane().removeAll();
			getContentPane().add(orderview);
			revalidate();
			repaint();

		}
	}

}
