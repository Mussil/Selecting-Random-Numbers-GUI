
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;



public class MyFrame extends JFrame {

	private JButton parta;
	private JButton partb;
	private JButton partc;
	private JButton partd;

	
	private JLabel labela;
	private JLabel labelb;
	private JLabel labelb2;

	private JLabel labelc;
	private JLabel labeld;
	private JLabel labeld2;

	private Random rand=new Random();
	
	public MyFrame(){
		super("Random");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel text=new JLabel("click for random problems");
		text.setBounds(90,15,300,40); 
		text.setFont(new Font("Ariel", Font.BOLD, 24));
		text.setForeground(Color.red);

		add(text);
		
		parta=new JButton("part a");
		parta.setBounds(20,60,100,40);  
		add(parta);
		

		
		partb=new JButton("part b");
		partb.setBounds(140,60,100,40);  
		add(partb);
		
		
		partc=new JButton("part c");
		partc.setBounds(260,60,100,40);  
		add(partc);
		
		
		partd=new JButton("part d");
		partd.setBounds(380,60,100,40);  
		add(partd);
		
		
		
		labela=new JLabel("0");
		labela.setBounds(50,110,100,40);  
		labela.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labela);
		
		
		labelb=new JLabel("0");
		labelb.setBounds(170,110,100,40);  
		labelb.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labelb);
		
		labelb2=new JLabel("0");
		labelb2.setBounds(170,150,100,40);  
		labelb2.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labelb2);
		
		
		labelc=new JLabel("0");
		labelc.setBounds(290,110,100,40);  
		labelc.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labelc);
		
		
		
		labeld=new JLabel("0");
		labeld.setBounds(410,110,100,40);  
		labeld.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labeld);
		
		labeld2=new JLabel("0");
		labeld2.setBounds(410,150,100,40);  
		labeld2.setFont(new Font("Ariel", Font.BOLD, 18));
		add(labeld2);
		
		
		parta.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	int min=1;
	        	int max=5;
	        	int range = max - min + 1;
	        	int randomNum =  rand.nextInt(range) + min;
	        	
	            labela.setText(String.valueOf(randomNum));

	        }  
	    });  
		
		
		partb.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	int min=6;
	        	int max=13;
	        	int range = max - min + 1;
	        	int randomNum =  rand.nextInt(range) + min;
	        	int randomNum2 =  rand.nextInt(range) + min;

	            labelb.setText(String.valueOf(randomNum));
	            labelb2.setText(String.valueOf(randomNum2));


	        }  
	    });  
		
		
		partc.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	int min=14;
	        	int max=17;
	        	int range = max - min + 1;
	        	int randomNum =  rand.nextInt(range) + min;
	        	
	            labelc.setText(String.valueOf(randomNum));

	        }  
	    }); 
		
		
		
		partd.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	int min=18;
	        	int max=25;
	        	int range = max - min + 1;
	        	int randomNum =  rand.nextInt(range) + min;
	        	int randomNum2 =  rand.nextInt(range) + min;

	            labeld.setText(String.valueOf(randomNum));
	            labeld2.setText(String.valueOf(randomNum2));


	        }  
	    });  
		
		
		setLayout(null);
		setSize(550,300);
		setResizable(true);
		//pack();
		setVisible(true);
	}
		
		
	public static void main(String[] args) {
		new MyFrame();

	}
		
}
