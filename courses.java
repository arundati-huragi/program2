package prgrm2;

public class courses {
    String[] courses = {"Java Programing", "Big Dat Analytics", "Devops"};
    int[] marks = {100, 99, 82};
    public void displayCourses() {
        System.out.println("Student Course Information:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        } 
 }
  public static void main(String[] args) {
        courses BCA = new courses();
        BCA.displayCourses();
    } 
}
