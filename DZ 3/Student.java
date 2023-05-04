public class Student {
	//использовать инкапсуляцию - все поля ниже должны быть с модификатором доступа private
	int course;
	int stId;
	String fio;
	String fakult;
	int group;
	int birth;

	public Student() {
	}

	public Student(int stId, String fio, String fakult, int group, int course, int birth) {
		this.course = course; // в задании сказано "В университете учатся студенты с 1 по 5 курс". если я передам другое значение, напиример 100 - конструктор его примет.
		this.stId = stId;
		this.fio = fio;
		this.fakult = fakult;
		this.group = group;
		this.birth = birth;
	}

	//геттеры и сеттеры заданы не для всех полей.
	// в задании сказано "Объект класса Student должен уметь представиться." данный метод отсутвует в данном классе

	public void setId(int stId) {
		this.stId = stId;
	}

	public int getId() {
		return stId;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getFio() {
		return fio;
	}

	public void setFakult(String fakult) {
		this.fakult = fakult;
	}

	public String getFakult() {
		return fakult;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getBirth() {
		return birth;
	}
}