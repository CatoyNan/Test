package ch;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame{
	private int count;
	private double money;
	private User user;
	private Discount discount;
	private JPanel jp;
	private JButton btn;
	private JTextField txt1,txt2,txt3;
	private JLabel l1,l2,l3,l4;
	private Choice c;
	private Discount1 discount1;
	private Discount2 discount2;
	private Discount3 discount3;
	public Test()
	{
		super("�ۿۼ���");
		user=new User();
		discount1=new Discount1();
		discount2=new Discount2();
		discount3=new Discount3();
		jp=new JPanel();
		btn=new JButton("����");
		txt1=new JTextField(8);
		txt2=new JTextField(8);
		txt3=new JTextField(8);
		c=new Choice();
		c.add("���ۿ�");
		c.add("�̶��ۿ�");
		c.add("�����ۿ�");
		l1=new JLabel("���۷�ʽ:");
		l2=new JLabel("ͼ�鵥��:");
		l3=new JLabel("��������:");
		l4=new JLabel("���");
		jp.add(l1);
		jp.add(c);
		jp.add(l2);
		jp.add(txt1);
		jp.add(l3);
		jp.add(txt2);
		jp.add(l4);
		jp.add(txt3);
		jp.add(btn);
		btn.addActionListener((new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				money=Double.valueOf(txt1.getText());
				count=Integer.parseInt(txt2.getText());
				if(c.getSelectedIndex()==0)
				{	
					txt3.setText(String.valueOf(money*count));
				}
				else if(c.getSelectedIndex()==1)
				{
					
				}
				else if(c.getSelectedIndex()==3)
				{
					
				}
			}
			
		}));
		this.add(jp);
		
		
		this.setSize(480, 320);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] agres)
	{
		new Test();
	}
}
