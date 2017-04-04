//Simple Program that uses a pop-up window to prompt user and return value
// 1-30-17

package cherita;
import javax.swing.JOptionPane;
public class PopUpWindowsEx {

	public static void main(String[] args) {
		String fnum=javax.swing.JOptionPane.showInputDialog("Enter first number");
		String snum=javax.swing.JOptionPane.showInputDialog("Enter second number");
		
		int num1=Integer.parseInt(fnum);
		int num2=Integer.parseInt(snum);
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
		
	}

}
