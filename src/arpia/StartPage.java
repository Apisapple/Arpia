package arpia;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartPage extends JFrame {

  JButton startBtn;
  JButton finBtn;

  static JPanel p = new JPanel() {



    Image background =
        new ImageIcon(StartPage.class.getResource("/arpia/img/background/시작 화면 2.png")).getImage();


    // Image change = background.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
    public void paint(Graphics g) {// �׸��� �Լ�
      g.drawImage(background, 0, 0, null);// background�� �׷���
    }
  };


  public StartPage() {

    setTitle("Arpia");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(850, 650);
    // JPanel p = new JPanel();
    // p.setPreferredSize(new Dimension(1000, 800));
    // p.setSize(1000, 800);
    p.setLayout(null);

    startBtn = new JButton("Game Start");
    finBtn = new JButton("Finish");
    startBtn.setBounds(350, 300, 100, 50);
    finBtn.setBounds(350, 400, 100, 50);
    p.add(startBtn);
    p.add(finBtn);
    add(p);
    setVisible(true);

    startBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new OutSchool();
        setVisible(false);
      }
    });
  }

}
