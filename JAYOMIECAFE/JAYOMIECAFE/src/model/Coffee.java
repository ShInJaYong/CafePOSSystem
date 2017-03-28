package model;

import view.MainFrame;


public class Coffee{

	private String name;
	private int price;
	private MainFrame win;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
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

