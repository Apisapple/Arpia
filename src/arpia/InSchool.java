package arpia;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InSchool extends JFrame {

	InSchool() {
		this.setTitle("Arpia");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(850, 650);
		this.setLayout(null);

		setContentPane(new JLabel(new ImageIcon("src/background/�б�����.png")));
		this.setVisible(true);
	}

}
