package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;

    // comportamientos



    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static class AvailableAppointment {
        private static int currentId = 0;
        private int Aa_id;
        private Date date;
        private String time;
        private String name;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        AvailableAppointment(String date, String time) {
            this.Aa_id = currentId;
            try {                
                this.date = format.parse(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.time = time;
            incres();
        }

        public String getName() {
            return name;
        }

        public String getDate() {
            return  format.format(date);
        }

        public String getTime() {
            return time;
        }

        public int getId() {
            return Aa_id;
        }

        private static void incres() {
            currentId++;
        }
    }

    ArrayList<AvailableAppointment> availableAppointmentList = new ArrayList<>();

    public void addAvailableAppointmentToList(String date, String name) {
        availableAppointmentList.add(new AvailableAppointment(date, name));
    }

    public ArrayList<AvailableAppointment> getList() {
        return availableAppointmentList;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "speciality: " + speciality;
    }

    @Override
    public void showData() {
        System.out.println(getName());
    }

}
