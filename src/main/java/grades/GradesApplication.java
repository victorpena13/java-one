package grades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {


    public static void displayGitHubUsernames(HashMap<String, Student> x) {
        for (Map.Entry<String, Student> mapElement : x.entrySet()) {
            String key = mapElement.getKey();
            Student value = mapElement.getValue();
            System.out.print(" |" + key + "| ");
        }
    }

    public static void recordAttendance(String date, String value) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter date: ");
        String dateStr = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        Date userDate = sdf.parse(dateStr);
        System.out.println(userDate);


    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("jane");
        Student student2 = new Student("victor");
        Student student3 = new Student("celeste");

        student1.addGrade(50);
        student1.addGrade(80);
        student1.addGrade(90);

        student2.addGrade(75);
        student2.addGrade(75);
        student2.addGrade(75);

        student3.addGrade(20);
        student3.addGrade(100);
        student3.addGrade(90);

        students.put("jane22", student1);
        students.put("victorpena13", student2);
        students.put("cmpena23", student3);

        recordAttendance("13/01/1995", "P");

        System.out.println("Welcome!");

        do{
            System.out.println("Here are the GitHub usernames of our students: ");
            displayGitHubUsernames(students);
            System.out.print("\nWhat student would you like to see more information on or enter all: ");
            String userInput = scanner.next();
            if(userInput.equalsIgnoreCase("all")) {
                System.out.println("github username | name | grade average | all grades");
                int classAverage = 0;
                for (Map.Entry<String, Student> mapElement : students.entrySet()) {
                    String key = mapElement.getKey();
                    Student value = mapElement.getValue();
                    classAverage += value.getGradeAverage();
                    System.out.println(" | " + key + " | " + value.getName() + " | " + value.getGradeAverage() + " " + value.viewGrades());
                }
                classAverage = classAverage/students.size();
                System.out.println("class average: " + classAverage);
            }
            if (students.containsKey(userInput) == true) {
                System.out.println("github username: " + userInput);
                System.out.println("name: " + students.get(userInput).getName());
                System.out.println("current average: " + students.get(userInput).getGradeAverage());
                System.out.println("all grades: " + students.get(userInput).viewGrades());
            }
            System.out.println("would you to look for another user? press any key to continue. or enter [no or n] to exit. ");
            String userAnswer = scanner.next();
            if(userAnswer.equalsIgnoreCase("no") | userAnswer.equalsIgnoreCase("n")) {
                return;
            }
        }while(true);

    }
}
