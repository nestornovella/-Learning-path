package UImenu;

import static UImenu.UImenu.MONTHS;
import static UImenu.UImenu.doctorLoged;

import java.util.ArrayList;
import java.util.Scanner;

import models.Doctor;
import models.Doctor.AvailableAppointment;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorAvailableAppointment = new ArrayList<>();

    public static void doctorMenu() {
        int option = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Doctor Menu");
            System.out.println("Welcome doctor: \n \n" + doctorLoged.getName());
            System.out.println("1 add Available Appointment");
            System.out.println("2 My Schudle Appointments");
            System.out.println("0 Log Out");

            option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                    addAvailableAppointment();
                    break;
                case 2:
                    getAviableAppointment();
                    break;
                case 0:
                    UImenu.MainMenu();
                    break;

                default:
                    break;
            }
        } while (option != 0);

    }

    private static void addAvailableAppointment() {
        int option = 0;
        int response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("insert a month");
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + MONTHS[i]);
            }
            response = Integer.parseInt(sc.nextLine());

            if (response > 0 && response < 4) {
                int monthSelected = response - 1;
                System.out.println("The selected Month is: " + MONTHS[monthSelected]);
                System.out.println("Inset a Date  dd/mm/yyyy ");
                String date = sc.nextLine();
                System.out.println("your date is: " + date + "\n 1. is correct \n 2. change Date");
                int responseDate = Integer.parseInt(sc.nextLine());
                if (responseDate == 2)
                    continue;

                int responseTime = 0;
                String time;
                do {
                    System.out.println("insert the time available for date: " + date + " [hh:mm]");
                    time = sc.nextLine();
                    System.out.println("your time is: " + time + "\n 1. correct \n 2. change time ");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime == 2);

                if (responseTime == 1) {
                    doctorLoged.addAvailableAppointmentToList(date, time);
                    System.out.println("the schudle is regitred");
                    checkDoctorAvailableAppointment(doctorLoged);
                }

            } else if (response == 0) {
                doctorMenu();
            }

        } while (option != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getList().size() > 0 && !doctorAvailableAppointment.contains(doctor)) {
            doctorAvailableAppointment.add(doctor);
        }
    }

    private static void getAviableAppointment() {

        ArrayList<AvailableAppointment> citas = new ArrayList<>(doctorLoged.getList());
        System.out.println("citas");

        for (Doctor cita : doctorAvailableAppointment) {
            System.out.println("--------------------");
            
            
            System.out.println("--------------------");

        }
    }
}
