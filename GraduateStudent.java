package buoi9;

    class GraduateStudent extends Student {
    private String researchTopic;
    private double[] grades;

        public GraduateStudent(String studentld, String name, int age, String researchTopic,double[] grades) {
            super(studentld, name, age);
            this.researchTopic = researchTopic;
            this.grades = grades;
        }
        @Override
        public double calculateGPA(double[] grades){
            if(grades.length==0){
                return 0.0;
            }
            double sum=0;
            for(double grade: grades){
                sum+=grade;
            }
            return sum/grades.length;
        }

        public String getResearchTopic() {
            return researchTopic;
        }

        public double[] getGrades() {
            return grades;
        }

        @Override
        public String toString() {
            double gpa = calculateGPA(grades);
            return super.toString() + ", researchTopic: " + researchTopic+", dtb: " + gpa;
        }
    }