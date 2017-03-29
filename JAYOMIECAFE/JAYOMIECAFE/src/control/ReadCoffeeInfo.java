package control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import model.Coffee;
import model.Drink;


public class ReadCoffeeInfo {
	static public ArrayList<Coffee> coffees = new ArrayList<Coffee>();
	static public ArrayList<Drink> drinks = new ArrayList<Drink>();
	public static String key;
	
	static public ArrayList<Coffee> getCoffees(){
		return coffees;
	}
	
	static public ArrayList<Drink> getDrinks(){
		return drinks;
	}
	
	static public void readFile(){
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("Menu.txt"));
			String s;
			//String key;

			while ((s = in.readLine()) != null) {
				String[] split = s.split(" ");
				key = split[0];
				switch(key){
				case "C":
					Coffee tempCoffee = new Coffee(split[1], Integer.valueOf(split[2]));
					coffees.add(tempCoffee);
					break;
				case "D":
					Drink tempDrink = new Drink(split[1], Integer.valueOf(split[2]));
					drinks.add(tempDrink);
					break;
				}
				
			}
			in.close();
		}catch(IOException e)
		{
			System.err.println(e);
			System.out.println("�ٽ� �Է��� �ּ���");
			return;
		}
	}
	

	static public void addMenu(String name, int price){
		//���Ͽ� ����
		
		Coffee coffee = new Coffee(name, price);
		coffees.add(coffee);
	}
	
	static public void deleteMenu(String name, int price){
		//���� �����
	}
	
}