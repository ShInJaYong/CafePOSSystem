package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.MainFrame;

public class Drink extends JPanel{
	private MainFrame win;
	private JButton jButton;
	private JButton jButton1;
	private JButton jButton2;

	
	public Drink(MainFrame win){
		setLayout(null);
		this.win = win;
		
		/*쥬스 버튼*/
		JButton jButton = new JButton("오렌지쥬스");
		jButton.setSize(100,30);
		jButton.setLocation(10, 10);
		add(jButton);
		
		JButton jButton2 = new JButton("딸기스무디");
		jButton2.setSize(100,30);
		jButton2.setLocation(10, 50);
		add(jButton2);
		
		/*돌아가기 버튼*/
		JButton jButton1 = new JButton("메뉴화면으로");
		jButton1.setSize(100,30);
		jButton1.setLocation(10,600);
		add(jButton1);
		jButton1.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("OrderView");
		}
	}
}