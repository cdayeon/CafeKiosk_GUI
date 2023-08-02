package cafe;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuPanel extends JPanel {

	private JPanel upPanel;
	private JPanel menuOne;
	private JPanel menuTwo;
	private JPanel menuThree;
	private JPanel menuFour;
	private JPanel downPanel;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	private MenuChange mc;
	
	
	int total = 0;
	String show = "";
	
	public MenuPanel(MenuChange mc) {
		this.mc = mc;
		
		//전체 레이아웃
		setLayout(null);
		setBounds(0, 0, 625, 1000);
		
		//배열 정리 시작
		String[] drink1 = {"아몬드바나나","아몬드모카","린1다크초코","린1스트로베리","딸기바나나","파인애플망고"};
		int[] money1 = {4900,4900,4900,4900,4900,4900};
		
		String[] drink2 = {"썬골드키위","블루베리베리","캐리비안웨이","체리익스트림","삼삼한라봉","피치플러스"};
		int[] money2 = {4900,4900,4900,4900,4000,4000};
		
		String[] drink3 = {"아메리카노","카페라떼","초코라떼","프룻카모마일","리프레싱민트","레몬루이보스"};
		int[] money3 = {2500,3500,3000,4000,4000,4000};
		
		String[] food = {"애플케익","블루베리케익","바질치즈토스트","매콤치즈토스트"};
		int[] money4 = {4200,4000,3500,3500};
		
		JButton[] jb1 = new JButton[drink1.length];
		JButton[] jb2 = new JButton[drink2.length];
		JButton[] jb3 = new JButton[drink3.length];
		JButton[] jb4 = new JButton[food.length];
		
		JLabel[] tit1 = new JLabel[drink1.length];
		JLabel[] tit2 = new JLabel[drink2.length];
		JLabel[] tit3 = new JLabel[drink3.length];
		JLabel[] tit4 = new JLabel[food.length];
		
		TextField[] tf1 = new TextField[drink1.length];
		TextField[] tf2 = new TextField[drink2.length];
		TextField[] tf3 = new TextField[drink3.length];
		TextField[] tf4 = new TextField[food.length];
		
		JButton[] plus1 = new JButton[drink1.length];
		JButton[] plus2 = new JButton[drink2.length];
		JButton[] plus3 = new JButton[drink3.length];
		JButton[] plus4 = new JButton[food.length];
		
		JButton[] minus1 = new JButton[drink1.length];
		JButton[] minus2 = new JButton[drink2.length];
		JButton[] minus3 = new JButton[drink3.length];
		JButton[] minus4 = new JButton[food.length];
		
		JButton[] check1 = new JButton[drink1.length];
		JButton[] check2 = new JButton[drink2.length];
		JButton[] check3 = new JButton[drink3.length];
		JButton[] check4 = new JButton[food.length];
		
		JLabel[] lb1 = new JLabel[drink1.length];
		JLabel[] lb2 = new JLabel[drink2.length];
		JLabel[] lb3 = new JLabel[drink3.length];
		JLabel[] lb4 = new JLabel[food.length];
		
		ImageIcon[] icon1 = new ImageIcon[drink1.length];
		ImageIcon[] icon2 = new ImageIcon[drink2.length];
		ImageIcon[] icon3 = new ImageIcon[drink3.length];
		ImageIcon[] icon4 = new ImageIcon[food.length];
		//배열 정리 끝
		
		//upPanel 조정
		upPanel = new JPanel();
		upPanel.setLayout(null);
		upPanel.setBounds(0, 0, 625, 100);
		upPanel.setBackground(new Color(78, 36, 138));
		
		//button1, button2, button3, button4 조정
		button1 = new JButton("FITNESS 스무디");
		button2 = new JButton("FRUIT 스무디");
		button3 = new JButton("COFFEE & TEA");
		button4 = new JButton("FOOD");
		button1.setBounds(10, 20, 130, 50);
		button2.setBounds(170, 20, 130, 50);
		button3.setBounds(330, 20, 130, 50);
		button4.setBounds(490, 20, 130, 50);
		
		//upPanel에 button 부착
		upPanel.add(button1);
		upPanel.add(button2);
		upPanel.add(button3);
		upPanel.add(button4);
		
		//전체 패널에 upPanel 부착
		add(upPanel);
		
		//menuOne 조정
		menuOne = new JPanel();
		menuOne.setLayout(null);
		menuOne.setBackground(Color.WHITE);
		menuOne.setBounds(0, 100, 625, 450);
		menuOne.setVisible(true);
		
		for(int i=0; i<drink1.length; i++) {
			
			//drink1버튼
			jb1[i] = new JButton(drink1[i]);
			if(i<3) {
				jb1[i].setBounds(60+i*200, 30, 100, 100);
			}else {
				jb1[i].setBounds(60+(i-3)*200, 250, 100, 100);
			}
			
			//메뉴 이미지
			icon1[i] = new ImageIcon("src/img/d"+i+".png");
			jb1[i].setIcon(icon1[i]);
			
			//메뉴 이름
			tit1[i] = new JLabel(drink1[i]);
			tit1[i].setEnabled(false);
			tit1[i].setBounds(jb1[i].getX()+17, jb1[i].getY()+115, 130, 20);
			
			//tf1
			tf1[i] = new TextField("0");
			tf1[i].setBackground(new Color(255, 204, 255));
			tf1[i].setEditable(false);
			tf1[i].setBounds(jb1[i].getX()+32, jb1[i].getY()+140, 30, 20);
			
			//- 버튼
			minus1[i] = new JButton("-");
			minus1[i].setBounds(jb1[i].getX()+7, tf1[i].getY(), 20, 20);
			
			//+ 버튼
			plus1[i] = new JButton("+");
			plus1[i].setBounds(jb1[i].getX()+67, tf1[i].getY(), 20, 20);
			
			//가격
			lb1[i] = new JLabel(money1[i]+"원");
			lb1[i].setBounds(jb1[i].getX()+27, jb1[i].getY()+95, 100, 20);
			
			//체크 버튼
			check1[i] = new JButton("확인");
			check1[i].setBounds(jb1[i].getX(), tf1[i].getY()+30, 100, 20);
			check1[i].setEnabled(false);
			
			menuOne.add(jb1[i]);
			menuOne.add(tit1[i]);
			menuOne.add(tf1[i]);
			menuOne.add(minus1[i]);
			menuOne.add(plus1[i]);
			menuOne.add(lb1[i]);
			menuOne.add(check1[i]);
		}
		
		//전체 패널에 menuOne 부착
		add(menuOne);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuOne.setVisible(true);
				menuTwo.setVisible(false);
				menuThree.setVisible(false);
				menuFour.setVisible(false);
			}
		});
		//menuOne 조정 완료
		
		//menuTwo 조정 시작
		menuTwo = new JPanel();
		menuTwo.setLayout(null);
		menuTwo.setBackground(Color.WHITE);
		menuTwo.setBounds(0, 100, 625, 450);
		
		for(int i=0; i<drink2.length; i++) {
			
			//drink2버튼
			jb2[i] = new JButton(drink2[i]);
			if(i<3) {
				jb2[i].setBounds(60+i*200, 30, 100, 100);
			}else {
				jb2[i].setBounds(60+(i-3)*200, 250, 100, 100);
			}
			
			//메뉴 이미지
			icon2[i] = new ImageIcon("src/img/s"+i+".png");
			jb2[i].setIcon(icon2[i]);
			
			//메뉴 이름
			tit2[i] = new JLabel(drink2[i]);
			tit2[i].setEnabled(false);
			tit2[i].setBounds(jb2[i].getX()+17, jb2[i].getY()+115, 130, 20);
			
			//tf2
			tf2[i] = new TextField("0");
			tf2[i].setBackground(new Color(255, 204, 255));
			tf2[i].setEditable(false);
			tf2[i].setBounds(jb2[i].getX()+32, jb2[i].getY()+140, 30, 20);
			
			//- 버튼
			minus2[i] = new JButton("-");
			minus2[i].setBounds(jb2[i].getX()+7, tf2[i].getY(), 20, 20);
			
			//+ 버튼
			plus2[i] = new JButton("+");
			plus2[i].setBounds(jb2[i].getX()+67, tf2[i].getY(), 20, 20);
			
			//가격
			lb2[i] = new JLabel(money2[i]+"원");
			lb2[i].setBounds(jb2[i].getX()+27, jb2[i].getY()+95, 100, 20);
			
			//체크 버튼
			check2[i] = new JButton("확인");
			check2[i].setBounds(jb2[i].getX(), tf2[i].getY()+30, 100, 20);
			check2[i].setEnabled(false);
			
			menuTwo.add(jb2[i]);
			menuTwo.add(tit2[i]);
			menuTwo.add(tf2[i]);
			menuTwo.add(minus2[i]);
			menuTwo.add(plus2[i]);
			menuTwo.add(lb2[i]);
			menuTwo.add(check2[i]);
		}
		
		//전체 패널에 menuTwo 부착
		add(menuTwo);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuOne.setVisible(false);
				menuTwo.setVisible(true);
				menuThree.setVisible(false);
				menuFour.setVisible(false);
			}
		});
		//menuTwo 조정 완료
		
		//menuThree 조정 시작
		menuThree = new JPanel();
		menuThree.setLayout(null);
		menuThree.setBackground(Color.WHITE);
		menuThree.setBounds(0, 100, 625, 450);
		
		for(int i=0; i<drink3.length; i++) {
			
			//drink3버튼
			jb3[i] = new JButton(drink3[i]);
			if(i<3) {
				jb3[i].setBounds(60+i*200, 30, 100, 100);
			}else {
				jb3[i].setBounds(60+(i-3)*200, 250, 100, 100);
			}
			
			//메뉴 이미지
			icon3[i] = new ImageIcon("src/img/c"+i+".png");
			jb3[i].setIcon(icon3[i]);
			
			//메뉴 이름
			tit3[i] = new JLabel(drink3[i]);
			tit3[i].setEnabled(false);
			tit3[i].setBounds(jb3[i].getX()+17, jb3[i].getY()+115, 130, 20);
			
			//tf3
			tf3[i] = new TextField("0");
			tf3[i].setBackground(new Color(255, 204, 255));
			tf3[i].setEditable(false);
			tf3[i].setBounds(jb3[i].getX()+32, jb3[i].getY()+140, 30, 20);
			
			//- 버튼
			minus3[i] = new JButton("-");
			minus3[i].setBounds(jb3[i].getX()+7, tf3[i].getY(), 20, 20);
			
			//+ 버튼
			plus3[i] = new JButton("+");
			plus3[i].setBounds(jb3[i].getX()+67, tf3[i].getY(), 20, 20);
			
			//가격
			lb3[i] = new JLabel(money3[i]+"원");
			lb3[i].setBounds(jb3[i].getX()+27, jb3[i].getY()+95, 100, 20);
			
			//체크 버튼
			check3[i] = new JButton("확인");
			check3[i].setBounds(jb3[i].getX(), tf3[i].getY()+30, 100, 20);
			check3[i].setEnabled(false);
			
			menuThree.add(jb3[i]);
			menuThree.add(tit3[i]);
			menuThree.add(tf3[i]);
			menuThree.add(minus3[i]);
			menuThree.add(plus3[i]);
			menuThree.add(lb3[i]);
			menuThree.add(check3[i]);
		}
		
		//전체 패널에 menuThree 부착
		add(menuThree);
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuOne.setVisible(false);
				menuTwo.setVisible(false);
				menuThree.setVisible(true);
				menuFour.setVisible(false);
			}
		});
		//menuThree 조정 완료
		
		//menuFour 조정 시작
		menuFour = new JPanel();
		menuFour.setLayout(null);
		menuFour.setBackground(Color.WHITE);
		menuFour.setBounds(0, 100, 625, 450);
		
		for(int i=0; i<food.length; i++) {
			
			//food버튼
			jb4[i] = new JButton(food[i]);
			if(i<3) {
				jb4[i].setBounds(60+i*200, 30, 100, 100);
			}else {
				jb4[i].setBounds(60+(i-3)*200, 250, 100, 100);
			}
			
			//메뉴 이미지
			icon4[i] = new ImageIcon("src/img/f"+i+".png");
			jb4[i].setIcon(icon4[i]);
			
			//메뉴 이름
			tit4[i] = new JLabel(food[i]);
			tit4[i].setEnabled(false);
			tit4[i].setBounds(jb4[i].getX()+17, jb4[i].getY()+115, 130, 20);
			
			//tf4
			tf4[i] = new TextField("0");
			tf4[i].setBackground(new Color(255, 204, 255));
			tf4[i].setEditable(false);
			tf4[i].setBounds(jb4[i].getX()+32, jb4[i].getY()+140, 30, 20);
			
			//- 버튼
			minus4[i] = new JButton("-");
			minus4[i].setBounds(jb4[i].getX()+7, tf4[i].getY(), 20, 20);
			
			//+ 버튼
			plus4[i] = new JButton("+");
			plus4[i].setBounds(jb4[i].getX()+67, tf4[i].getY(), 20, 20);
			
			//가격
			lb4[i] = new JLabel(money4[i]+"원");
			lb4[i].setBounds(jb4[i].getX()+27, jb4[i].getY()+95, 100, 20);
			
			//체크 버튼
			check4[i] = new JButton("확인");
			check4[i].setBounds(jb4[i].getX(), tf4[i].getY()+30, 100, 20);
			check4[i].setEnabled(false);
			
			menuFour.add(jb4[i]);
			menuFour.add(tit4[i]);
			menuFour.add(tf4[i]);
			menuFour.add(minus4[i]);
			menuFour.add(plus4[i]);
			menuFour.add(lb4[i]);
			menuFour.add(check4[i]);
		}
		
		//전체 패널에 menuFour 부착
		add(menuFour);
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuOne.setVisible(false);
				menuTwo.setVisible(false);
				menuThree.setVisible(false);
				menuFour.setVisible(true);
			}
		});
		//menuFour 조정 완료
		
		//장바구니 목록
		JTextArea ta = new JTextArea();
		ta.setText("    상품명         단가         수량         합계\n\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setBounds(0, 560, 625, 140);
		
		//장바구니 목록 스크롤
		JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setBounds(0, 560, 625, 140);
		
		//장바구니 목록 & 스크롤 부착
		add(ta);
		add(sp);
		
		//downPanel 조정
		downPanel = new JPanel();
		downPanel.setLayout(null);
		downPanel.setBounds(0, 700, 625, 100);
		downPanel.setBackground(new Color(78, 36, 138));
		
		//전체 패널에 downPanel 부착
		add(downPanel);
		
		//이전버튼
		JButton cancle = new JButton("이전");
		cancle.setBounds(100, 20, 100, 50);
		
		//이전버튼 downPanel에 부착
		downPanel.add(cancle);
		
		//이전버튼 누르면 초기화면으로 돌아간다.
		cancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "초기화면으로 돌아갑니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
				mc.change("firstPanel");
			}
		});
		
		//초기화버튼
		JButton reset = new JButton("초기화");
		reset.setBounds(270, 20, 100, 50);
		
		//초기화버튼 downPanel에 부착
		downPanel.add(reset);
		
		//초기화버튼 누르면 장바구니 목록 초기화
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<drink1.length; i++) {
					jb1[i].setEnabled(true);
					plus1[i].setEnabled(false);
					minus1[i].setEnabled(false);
					tf1[i].setText("0");
				}
				for(int i=0; i<drink2.length; i++) {
					jb2[i].setEnabled(true);
					plus2[i].setEnabled(false);
					minus2[i].setEnabled(false);
					tf2[i].setText("0");
				}
				for(int i=0; i<drink3.length; i++) {
					jb3[i].setEnabled(true);
					plus3[i].setEnabled(false);
					minus3[i].setEnabled(false);
					tf3[i].setText("0");
				}
				for(int i=0; i<food.length; i++) {
					jb4[i].setEnabled(true);
					plus4[i].setEnabled(false);
					minus4[i].setEnabled(false);
					tf4[i].setText("0");
				}
				ta.setText("\t상품명 \t가격 \t수량 \t합계\n\n");
			}
		});
		
		//결제버튼
		JButton result = new JButton("결제");
		result.setBounds(440, 20, 100, 50);
		
		//결제버튼 downPanel에 부착
		downPanel.add(result);
		
		//결제버튼 누르면 장바구니 초기화 및 결제 완료 안내창
		result.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ta.getText(), "결제가 완료되었습니다.", JOptionPane.INFORMATION_MESSAGE);
				for(int i=0; i<drink1.length; i++) {
					jb1[i].setEnabled(true);
					plus1[i].setEnabled(false);
					minus1[i].setEnabled(false);
					tf1[i].setText("0");
				}
				for(int i=0; i<drink2.length; i++) {
					jb2[i].setEnabled(true);
					plus2[i].setEnabled(false);
					minus2[i].setEnabled(false);
					tf2[i].setText("0");
				}
				for(int i=0; i<drink3.length; i++) {
					jb3[i].setEnabled(true);
					plus3[i].setEnabled(false);
					minus3[i].setEnabled(false);
					tf3[i].setText("0");
				}
				for(int i=0; i<food.length; i++) {
					jb4[i].setEnabled(true);
					plus4[i].setEnabled(false);
					minus4[i].setEnabled(false);
					tf4[i].setText("0");
				}
				ta.setText("\t상품명 \t가격 \t수량 \t합계\n\n");
			}
		});
		
		//버튼 이벤트 정리 시작
		//jb1, jb2, jb3, jb4버튼 기능 정리 시작
		for(int i=0; i<drink1.length; i++) {
			int j = i;
			jb1[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					plus1[j].setEnabled(true);
					minus1[j].setEnabled(true);
					jb1[j].setEnabled(false);
					check1[j].setEnabled(true);
					
					total = 0;
				}
			});
		}
		for(int i=0; i<drink2.length; i++) {
			int j = i;
			jb2[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					plus2[j].setEnabled(true);
					minus2[j].setEnabled(true);
					jb2[j].setEnabled(false);
					check2[j].setEnabled(true);
					
					total = 0;
				}
			});
		}
		for(int i=0; i<drink3.length; i++) {
			int j = i;
			jb3[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					plus3[j].setEnabled(true);
					minus3[j].setEnabled(true);
					jb3[j].setEnabled(false);
					check3[j].setEnabled(true);
					
					total = 0;
				}
			});
		}
		for(int i=0; i<food.length; i++) {
			int j = i;
			jb4[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					plus4[j].setEnabled(true);
					minus4[j].setEnabled(true);
					jb4[j].setEnabled(false);
					check4[j].setEnabled(true);
					
					total = 0;
				}
			});
		}
		//jb1, jb2, jb3, jb4버튼 기능 정리 완료
		
		//+버튼 기능 정리 시작
		for(int i=0; i<drink1.length; i++) {
			int j = i;
			plus1[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					total = total + 1;
					tf1[j].setText(total + "");
					check1[j].setEnabled(true);
					if(total>0) {
						minus1[j].setEnabled(true);
					}
					
				}
			});
		}
		for(int i=0; i<drink2.length; i++) {
			int j = i;
			plus2[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					total = total + 1;
					tf2[j].setText(total + "");
					check2[j].setEnabled(true);
					if(total>0) {
						minus2[j].setEnabled(true);
					}
					
				}
			});
		}
		for(int i=0; i<drink3.length; i++) {
			int j = i;
			plus3[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					total = total + 1;
					tf3[j].setText(total + "");
					check3[j].setEnabled(true);
					if(total>0) {
						minus3[j].setEnabled(true);
					}
					
				}
			});
		}
		for(int i=0; i<food.length; i++) {
			int j = i;
			plus4[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					total = total + 1;
					tf4[j].setText(total + "");
					check4[j].setEnabled(true);
					if(total>0) {
						minus4[j].setEnabled(true);
					}
					
				}
			});
		}
		//+버튼 기능 정리 완료
		
		//-버튼 기능 정리 시작
		for(int i=0; i<drink1.length; i++) {
			int j = i;
			minus1[j].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(total>0) {
						total = total-1;
						tf1[j].setText(total + "");
						check1[j].setEnabled(true);
					}else {
						minus1[j].setEnabled(false);
					}
					
				}
			});
		}
		for(int i=0; i<drink2.length; i++) {
			int j = i;
			minus2[j].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(total>0) {
						total = total-1;
						tf2[j].setText(total + "");
						check2[j].setEnabled(true);
					}else {
						minus2[j].setEnabled(false);
					}
					
				}
			});
		}
		for(int i=0; i<drink3.length; i++) {
			int j = i;
			minus3[j].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(total>0) {
						total = total-1;
						tf3[j].setText(total + "");
						check3[j].setEnabled(true);
					}else {
						minus3[j].setEnabled(false);
					}
					
				}
			});
		}
		for(int i=0; i<food.length; i++) {
			int j = i;
			minus4[j].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(total>0) {
						total = total-1;
						tf4[j].setText(total + "");
						check4[j].setEnabled(true);
					}else {
						minus4[j].setEnabled(false);
					}
					
				}
			});
		}
		//-버튼 기능 정리 완료
		
		//확인 버튼 기능 정리 시작
		for(int i=0; i<drink1.length; i++) {
			int j = i;
			check1[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					show = jb1[j].getActionCommand();
					ta.append("   " + show + "       " + money1[j] + "        " + total + "         " + money1[j] * total + "원" + "\n");
					check1[j].setEnabled(false);
				}
			});
		}
		for(int i=0; i<drink2.length; i++) {
			int j = i;
			check2[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					show = jb2[j].getActionCommand();
					ta.append("   " + show + "       " + money2[j] + "        " + total + "         " + money2[j] * total + "원" + "\n");
					check2[j].setEnabled(false);
				}
			});
		}
		for(int i=0; i<drink3.length; i++) {
			int j = i;
			check3[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					show = jb3[j].getActionCommand();
					ta.append("   " + show + "       " + money3[j] + "        " + total + "         " + money3[j] * total + "원" + "\n");
					check3[j].setEnabled(false);
				}
			});
		}
		for(int i=0; i<food.length; i++) {
			int j = i;
			check4[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					show = jb4[j].getActionCommand();
					ta.append("   " + show + "       " + money4[j] + "        " + total + "         " + money4[j] * total + "원" + "\n");
					check4[j].setEnabled(false);
				}
			});
		}
		//확인버튼 기능 정리 완료
		
		
		
	}
}
