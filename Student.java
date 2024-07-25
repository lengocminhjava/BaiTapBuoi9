package buoi9;

abstract class Student {
    private String studentld;
    private String name;
    private int age;

    public Student(String studentld, String name, int age) {
        this.studentld = studentld;
        this.name = name;
        this.age = age;
    }
    public abstract double calculateGPA(double[] grades);

    public String getStudentld() {
        return studentld;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentld='" + studentld + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age + ", dtb" +
                '}';
    }
}

