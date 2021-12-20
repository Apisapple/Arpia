import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartPage extends JFrame{
	
	static JPanel p=new JPanel() 
	{
		Image background=new ImageIcon(StartPage.class.getResource("/background/시작 화면 2.png")).getImage();
		
		//Image change = background.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
		public void paint(Graphics g) 
		{//그리는 함수
				g.drawImage(background, 0, 0, null);//background를 그려줌		
		}
	};	
	
	JButton startBtn;
	JButton finBtn;
	
	public StartPage()
	{
		setTitle("Arpia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 650);
		//JPanel p = new JPanel();
		//p.setPreferredSize(new Dimension(1000, 800));
		//p.setSize(1000, 800);
		p.setLayout(null);
		
		startBtn = new JButton("Game Start");
		p.add(startBtn);
		finBtn = new JButton("Finish");
		p.add(finBtn);
		
		startBtn.setBounds(350, 300, 100, 50);
		finBtn.setBounds(350, 400, 100, 50);
		add(p);
		setVisible(true);
		
		 startBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new OutSchool();
	                setVisible(false); // 창 안보이게 하기 
	            }
	        });
	}

}
