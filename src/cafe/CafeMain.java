package cafe;

import cafe.FirstPanel;

public class CafeMain {
	public static void main(String[] args) {
		
		MenuChange mc = new MenuChange();
		
		mc.setTitle("스무디킹");
		
		mc.firstPanel = new FirstPanel(mc);
		mc.menuPanel = new MenuPanel(mc);
		
		
		mc.add(mc.firstPanel);
		
		
		
		mc.setBounds(200, 0, 625, 810);
		mc.setResizable(false);
		mc.setVisible(true);
		mc.setDefaultCloseOperation(mc.EXIT_ON_CLOSE);
	}

}
