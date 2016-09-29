package if_elseif_else_002;

import javax.swing.JOptionPane;

/*
 * How to make branching decisions using 
 * if
 * elseif
 * else
 */

public class StartHere {

	// field or class variables
	
	
	
	public static void main(String[] args) {
		
	// local or method variables
		
		String ageInput = "";
		int age = 0;
		String msg = "";
		String genderInput = "";
		String gradeInput = "";
		char gender = ' ';
		char grade = ' ';
		
		//ageInput = JOptionPane.showInputDialog("Hello, what is your age?");
		//age = Integer.parseInt(ageInput);
		
		genderInput = JOptionPane.showInputDialog("Hello, what is your gender: M, F");
		genderInput = genderInput.toUpperCase();
		gender = genderInput.charAt(0);
		
		gradeInput = JOptionPane.showInputDialog("Hello, what is your grade?");
		gradeInput = gradeInput.toUpperCase();
		grade = gradeInput.charAt(1);
		/*
		 * capture their year in school as grade 9, 10, 11, or 12
		 * 
		 */
		
		
		
		
		//msg = "age = " + age + ", gender = " + genderInput + ", char gender = " + gender + ", grade = " + gradeInput + ", char grade = " + grade;
		//JOptionPane.showMessageDialog(null, msg);
		
		//test minor or adult / also test male or female & finally catch errors
		/*
		 * test cases:
		 * 1. minor F
		 * 2. minor M
		 * 3. adult F
		 * 4. adult M
		 * 5. error
		 */
		
		/*
		 * cap grade as words too
		 */
		
		if (gender == 'F' && grade == 'R'){
			msg = "You are a female freshman";
			JOptionPane.showMessageDialog(null, msg);
		} 
		
		else if (gender == 'M' && grade == 'R'){
			msg = "You are a male freshman";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		else if (gender == 'F' && grade == 'O'){
			msg = "You are a female Sophmore";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		else if (gender == 'M' && grade == 'O'){
			msg = "You are an adult male Sophmore";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (gender == 'F' && grade == 'U'){
			msg = "You are a female junior";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		else if (gender == 'M' && grade == 'U'){
			msg = "You are an adult male Junior";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (gender == 'F' && grade == 'E'){
			msg = "You are a female Senior";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		else if (gender == 'M' && grade == 'E'){
			msg = "You are an adult male Senior";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		else {
			msg = "I just don't know what went wrong";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		/*
		if (age < 18){
			msg = "you are a minor";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (age == 18){
			msg = "You are an adult";
			JOptionPane.showMessageDialog(null, msg);
		}
		else {
			msg = "You must be older than 18";
			JOptionPane.showMessageDialog(null, msg);
		}
		*/
		
		
		
		
		
		
		
		
		
		
	}
	
}
