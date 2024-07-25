package buoi9;

class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String studentld, String name, int age, String major) {
        super(studentld, name, age);
        this.major = major;
    }
    @Override
    public double calculateGPA(double[] grades){
        if(grades.length==0){
            return 0.0;
        }
        double sum=0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum/grades.length;
    };

    public String getMajor() {
        return major;
    }
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }

}