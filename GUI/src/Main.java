import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Whats your age?"));
		JOptionPane.showMessageDialog(null, "You are "+age+" Years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height(In cm)"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall.");
		
		
		
	}

}