import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener { 
	
	Random random        = new Random();
	JFrame frame         = new JFrame();
	JPanel title_Panel   = new JPanel();
	JPanel button_Panel  = new JPanel();
	JLabel textfield     = new JLabel(); 
	JButton[] buttons    = new JButton[9];
	boolean player1_turn;
	
	

	TicTacToe(){
		
		//ALL frame work done below
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,900);
		frame.getContentPane().setBackground(Color.BLACK);;
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		//..................................................
		
		
		// All TextField designed below
		
		textfield.setBackground(new Color(0,0,0));
		textfield.setForeground(new Color(198, 255, 0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,90));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic--Tac--Toe");
		textfield.setOpaque(true);
		
		//..................................................
		
		// title design here 
		
		title_Panel.setLayout(new BorderLayout());
		title_Panel.setBounds(0, 0,900,120);
		
		//Button designed here
		
		button_Panel.setLayout(new GridLayout(3,3));
		button_Panel.setBackground(Color.BLACK);
		
		for (int i = 0; i<9; i++) {
			buttons[i] = new JButton();
			button_Panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boil",Font.BOLD,120));
			buttons[i].setForeground(Color.black);
			buttons[i].setBackground(Color.black);
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			
			
		}
		
		
		
		title_Panel.add(textfield);
		frame.add(title_Panel,BorderLayout.NORTH);
	    frame.add(button_Panel);
		
	    firstTurn();
	     	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (int i = 0; i<9; i++) {
			if (e.getSource()==buttons[i]) {
				if (player1_turn) {
					if (buttons[i].getText()=="") {
						buttons[i].setForeground(Color.red);
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
						
					}
					
				}
				else {
					if (buttons[i].getText()=="") {
						buttons[i].setForeground(Color.green);
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
				}
			}
		}
	}
		
	}
	public void firstTurn() {
		
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if (random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		}
		else {
			player1_turn=false;
			textfield.setText("O turn");
		}
		
	}
	public void check() {
		 //check x
		if( 
				(buttons[0].getText()=="X")&& 
				(buttons[1].getText()=="X")&&
		        (buttons[2].getText()=="X")
		        ) {
			xWins(0, 1, 2);
		}
		if( 
				(buttons[3].getText()=="X")&& 
				(buttons[4].getText()=="X")&&
		        (buttons[5].getText()=="X")
		        ) {
			xWins(3, 4, 5);
		}
		if( 
				(buttons[6].getText()=="X")&& 
				(buttons[7].getText()=="X")&&
		        (buttons[8].getText()=="X")
		        ) {
			xWins(6, 7, 8);
		}
		if( 
				(buttons[0].getText()=="X")&& 
				(buttons[3].getText()=="X")&&
		        (buttons[6].getText()=="X")
		        ) {
			xWins(0, 3, 6);
		}
		if( 
				(buttons[1].getText()=="X")&& 
				(buttons[4].getText()=="X")&&
		        (buttons[7].getText()=="X")
		        ) {
			xWins(1, 4, 7);
		}
		if( 
				(buttons[2].getText()=="X")&& 
				(buttons[5].getText()=="X")&&
		        (buttons[8].getText()=="X")
		        ) {
			xWins(2,5,8 );
		}
		if( 
				(buttons[0].getText()=="X")&& 
				(buttons[4].getText()=="X")&&
		        (buttons[8].getText()=="X")
		        ) {
			xWins(0, 4, 8);
		}
		if( 
				(buttons[2].getText()=="X")&& 
				(buttons[4].getText()=="X")&&
		        (buttons[6].getText()=="X")
		        ) {
			xWins(2, 4, 6);
		}
		
		//............................................
		
		//check O
		if( 
				(buttons[0].getText()=="O")&& 
				(buttons[1].getText()=="O")&&
		        (buttons[2].getText()=="O")
		        ) {
			oWins(0, 1, 2);
		}
		if( 
				(buttons[3].getText()=="O")&& 
				(buttons[4].getText()=="O")&&
		        (buttons[5].getText()=="O")
		        ) {
			oWins(3, 4, 5);
		}
		if( 
				(buttons[6].getText()=="O")&& 
				(buttons[7].getText()=="O")&&
		        (buttons[8].getText()=="O")
		        ) {
			oWins(6, 7, 8);
		}
		if( 
				(buttons[0].getText()=="O")&& 
				(buttons[3].getText()=="O")&&
		        (buttons[6].getText()=="O")
		        ) {
			oWins(0, 3, 6);
		}
		if( 
				(buttons[1].getText()=="O")&& 
				(buttons[4].getText()=="O")&&
		        (buttons[7].getText()=="O")
		        ) {
			oWins(1, 4, 7);
		}
		if( 
				(buttons[2].getText()=="O")&& 
				(buttons[5].getText()=="O")&&
		        (buttons[8].getText()=="O")
		        ) {
			oWins(2,5,8 );
		}
		if( 
				(buttons[0].getText()=="O")&& 
				(buttons[4].getText()=="O")&&
		        (buttons[8].getText()=="O")
		        ) {
			oWins(0, 4, 8);
		}
		if( 
				(buttons[2].getText()=="O")&& 
				(buttons[4].getText()=="O")&&
		        (buttons[6].getText()=="O")
		        ) {
			oWins(2, 4, 6);
		}
		
	}
	
	//.............................................
	
	public void xWins(int a,int b,int c) {
		buttons[a].setBackground(Color.red);
		buttons[b].setBackground(Color.red);
		buttons[c].setBackground(Color.red);
		
		for (int i = 0; i <9; i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X-wins");
	}
    public void oWins(int a,int b,int c) {
    	buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for (int i = 0; i <9; i++) {
			buttons[i].setEnabled(false);
	   }
		textfield.setText("O-wins");
    }
}
