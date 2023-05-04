import java.util.Arrays;

public class StudentControl {
	Homework3 mainClass = new Homework3(); //зачем это поле здесь, оно нигде не используется.
	Student stElements = new Student(); //зачем это поле здесь, оно нигде не используется.

	/*массив не нужен в классе для работы над студнетами. массив нужно создать в клиентском коде(метод main() в классе Task3)
	и передавать в качестве одного из параметров методов.
	*/
	Student studentArray[] = new Student[10];

	public void stList() { // метод должен принимать массив студентов и значение курса. выводить только тех студентов, у которых курс совпадает с запрошенным
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].course == 1) {
				System.out.println(studentArray[i].fio);
			}
		}
	}

	public void stBirthList() { //то же самое что и для курса, только для года обучения.
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].birth > 1999) {
				System.out.println(studentArray[i].fio);
			}
		}
	}

	public void getStudentInfo() { // данный метод должен быть помещен в класс Student и должен использовать поля объекта Student
		System.out.println("Привет! Меня зовут " + studentArray[0].fio + ", год моего рождения: "
				+ studentArray[0].birth + ", мой ID:"
				+ studentArray[0].stId + ". Я учусь на факультете '" + studentArray[0].fakult + "' в "
				+ studentArray[0].group + " группе " + studentArray[0].course
				+ " курса.");
	}
}