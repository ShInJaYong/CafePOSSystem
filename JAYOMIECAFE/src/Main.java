import javax.swing.JFrame;
import javax.swing.JList;

public class Main {

	public static void main(String[] args) {

		MainFrame win = new MainFrame();
		
		win.setTitle("ÀÚ¿ä¹ÌCAFE");
		win.orderview = new OrderView(win);
		win.coffee = new Coffee(win);
		win.drink = new Drink(win);
		
		win.add(win.orderview);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(1100,1000);
		win.setVisible(true);
	
	}
}



