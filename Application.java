import java.util.Scanner;
import java.io.IOException;

public class Application {
	public static void main(String[] args) throws IOException{
		Scanner scnr = new Scanner(System.in);
		StudentRoster studentroster = new StudentRoster(5);
		
		
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter student information");
            System.out.println("2. Print student roster");
            System.out.println("3. Search for a student");
            System.out.println("4. Save student roster to disk");
            System.out.println("5. Read student roster from disk");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scnr.nextInt();
            scnr.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter student's first name: ");
                String firstName = scnr.nextLine();
                System.out.print("Enter student's last name: ");
                String lastName = scnr.nextLine();
                System.out.print("Enter student's current address: ");
                String currentAddress = scnr.nextLine();
                System.out.print("Enter student's home address: ");
                String homeAddress = scnr.nextLine();
                System.out.print("Enter student's Phone Number: ");
                String stuPhoneNumber = scnr.nextLine();
                System.out.print("Enter student's GPA: ");
                String gpa = scnr.nextLine();
                Student newStudent = new Student(firstName, lastName, currentAddress, homeAddress, stuPhoneNumber, gpa);
                studentroster.addStudent(newStudent);
                break;
                
            case 2:
                studentroster.printRoster();
                break;
                
            case 3:
                System.out.print("Enter student's first name: ");
                String searchFirstName = scnr.nextLine();
                System.out.print("Enter student's last name: ");
                String searchLastName = scnr.nextLine();
                Student foundStudent = studentroster.searchStudent(searchFirstName, searchLastName);
                if (foundStudent != null) {
                    System.out.println("Student found:");
                    System.out.println(foundStudent);
                } 
                else {
                    System.out.println("Student not found.");
                }
                break;
                
            case 4:
                studentroster.saveFile();
                System.out.println("Student Roster successfully saved to  the file StudentRoster.txt");
                break;
                
            case 5:
                studentroster.readFile();
                break;
                
            case 6:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
                
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    }
	}
}
