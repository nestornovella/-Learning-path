package UImenu;

import static UImenu.UImenu.patientLoged;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import models.Doctor;

public class UIPatientMenu {

    public static void patientMenu() {
        int option = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome " + patientLoged.getName());
            System.out.println("Seleccione: \n1. opcion1 \n2. opcion2 \n0. exit");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch (option) {
                case 1:
                    System.out.println("Book an appointment");
                    break;
                case 2:
                    System.out.println("My appointment");
                    break;

                default:
                    UImenu.MainMenu();
                    break;
            }

        } while (option != 0);

    }

    private static void showAnAppointment() {
        int option = 0;
        do {
            System.out.println("::Book An Appointment::");
            System.out.println(":: Select Date ::");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 1;
            for (int i = 0; i < UIDoctorMenu.doctorAvailableAppointment.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorAvailableAppointment
                        .get(i).getList();

                Map<Integer, Doctor> doctorAppointment = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println( k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), UIDoctorMenu.doctorAvailableAppointment.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointment);
                }

                Scanner sc = new Scanner(System.in);
                int responseDateSelected = Integer.valueOf(sc.nextLine());
            }

        } while (option != 0);

    }
}
