import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Coffee extends JPanel{
	private MainFrame win;
	private JButton jButton;
	private JButton jButton1;
	
	public Coffee(MainFrame win){
		setLayout(null);
		this.win = win;
		
		/*아메리카노 버튼*/
		jButton = new JButton("아메리카노");
		jButton.setSize(100,30);
		jButton.setLocation(10,10);
		add(jButton);
		
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
