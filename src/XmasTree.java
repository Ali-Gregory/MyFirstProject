import static java.lang.System.out;
import java.util.Random;
import javax.swing.JOptionPane;

public class XmasTree {
	char twig = '^';
	
	
	//This branched code contains this comment to check that I can undo changes
	
	public void printTree(int numLines){
//		String lines[] = {};
		out.println("Here is your tree:");
		
		//Loop for the selected number of lines, adding 2 twigs on each
		for (int i = 1, numTwigs = 1; i<=numLines; i++,numTwigs+=2 ){
			//Calculate the number of characters in a line
			//Calculates the number of spaces to each side of the twigs
			int lineLength = (2*numLines)-1;
			int numOfSpaces = (lineLength - numTwigs) / 2;
			//Adds variables to designate random 'snow' in spaces
			int randomSnow = new Random().nextInt(numOfSpaces + 1);
			int randomSnow2 = new Random().nextInt(numOfSpaces + 1);
			
			//Loops to write beginning of line spaces
			for (int j=1;j<=numOfSpaces;j++) {
				if ((j==randomSnow || j==randomSnow2)  && j!=numOfSpaces) {
//					lines[i-1] = lines[i-1].concat(".");
					out.print(".");
				}
				else {
//					lines[i-1] = lines[i-1].concat("_");
					out.print(" ");
				}
			}
			//Loops to write twigs
			for (int k=1;k<=numTwigs;k++) {
				out.print(twig);
			}
			//Loops to write end of line spaces
			for (int j=1;j<=numOfSpaces;j++) {
				if ((j==randomSnow || j==randomSnow2)  && j!=numOfSpaces) {
					out.print(".");
				}
				else {
					out.print(" ");
				}
			}
			//Add a line break to the end of the line
			out.println();
			
		}
	}
	
	
}
