package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {


    public static void main(String[] args) {

        HashMap<String,Student> students = new HashMap<>();

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

        for(Map.Entry<String,Student> mapElement : students.entrySet()) {
            String key = mapElement.getKey();
            System.out.println(key);
        }


    }
}
