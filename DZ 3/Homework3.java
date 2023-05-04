public class Homework3 { //почему Homework3, если это задачи урока 5?
	// Объекты для Задания №3

	public static void main(String[] args) {
		// Задача №1 // вынести в отдельный класс. раскомментировать код, программа должна работать при запуске.

		/*
		 * RanClass ranClass1 = new RanClass();
		 * System.out.println("Стандартное число: " + ranClass1.getNumber());
		 * System.out.println("Стандартный символ: " + ranClass1.getCharacter());
		 */

		// Задача №2 // вынести в отдельный класс.


		/*
		 * Fraction objectFirst = new Fraction();
		 * Fraction objectSecond = new Fraction();
		 * objectFirst.fractionOuter();
		 * int summaryResult = objectFirst.sumMethod(8, 5) + objectSecond.sumMethod(12,
		 * 5);
		 * int multiResult = objectFirst.multiMethod(9, 6);
		 * int divResult = objectFirst.divMethod(21, 10);
		 * System.out.println("Результат сложения дробей: " + summaryResult);
		 * System.out.println("Результат умножения дробей: " + multiResult);
		 * System.out.println("Результат деления дробей: " + divResult);
		 */

		// Задача №3

		StudentControl controlObject = new StudentControl();
		Student st0 = controlObject.studentArray[0] = new Student(100200, "Иванов Иван Иванович",
				"Экономика и управление", 10, 1, 2001);
		Student st1 = controlObject.studentArray[1] = new Student(100201, "Евгеньев Евгений Евгеньевич",
				"Физико-технический", 15, 1, 1995);
		Student st2 = controlObject.studentArray[2] = new Student(100203, "Олегов Олег Олегович",
				"Математика и информатика", 1, 3, 2001);
		Student st3 = controlObject.studentArray[3] = new Student(100205, "Валентинова Валентина Валентиновна",
				"Экономика и управление", 10, 2, 2003);
		Student st4 = controlObject.studentArray[4] = new Student(100210, "Александрова Александра Александровна",
				"Физико-технический", 15, 4, 1997);
		Student st5 = controlObject.studentArray[5] = new Student(100100, "Петров Пётр Петрович",
				"Экономика и управление", 10, 1, 1999);
		Student st6 = controlObject.studentArray[6] = new Student(100110, "Карпов Карп Карпович", "Физико-технический",
				15, 4, 1998);
		Student st7 = controlObject.studentArray[7] = new Student(100120, "Павлов Павел Павлович",
				"Математика и информатика", 1, 2, 1996);
		Student st8 = controlObject.studentArray[8] = new Student(100130, "Данилов Данила Данилович",
				"Физико-технический", 15, 5, 1996);
		Student st9 = controlObject.studentArray[9] = new Student(100250, "Сидоров Иван Иванович",
				"Математика и информатика", 1, 5, 2000);
		controlObject.getStudentInfo();
		System.out.println();
		System.out.println("Список студентов для 1-го курса:");
		controlObject.stList();
		System.out.println();
		System.out.println("Список студентов родившихся после 1999-го года:");
		controlObject.stBirthList();
	}
}