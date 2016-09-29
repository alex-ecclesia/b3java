
import javax.swing.JOptionPane;

public class GetCounselorName {

	public static void main(String[] args) {
		String msg = "";
		String lastName = "";
		char firstLetter = ' ';
		
		/*
		 *1use JOP's = at least for the final - and must be jar'd up for grading
		 *2JOP ask for last name
		 *3Determine first letter of the last name do this part in main
		 *4pass last name letter to counselorAssign
		 */
		lastName = JOptionPane.showInputDialog("what is your last name?");
		lastName = lastName.toUpperCase();
		firstLetter = lastName.charAt(0);
		msg = "First letter is " + firstLetter;
		JOptionPane.showMessageDialog(null, msg);
		counselorAssign(firstLetter);
		
		
		
		
	}//end of main

	
	public static void grading(char firstLetter){
		int numericLetter;
		switch (firstLetter){
		case('A'):
			System.out.println("Joblin");
			numericLetter = 0;
			break;
		case('B'):
			System.out.println("Joblin");
			numericLetter = 0;
			break;
		case('C'):
			System.out.println("Joblin");
			numericLetter = 0;
			break;
		case('D'):
			System.out.println("Joblin");
		numericLetter = 0;
		case('F'):
			System.out.println("Hull");
			numericLetter = 1;
			break;
		case('G'):
			System.out.println("Hull");
			numericLetter = 1;
			break;	
		case('H'):
			System.out.println("Hull");
			numericLetter = 1;
			break;
		case('I'):
			System.out.println("Hull");
			numericLetter = 1;
			break;
		case('J'):
			System.out.println("Hull");
			numericLetter = 1;
			break;
		case('K'):
			System.out.println("Hull");
			numericLetter = 1;
			break;
		case('L'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('M'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('N'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('O'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('P'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('Q'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('R'):
			System.out.println("Stafford");
			numericLetter = 2;
			break;
		case('S'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('T'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('U'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('V'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('W'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('X'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('Y'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
		case('Z'):
			System.out.println("Langley");
			numericLetter = 3;
			break;
			
		default:
			System.out.println("Invalid grade entry, must enter A-F");
			numericLetter = -1;
			break;
		}//end of switch
		counselorAssign(numericLetter);
	}
	
		
	
	public static void counselorAssign(int numericLetter){
		/*
		 * receive as pass parm the first letter of the last name
		 * use switch case to determine the counselor (look at switchase proj)
		 * JOP show the assigned counselor
		 * A-D Ms. Joblin   0
		 * E-K Ms. Hull     1
		 * L-R Ms. Stafford 2
		 * S-z Mr. Langley  3
		 */
		
		System.out.println("\nEntering passTheCourse");
		switch(numericLetter){ 
		case 0:
			System.out.println("Your counselor is Ms. Joblin");
			break;
		case 1:
			System.out.println("Your counselor is Ms. Hull");
			break;
		case 2:
			System.out.println("Your counselor is Ms. Stafford");
		case -1:
			System.out.println("Error");
	}
	
	
}//end of assignCouselor
}
