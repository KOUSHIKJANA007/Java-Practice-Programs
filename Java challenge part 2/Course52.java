public class Course52 {
    static int maxCapacity=100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;
    Course52(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents= new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
       Course52.maxCapacity=maxCapacity;
    }
    
    void enrolledStudent(String student){
        enrolledStudents[enrollments]=student;
        System.out.println(student+ " enrolled");
        enrollments++;
    }
    void unEnrolledStudent(String student ){
        System.out.println("Student removed");
        enrollments--;
    }
    public static void main(String[] args) {
        Course52 course=new Course52("Computer Science");
        course.enrolledStudent("koushik");
        course.enrolledStudent("dev");
        course.enrolledStudent("bisal");
    }
    
}