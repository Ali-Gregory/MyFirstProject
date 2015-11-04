import javax.swing.JOptionPane;


public class Main {

	//This is my main class just to test git

	public static void main(String args[]){
		XmasTree yourTree;
		yourTree = new XmasTree();
		
		int inputLines = Integer.parseInt
				(JOptionPane.showInputDialog("Input number of lines:"));
		
		yourTree.printTree(inputLines);
	}
}
