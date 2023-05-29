public class Man {
    private String name;
    private int age;
    private String gender;
    private double weight;

    public Man(String name, int age, String gender, double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setInfo(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
