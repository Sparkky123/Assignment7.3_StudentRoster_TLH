import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class StudentRoster {

	private Student[] roster;
    private int size;

    public StudentRoster(int capacity) {
        roster = new Student[capacity];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < roster.length) {
            roster[size] = student;
            size++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Roster is full. Cannot add more students.");
        }
    }
	
    public void printRoster() {
        if (size == 0) {
            System.out.println("Roster is empty.");
        } else {
            System.out.println("Student Roster:");
            for (int i = 0; i < size; i++) {
                System.out.println(roster[i]);
            }
        }
    }

    public Student searchStudent(String firstName, String lastName) {
        for (int i = 0; i < size; i++) {
            if (roster[i].getFirstName().equalsIgnoreCase(firstName) && roster[i].getLastName().equalsIgnoreCase(lastName)) {
                return roster[i];
            }
        }
        return null;
    }
	
    public void saveFile() throws IOException {
    	FileWriter fw = new FileWriter("StudentRoster.txt", true);
    	PrintWriter pw = new PrintWriter(fw);
    	for (int i = 0; i < size; i++) {
    		pw.println(roster[i]);
    		pw.close();
    	}
    }
    
    public void readFile() throws IOException {
    	FileReader fr = new FileReader("StudentRoster.txt");
    	Scanner inFile = new Scanner(fr);
    	while (inFile.hasNext()) {
            String line = inFile.nextLine();
            System.out.println(line);
        }
    }
}
