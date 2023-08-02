package cafe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {
	
	private ImageIcon img;
	private JLabel jl;
	private JButton order1;
	private JButton order2;
	private MenuChange mc;
	
	public FirstPanel(MenuChange mc) {
		this.mc = mc;
		
		
		setLayout(null);
		setBounds(0, 0, 625, 810);
		setBackground(new Color(78, 36, 138));
		
		order1 = new JButton("매  장");
		order2 = new JButton("포  장");
		
		order1.setBounds(120, 695, 150, 80);
		order2.setBounds(370, 695 ,150 ,80);
		
		add(order1);
		add(order2);
		
		// 기능구현
		order1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.change("here");
				
			}
		});
		
		order2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.change("takeout");
			}
		});
		
		// 이미지
		img = new ImageIcon("src/img/main_img.jpeg");
		jl = new JLabel(img);
		jl.setBounds(0, 0, 625, 690);
		add(jl);
		
	}
}
