package cafe;

import javax.swing.JFrame;

public class MenuChange extends JFrame {
	
	public FirstPanel firstPanel = null;
	public MenuPanel menuPanel = null;
	
	public void change(String panelName) {
		
		if(panelName.equals("here")) {
			getContentPane().removeAll();
			getContentPane().add(menuPanel);
			revalidate(); 
			repaint();
		} else if(panelName.equals("takeout")) {
			getContentPane().removeAll();
			getContentPane().add(menuPanel);
			revalidate(); 
			repaint(); 
		} else if(panelName.equals("firstPanel")) {
			getContentPane().removeAll();
			getContentPane().add(firstPanel);
			revalidate();
			repaint();
		}
	} 
}
