import java.util.Arrays;

public class StudentControl {
	Homework3 mainClass = new Homework3();
	Student stElements = new Student();
	Student studentArray[] = new Student[10];

	public void stList() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].course == 1) {
				System.out.println(studentArray[i].fio);
			}
		}
	}

	public void stBirthList() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].birth > 1999) {
				System.out.println(studentArray[i].fio);
			}
		}
	}

	public void getStudentInfo() {
		System.out.println("Привет! Меня зовут " + studentArray[0].fio + ", год моего рождения: "
				+ studentArray[0].birth + ", мой ID:"
				+ studentArray[0].stId + ". Я учусь на факультете '" + studentArray[0].fakult + "' в "
				+ studentArray[0].group + " группе " + studentArray[0].course
				+ " курса.");
	}
}