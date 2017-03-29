package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OrderView extends JPanel{
	
	private JButton button1;
	private JButton Button2;
	private JScrollPane ScrollPanel;
	private JTextArea TextArea;
	private MainFrame win;
	private JList OrderList;
	private JButton Button3;
	private JButton Button4;
	
	//delegate
	private panelDelegate delegate;
	
	public void setDelegate(panelDelegate delegate){
		this.delegate = delegate;
	}
	
	public OrderView(MainFrame win){
		this.win = win;
		setLayout(null);
		
		/*1번 메뉴*/
		button1 = new JButton("Coffee");
		button1.setSize(200,150);
		button1.setLocation(10, 10);
		add(button1);
		
		button1.addActionListener(new DrinkActionListener());
		
		
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
		
		/*주문금액 확인*/
		
		
		/*결제방식 선택*/
		Button3 = new JButton("카드결제");
		Button3.setSize(150,70);
		Button3.setLocation(700, 700);
		add(Button3);
		
		Button4 = new JButton("현금결제");
		Button4.setSize(150,70);
		Button4.setLocation(870, 700);
		add(Button4);
		
	}
	
	public void changeView(String str){
		delegate.changeView(str);
	}
	
	// JButton Actionlistener 생성 및 버튼 이벤트 생성시 JList에 String추가
	class DrinkActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			JButton b = (JButton) e.getSource();
			changeView(b.getText());
		}
	}
	/*
	//JButton Actionlistener 생성 및 버튼 이벤트 생성시 JList에 String추가
	class CoffeeActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//change ca = new change();
			JButton b = (JButton) e.getSource();
			
			//배열로 메뉴값을 넣을수 있다면 if else순서를 change뒤로 넘겨 detail한 메뉴를 JList에 추가할수 있다.
			if(b.getText().equals("Coffee")){
				OrderList.setListData(CoffeeName);
			} else {
				b.setText("Coffee");
			}
			//ca.change(coffee);
		}
	}*/
	
	
	
}