package model;


import view.MainFrame;

public class Drink {
	private MainFrame win;
	private String name;
	private int price;
	
	public Drink(String name, int price){
		this.name = name;
		this.price = price;
	}

	public Drink(MainFrame win){
		this.win = win;
	}
	
	public MainFrame getWin() {
		return win;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}

}