package control;

import javax.swing.JButton;

/*SetButtonTitle*/
public class TempButton extends JButton{
	private String title;

	public TempButton(){
	this.getTitle();
	}
	public TempButton(String temp){
		super();
		this.title = temp;
		this.toString();
	}
		public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
