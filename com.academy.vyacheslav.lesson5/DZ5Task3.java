public class DZ5Task3 {
    public static void main(String[] args){
        Student student1 = new Student(1, "Иванов Иван Иванович", "Физика", 3, "P1", 1999);
        Student student2 = new Student(2, "Петров Пётр Петрович", "Химия", 2, "C2", 2000);
        Student student3 = new Student(3, "Сидоров Сергей Сергеевич", "История", 1, "H3", 2001);
        Student student4 = new Student(4, "Никитин Николай Николаевич", "Математика", 4, "M4", 1998);
        Student student5 = new Student(5, "Попов Павел Павлович", "Физика", 2, "P5", 2000);
        Student student6 = new Student(6, "Бабушкин Борис Борисович", "Физика", 4, "P1", 1999);
        Student student7 = new Student(7, "Рубцов Роман Романович", "Химия", 3, "C2", 1999);
        Student student8 = new Student(8, "Данилова Дарья Владимировна", "История", 2, "H3", 2000);
        Student student9 = new Student(9, "Киселёва Кристина Олеговна", "Математика", 1, "M4", 2001);
        Student student10 = new Student(10, "Горбачёва Галина Петровна", "Физика", 5, "P5", 1998);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        StudentManager.displayStudentsByCourse(students, 2);

        System.out.println();

        StudentManager.displayStudentsByBirthYear(students, 1999);
    }
}
