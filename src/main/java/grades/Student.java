package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    private HashMap<String, Student> attendance = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public ArrayList<Integer> viewGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double result=0;
        for(int i = 0; i < grades.size(); i++) {
            result+= grades.get(i);
        }
            return result/grades.size();
    }

}
