package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JFrame implements ActionListener  {
	JPanel jp = new JPanel();
	
	JButton jb = new JButton("Ȯ��");
	String radio_name[] = {"����", "����", "��"};
	
	JLabel title = new JLabel("���������� ����");
	JLabel subTitle = new JLabel("��ǻ�͸� �̰ܶ�");
	
	JLabel winLabel = new JLabel("");
	
	JRadioButton radio[] = new JRadioButton[3];
	
	public Game() {
		setTitle("���������� ����");
		
		jp.setLayout(new FlowLayout());
		
		jp.add(title);
		jp.add(subTitle);
		
		ButtonGroup group = new ButtonGroup();
		for(int i=0; i<radio.length; i++){
            radio[i] = new JRadioButton(radio_name[i]);
            group.add(radio[i]);
            jp.add(radio[i]);
        }
		
		jb.addActionListener(this);
		
		jp.add(winLabel);
		
		jp.add(jb);
		add(jp);
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(radio[0].isSelected()){
			this.winCheck(0);
        }else if(radio[1].isSelected()){
        	this.winCheck(1);
        }else if(radio[2].isSelected()){
        	this.winCheck(2);
        }
	}
	
	private void winCheck(int player) {
		int AI = (int)(Math.random() * 3);
		int winToken = player + 1 > 2 ? 0 : player + 1;
		int loseToken = player - 1 < 0 ? 2 : player - 1;
		if(player == AI) {
			winLabel.setText("Draw");
		}else if (winToken == AI){
			winLabel.setText("You Win");
		}else if (loseToken == AI){
			winLabel.setText("You Lose");
		}
	}
	
	public static void main(String[] args) {
		new Game();
	}
}