package models;

import java.util.Date;

public class Nurse extends User implements ISchedulable{
    private String speciality;


    //constructor
    public Nurse(String name, String email) {
        super(name, email);
    }

    //setters y getters
    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showData() {
        System.out.println("Ocupacion: " + this.getSpeciality() + "\n Name: " + getName());
    }

    @Override
    public void schedule(Date date, String time) {
       System.out.println(date + " " + time + getName());
       
    }



}
