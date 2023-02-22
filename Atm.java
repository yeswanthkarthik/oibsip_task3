import java.util.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Atm extends Frame implements ActionListener
{
String str="";
Label l3=new Label("Transaction History");
TextArea ta=new TextArea();
Button th=new Button("Transaction History");
Button w=new Button("Withdraw");
Button d=new Button("Deposit");
Button tr=new Button("Transfer");
Button q=new Button("Quit");
TextField t=new TextField();
TextField t1=new TextField();
Label l=new Label("User Id");
Label l1=new Label("User Pin");	
Label l2=new Label("your credentials are updated successfully.\n Further process click on continue.");
Button b1=new Button("Cancel");
Button b3=new Button("Continue");
Button b2=new Button("Login");
void m1()
{	
add(l);
add(l1);
add(t);
add(t1);
add(b1);
add(b2);
add(b3);
b1.setBounds(80,210,60,30);
b2.setBounds(200,210,60,30);
b3.setBounds(140,330,60,30);
l.setBounds(50,80,60,50);
l1.setBounds(50,140,60,50);
t.setBounds(120,85,150,30);
t1.setBounds(120,145,150,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setTitle("Atm Interface");
setSize(450,450);
setLayout(new BorderLayout());
setBackground(Color.yellow);
setVisible(true);
}
class Mode extends Atm
{
	public  void m2()
	{
		add(th);
		add(w);
		add(d);
		add(tr);
		add(q);
		add(ta);
		add(l3);
		w.addActionListener(this);
		d.addActionListener(this);
		q.addActionListener(this);
		tr.addActionListener(this);
		th.addActionListener(this);
		th.setBounds(50,80,120,30);
		w.setBounds(230,80,100,30);
		d.setBounds(50,200,100,30);
		tr.setBounds(230,200,100,30);
		q.setBounds(140,290,100,30);
		ta.setBounds(60,360,300,80);
		l3.setBounds(150,333,150,30);
		setSize(450,450);
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);
		setTitle("Modes");
        setVisible(true);
	}
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b2)
	{
      add(l2);
      l2.setBounds(30,270,400,30);
	}
	else if(e.getSource()==b3)
	{
		Mode m=new Mode();
		m.m2();
	}
	else if(e.getSource()==w)
	    {
		String n=JOptionPane.showInputDialog("Enter Amount");
		int num=Integer.parseInt(n);
		if(num<500)
		{
			JOptionPane.showMessageDialog(null,"You can withdraw above 500","Error",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    JOptionPane.showMessageDialog(null,"Your amount is being processed.\n please wait few seconds..","Message",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"your amount is debited.\n please collect...","Message",JOptionPane.INFORMATION_MESSAGE);
			str=str+"\n"+num+" is debited from your account";
		}		
		}
    else if(e.getSource()==d)
	{
     String am=JOptionPane.showInputDialog("Enter amount to Deposit");
     int amount=Integer.parseInt(am);
     JOptionPane.showMessageDialog(null,amount+" is deposited to your account successfully","Message",JOptionPane.INFORMATION_MESSAGE);
     str=str+"\n"+amount+" is deposited to your account successfully";	 
    }
    else if(e.getSource()==tr)
	{
    String ac=JOptionPane.showInputDialog("Account number to transfer");
    int val=Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
    JOptionPane.showMessageDialog(null,val+" is transfered to account "+ac+" successfully","Message",JOptionPane.INFORMATION_MESSAGE);
    str=str+"\n"+val+" is transfered to account "+ac+" successfully";	
	}
	else if(e.getSource()==th)
	{
		ta.setText(str);
	}
	else if(e.getSource()==q)
	{
		System.exit(0);
	}
	else if(e.getSource()==b1)
	{
		System.exit(0);
	}
}
public static void main(String ar[])
{
Atm a=new Atm();
a.m1();
}
}
