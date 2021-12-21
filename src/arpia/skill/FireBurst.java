package arpia.skill;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FireBurst implements SkillInterFace {
	private final ImageIcon effectImg = new ImageIcon(
			"./src/arpia/img/attack/skill_fireburst.png");
	private final ImageIcon btnImg = new ImageIcon(
			"./src/arpia/img/attack/attack_fireburst.png");
	private final JButton skillBtn = new JButton(btnImg);

	@Override
	public JButton setSkillButton() {
		skillBtn.setLocation(550, 500);
		skillBtn.setSize(50, 50);
		skillBtn.setContentAreaFilled(false);
		skillBtn.setBorderPainted(false);
		return skillBtn;
	}

	@Override
	public JLabel setSkillLabel() {
		JLabel skillLabel = new JLabel();
		skillLabel.setIcon(effectImg);
		skillLabel.setSize(200, 70);
		skillLabel.setLocation(125, 410);
		return skillLabel;
	}
	
	public ImageIcon getEffectImg() {
		return effectImg;
	}

	public ImageIcon getButtonImg() {
		return btnImg;
	}

	public JButton getButton() {
		return skillBtn;
	}
}
