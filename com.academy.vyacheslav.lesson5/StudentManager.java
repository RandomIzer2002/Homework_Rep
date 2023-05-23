public class StudentManager {
    public static void displayStudentsByCourse(Student[] students, int course) {
        System.out.println("Список студентов, учащихся на курсе № " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                student.introduce();
            }
        }
    }

    public static void displayStudentsByBirthYear(Student[] students, int birthYear) {
        System.out.println("Студенты, родившиеся после " + birthYear + " года:");
        for (Student student : students) {
            if (student.getBirthYear() > birthYear) {
                student.introduce();
            }
        }
    }
}
