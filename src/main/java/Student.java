public class Student {

    public String name;
    public String cohort;

    public Student(String studentName) {
        this(studentName, "unassigned");
    }

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }

    public static void main(String[] args) {
        Student s1 = new Student("student a");
        Student s2 = new Student("student b", "voyagers");
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
    }
}
