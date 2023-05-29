public class DZ6Task1 {
	public static void main(String[] args) {
		Man man = new Man("Иван", 21, "мужской", 80.5);
        Student studFirst = new Student("Петр", 19, "мужской", 65.5, 1);
        Student studSecond = new Student("Анна", 20, "женский", 54.0, 2);

        System.out.println(studFirst.getName());
        System.out.println(studFirst.getAge());
        System.out.println(studFirst.getGender());
        System.out.println(studFirst.getWeight());

        Man manNew = (Man) studSecond;
	}
}
