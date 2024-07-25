package buoi9;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;
    public University() {
        students = new ArrayList<>();
    }
public void addStudent(Student s){
    students.add(s);
}
public void displayAllStudents(){
    for(Student student:students){
        System.out.println(student);
    }
}

    public static void main(String[] args) {
        University university = new University();
        double[] grades1 = {};
        Student s1 = new GraduateStudent("S234","Lê Văn A",20,"Computer Science", grades1);
        Student s2 = new InternationalStudent("S234","Lê Văn B",20,"Computer Science","Anh");
        Student s3 = new UndergraduateStudent("S234","Lê Văn C",20,"Computer Science");
        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.displayAllStudents();
    }
}
