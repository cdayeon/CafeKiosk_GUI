# CafeKiosk_GUI
### 천다연 개인 프로젝트
### 프로젝트 기간 : 2023. 07. 13 ~ 2023. 07. 27
### 사용한 기술 스택 : java
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

* **매장**,**포장**버튼을 누르면 **change()함수**가 실행되면서 menuPanel이 보이도록 기능을 구현하였다.
