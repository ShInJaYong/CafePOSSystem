package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import control.ReadCoffeeInfo;
import model.Coffee;
import model.Drink;

public class MenuDetailPanel extends JPanel {

	public MenuDetailPanel(String panelName){
		ReadCoffeeInfo.readFile();
		setLayout(null);
		ArrayList<Coffee> coffees = ReadCoffeeInfo.getCoffees();
		ArrayList<Drink> drinks = ReadCoffeeInfo.getDrinks();
		
		if(panelName.equals("Coffee")){
			for(int i = 0; i < coffees.size(); i++){
				System.out.println(coffees.get(i).getName());
				JButton temp = new JButton(coffees.get(i).getName());
				temp.setSize(100,30);
				temp.setLocation(10,10+(35*i));
				this.add(temp);
			}
		} else {
			for(int i = 0; i < drinks.size(); i++){
				System.out.println(drinks.get(i).getName());
				JButton temp = new JButton(drinks.get(i).getName());
				temp.setSize(100,30);
				temp.setLocation(10,10+(35*i));
				this.add(temp);
			}
		}
		
		JButton exitButton = new JButton("³ª°¡±â");
		exitButton.setSize(150, 60);
		exitButton.setLocation(10, 600);
		add(exitButton);
		
	}

}
