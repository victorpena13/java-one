package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<Student, String> students = new HashMap<>();

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

        students.put(student1, "jane22");
        students.put(student2, "victorpena13");
        students.put(student3, "cmpena23");

    }
}
