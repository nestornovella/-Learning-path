package models;
public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email) {
        super(name, email);

    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString(){
        return super.toString() + "\n blood: "+ blood;
    }

    @Override
    public void showData() {
        System.out.println("paciente " + getName());
    }
    

}
