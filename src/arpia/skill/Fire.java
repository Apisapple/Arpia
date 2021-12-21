package arpia.skill;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Fire implements SkillInterFace {
	private final ImageIcon effectImg = new ImageIcon(
			"./src/arpia/img/attack/skill_fire.png");

	private final ImageIcon btnImg = new ImageIcon(
			"./src/arpia/img/attack/attack_fire.png");

	private final JButton skillBtn = new JButton(btnImg);

	@Override
	public JButton setSkillButton() {
		skillBtn.setLocation(450, 500);
		skillBtn.setSize(50, 50);
		skillBtn.setContentAreaFilled(false);
		skillBtn.setBorderPainted(false);
		return skillBtn;
	}

	@Override
	public JLabel setSkillLabel() {
		JLabel skillLabel = new JLabel();
		skillLabel.setIcon(effectImg);
		skillLabel.setSize(70, 60);
		skillLabel.setLocation(135, 420);
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
