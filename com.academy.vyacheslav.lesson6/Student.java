public class Student extends Man{
    private int eduYear;

    public Student(String name, int age, String gender, double weight, int eduYear){
        super(name, age, gender, weight);
        this.eduYear = eduYear;
    }
    
    public void setYear(int eduYear){
        this.eduYear = eduYear;
    }

    public void yearUp(){
        eduYear++;
    }
}
