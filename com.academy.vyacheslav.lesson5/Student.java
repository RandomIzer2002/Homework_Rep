public class Student {
    private int id;
    private String name;
    private String faculty;
    private int course;
    private String group;
    private int birthYear;

    public Student(int id, String name, String faculty, int course, String group, int birthYear) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.birthYear = birthYear;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void introduce() {
        System.out.println("Привет! Мой ID: " + id + ", меня зовут " + name + ". Я учусь на факультете '" + faculty + "', курса № " + course +
                ", в группе № " + group + ". Год моего рождения: " + birthYear);
    }
}