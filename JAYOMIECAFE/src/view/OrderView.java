import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class OrderView extends JPanel{
	
	private JButton Button1;
	private JButton Button2;
	private JScrollPane ScrollPanel;
	private JTextArea TextArea;
	private MainFrame win;
	private JList OrderList;
	
	public OrderView(MainFrame win){
		this.win = win;
		setLayout(null);
		
		/*1번 메뉴*/
		Button1 = new JButton("Coffee");
		Button1.setSize(200,150);
		Button1.setLocation(10, 10);
		add(Button1);
		
		Button1.addActionListener(new CoffeeActionListener());
		
		
		/*2번메뉴*/
		Button2 = new JButton("Drink");
		Button2.setSize(200,150);
		Button2.setLocation(250, 10);
		add(Button2);
		
		Button2.addActionListener(new DrinkActionListener());
		
		/*주문내역 확인*/
		OrderList = new JList();
		OrderList.setSize(300,600);
		OrderList.setLocation(700, 10);
		add(OrderList);
		
		
		
	}
	
	class DrinkActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			win.change("Drink");
			if(e.getSource()==Button2){
				OrderList.add(Button2, getName());
			}
		}
	}
	
	
	class CoffeeActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			win.change("Coffee");
		}
	}
	
	
	
}