package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> savedNums = new Stack<String>();
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		TextUndoRedo runner = new TextUndoRedo();
		runner.run();
	}
	public void run() {
		frame.add(panel);
		panel.add(label);
		label.setVisible(true);
		label.setText("Press Keys!");
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode() == 8) {
			savedNums.push(label.getText().substring(label.getText().length(),label.getText().length()));
			System.out.println(e.getKeyCode());
		} else {
		label.setText(label.getText() + e.getKeyChar());
		frame.pack();
		System.out.println(e.getKeyCode());
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
