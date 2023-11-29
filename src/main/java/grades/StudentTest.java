package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("john doe");
        student1.addGrade(100);
        student1.addGrade(50);
        student1.getGradeAverage();
    }
}
