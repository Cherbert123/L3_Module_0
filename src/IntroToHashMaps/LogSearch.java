package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JPanel panel = new JPanel(); JFrame frame = new JFrame(); JButton Add = new JButton(); JButton remove = new JButton(); JButton search = new JButton(); JButton view = new JButton(); HashMap<Integer, String> map = new HashMap<Integer, String>();public static void main(String[] arg) {LogSearch search = new LogSearch();search.runner();}public void runner() {frame.add(panel);panel.add(Add);panel.add(search);panel.add(view);panel.add(remove);remove.setText("Remove");view.setText("View List");Add.setText("Add Entry");search.setText("Search by ID");frame.pack();frame.setVisible(true);Add.addActionListener(this);view.addActionListener(this);search.addActionListener(this);remove.addActionListener(this);}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Add) {
			map.put(Integer.parseInt(JOptionPane.showInputDialog("Enter an ID Number:")), JOptionPane.showInputDialog("Enter a Name:"));
		}
		if(e.getSource() == view) {
			String list = new String();
			for(Integer i : map.keySet()) {
				list = list + "\n ID: " + i + " Name: " + map.get(i);
			}
			JOptionPane.showMessageDialog(null, "" + list);
		}
		if(e.getSource() == search) {
			JOptionPane.showMessageDialog(null, map.get(Integer.parseInt(JOptionPane.showInputDialog("Enter ID:"))) );
		}
		if(e.getSource() == remove) {
			map.get(Integer.parseInt());
			map.replace(JOptionPane.showInputDialog("Enter ID:"), value)
		}
		
	}
	}


