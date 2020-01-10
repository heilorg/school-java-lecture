package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BorderLayoutTest extends JFrame implements ActionListener {
	JPanel jp = new JPanel();
	
	JButton jb1 = new JButton("��ư1");
	JButton jb2 = new JButton("��ư2");
	JButton jb3 = new JButton("��ư3");
	JButton jb4 = new JButton("��ư4");
	JButton jb5 = new JButton("��ư5");
	
	public BorderLayoutTest() {
		super("BorderLayout");
		jp.setLayout(new BorderLayout());
		
		jp.add(jb1, "North");
		jp.add(jb2, "West");
		jp.add(jb3, "South");
		jp.add(jb4, "Center");
		jp.add(jb5, "East");

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		add(jp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //�������̵带 ���ϸ� ����
		if(e.getSource() == jb1) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��1");
		}
		
		if(e.getSource() == jb2) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��2");
		}
		
		if(e.getSource() == jb3) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��3");
		}
		
		if(e.getSource() == jb4) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��4");
		}
		
		if(e.getSource() == jb5) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��5");
		}
	}
}