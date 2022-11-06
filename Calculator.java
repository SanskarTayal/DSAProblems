
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
public class Calculator implements ActionListener {
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons= new JButton[10];
	JButton[] functionButtons= new JButton[8];
	JButton addButton,subButton,mulButton,divButton,decButton,equButton,delButton,clrButton,nveButton;
	JPanel panel;
	ImageIcon img;
	Font myFont= new Font("Ink Free",Font.BOLD,30);
	double num1=0,num2=0,result=0;
	char operator;
	Calculator(){
		img=new ImageIcon("icon.png");
		frame= new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		frame.setIconImage(img.getImage());
		textfield= new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("x");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		clrButton = new JButton("C");
		delButton = new JButton("<-");
		nveButton= new JButton("(-)");
		functionButtons[0]=addButton;
		functionButtons[1]=subButton;
		functionButtons[2]=mulButton;
		functionButtons[3]=divButton;
		functionButtons[4]=decButton;
		functionButtons[5]=equButton;
		functionButtons[6]=clrButton;
		functionButtons[7]=delButton;
		for(int i=0;i<8;i++)
		{
			functionButtons[i].setFont(myFont);
			functionButtons[i].addActionListener(this);
			//functionButtons[i].setFocusable(false);		
		}
		for(int i=0;i<10;i++)
		{
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].setFont(myFont);
			numberButtons[i].addActionListener(this);
			
		}
		nveButton.addActionListener(this);
		nveButton.setFont(myFont);
		nveButton.setBounds(50, 430, 100, 50);
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);
		
		panel=new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		panel.setBackground(null);
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(nveButton);
		panel.setBackground(null);
		frame.add(textfield);
		frame.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		Calculator calc= new Calculator(); 
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==numberButtons[i])
			{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
		}
		if(e.getSource()==decButton)
			textfield.setText(textfield.getText().concat("."));
		if(e.getSource()==addButton) {
				num1=Double.parseDouble(textfield.getText());
				textfield.setText("");
				operator='+';
				}
		if(e.getSource()==subButton) {
			num1=Double.parseDouble(textfield.getText());
			textfield.setText("");
			operator='-';
			}
		if(e.getSource()==divButton) {
			num1=Double.parseDouble(textfield.getText());
			textfield.setText("");
			operator='/';
			}
		if(e.getSource()==mulButton) {
			num1=Double.parseDouble(textfield.getText());
			textfield.setText("");
			operator='x';
			}
		if(e.getSource()==clrButton) {
			num1=Double.parseDouble(textfield.getText());
			textfield.setText("");
			num1=0;
			num2=0;
			}
		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textfield.getText());
			switch(operator) {
			case('+'):
				result=num1+num2;
				break;
			case('-'):
				result=num1-num2;
				break;
			case('/'):
				result=num1/num2;
				break;
			case('x'):
				result=num1*num2;
				break;
			default:
				result=num1;
				break;
			
			}
			textfield.setText(String.valueOf(result));
			}
		if(e.getSource()==delButton) {
			String st=textfield.getText();
			textfield.setText("");
			for(int i=0;i<st.length()-1;i++)
			{
				textfield.setText(textfield.getText()+st.charAt(i));
			}
		
		}
		if(e.getSource()==nveButton) {
			String st=textfield.getText();
			Double temp= Double.parseDouble(st);
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		
	}

}
}
