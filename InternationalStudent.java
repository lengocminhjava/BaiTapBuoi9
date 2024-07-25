package buoi9;

class InternationalStudent extends UndergraduateStudent {
    private String country;

    public InternationalStudent(String studentld, String name, int age, String major, String country) {
        super(studentld, name, age, major);
        this.country = country;
    }

    @Override
    public double calculateGPA(double[] grades){
        if(grades.length ==0){
            return 0.0;
        }
        double sum=0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum/grades.length;
    };

    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return super.toString() + ", country: " + country;
    }
}
