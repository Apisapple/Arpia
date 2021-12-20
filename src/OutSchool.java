import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OutSchool extends JFrame{

	static JPanel p=new JPanel() 
	{
		Image background=new ImageIcon(StartPage.class.getResource("/background/학교 지도 2.png")).getImage();
		
		//Image change = background.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
		public void paint(Graphics g)
		{//그리는 함수
				g.drawImage(background, 0, 0, null);//background를 그려줌		
		}
	};	
	
	JButton btn;
	ImageIcon intoSchoolBtn = new ImageIcon("./Icon/image_89.png");
	ImageIcon character = new ImageIcon("/Icon/firegirl_idle-chkoosi.gif");
	
	public OutSchool()
	{
		setTitle("학교 바깥");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 650);
		p.setLayout(null);
		
		btn = new JButton(intoSchoolBtn);
		btn.setBorderPainted(false);
		p.add(btn);
		btn.setBounds(450, 250, 100, 50);
		
		add(p);
		setVisible(true);
		
	}
}
