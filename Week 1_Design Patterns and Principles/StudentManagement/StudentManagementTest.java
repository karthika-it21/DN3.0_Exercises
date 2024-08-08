public class StudentManagementTest {
    public static void main(String[] args) {
        Student model = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.updateView();
    }
}
