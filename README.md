# 스무디킹 키오스크

## 개발 인원
총 1명(백엔드 1명 - 개인 프로젝트)

## 프로젝트 소개
IT전문교육기관에서 웹&앱개발 교육 중 GUI를 개발하는 단체 프로젝트를 진행했었습니다. 첫 단체 프로젝트이다보니 부족한 부분이 많았고, 완성도가 높지 않아 스스로 만족스럽지 않았습니다. 그래서 부족한 부분을 보완하고자 개인 GUI 개발 프로젝트를 진행하였습니다. 일상생활에서 많이 사용되는 GUI를 고민하다가 키오스크를 떠올렸고, 카페를 주제로 삼아 스무디킹 키오스크 GUI개발을 선택하게 되었습니다.

## 프로젝트 기간
2023. 03 ~ 2023. 03 (2주 소요)

## Stack
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=white" />

------
### 1. 배너화면
<img width="619" alt="스크린샷 2023-08-02 오후 4 12 54" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/02abe44d-3f4f-4568-9283-10ffb4a824da">

```
// 기능구현
// 매장버튼
order1.addActionListener(new ActionListener() {
  
  @Override
  public void actionPerformed(ActionEvent e) {
    mc.change("here");
    
  }
});

// 포장버튼
order2.addActionListener(new ActionListener() {
  
  @Override
  public void actionPerformed(ActionEvent e) {
    mc.change("takeout");
  }
});
```

```
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
```

* **매장**, **포장**버튼을 누르면 **change()함수**가 실행되면서 **menuPanel**이 보이도록 기능을 구현하였다.
------
### 2. 메뉴
#### menuPanel 코드

```
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
		ta.setText("    " + "상품명" + "        " + "가격" + "         " + "수량" + "          " + "합계" + "\n");
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
				JOptionPane.showMessageDialog(null, "장바구니가 초기화됩니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
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
				ta.setText("    " + "상품명" + "        " + "가격" + "         " + "수량" + "          " + "합계" + "\n");
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
				ta.setText("    " + "상품명" + "        " + "가격" + "         " + "수량" + "          " + "합계" + "\n");
			}
				mc.change("firstPanel");
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
```

<img width="619" alt="스크린샷 2023-08-02 오후 4 28 52" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/25782ebb-6d36-4fb9-a38d-21624677c45d">
<br>
<img width="619" alt="스크린샷 2023-08-02 오후 4 29 24" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/2a832e7e-e501-40a6-b323-29762b1324d7">
<br>
<img width="619" alt="스크린샷 2023-08-02 오후 4 29 53" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/29b4f256-ad93-4b04-bc1b-27caca931fff">
<br>
<img width="619" alt="스크린샷 2023-08-02 오후 4 31 02" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/571df7dc-68e8-4a15-8963-66823e65b259">

* **메뉴이미지, 메뉴이름, 가격, +, -, 수량, 확인** 을 모두 **배열**로 정리
* **FITNESS스무디, FRUIT스무디, COFFEE&TEA, FOOD 버튼**을 누르면 해당 음료 및 음식이 나오도록 기능 구현

<img width="619" alt="스크린샷 2023-08-02 오후 10 46 29" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/3a9dbbfd-d03e-439a-944d-da87f3f4f382">

* 메뉴이미지를 누르면 **+, -, 수량, 확인**이 활성화된다.
* **확인**을 누르면 메뉴이름, 가격, 수량, 합계금액이 **장바구니**에 나타난다.

<img width="619" alt="스크린샷 2023-08-02 오후 10 53 23" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/ba241512-64af-4ee5-88ed-1885a686e568">

* **이전**을 누르면 **"초기화면으로 돌아갑니다"라는 안내창**이 뜨면서, 배너화면으로 돌아간다.

<img width="619" alt="스크린샷 2023-08-02 오후 11 00 38" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/5e13b2c6-b403-4fdb-9e8a-a5985da818ce">
<br>
<img width="619" alt="스크린샷 2023-08-02 오후 11 05 14" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/e18a1c22-0e56-4433-bedb-a2d9c44c98bd">

* **초기화**를 누르면 **"장바구니가 초기화됩니다."라는 안내창**이 뜨면서, 장바구니에 들어있던 메뉴가 모두 사라진다.

<img width="619" alt="스크린샷 2023-08-02 오후 11 06 53" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/42a1b669-a375-4cd9-8053-e32cdf2b9b9f">

* **결제**를 누르면 **"결제가 완료되었습니다."라는 안내창**이 뜨면서 주문한 메뉴이름, 가격, 수량, 합계금액이 나타난다.
* **확인**을 누르면 초기화면인 배너화면으로 돌아간다.
------
### 3. 회고
* JavaSwing을 통해 kiosk가 만들어지는 과정을 알게되었다.
* 하나의 생성자 안에 코드를 한꺼번에 입력하여 코드의 가독성이 떨어진다는 점이 아쉽다. 메서드를 활용해 menu종류별로 코드를 분리했다면 코드의 가독성이 더 좋지 않았을까 생각된다.
* 디자인 요소를 추가하면 더 완성도있는 CafeKiosk가 될 것이라 기대한다.
