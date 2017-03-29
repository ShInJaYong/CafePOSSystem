package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Coffee;
import model.Drink;

public class MainFrame extends JFrame implements panelDelegate{
	private ArrayList<JPanel> panelStack = new ArrayList<JPanel>();
	
	public MainFrame(){
		this.setTitle("�ڿ��CAFE");		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1100,1000);
		this.setVisible(true);
		
		OrderView orderview = new OrderView(this);
		orderview.setDelegate(this);
		this.pushPanel(orderview);
	}
	
	public void pushPanel(JPanel panel){
		panelStack.add(panel);
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public void popPanel(){
		this.getContentPane().removeAll();
		this.getContentPane().add(panelStack.get(panelStack.size()-2));
		this.revalidate();
		this.repaint();
		panelStack.remove(panelStack.size()-1);
	}
	
	public void change(String panelName){
		if(panelName.equals("Coffee") || panelName.equals("Drink")){
			MenuDetailPanel detailPanel = new MenuDetailPanel(panelName);			
			this.pushPanel(detailPanel);
		}else {
			this.popPanel();
		}
	}

	@Override
	public void changeView(String str) {
		// TODO Auto-generated method stub
		this.change(str);
	}

}
