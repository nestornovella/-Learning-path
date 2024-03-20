package UImenu;

import java.util.ArrayList;
import java.util.Scanner;

import models.Doctor;
import models.Patient;

public class UImenu {
    public static Doctor doctorLoged;
    public static Patient patientLoged;

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
     "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void MainMenu() {
        int response = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("0 para salir");
            System.out.println("1 Doctor");
            System.out.println("2 paciente");
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("gracias por usar nuestro sistema de auto ayuda");
                    break;
                case 1:
                    authUser(1);
                    break;
                case 2:
                     authUser(2);
                    break;
                case 3:
    
                    break;

                default:
                    break;
            }

        } while (response != 0);

    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor("Juan Carlos", "juancarlos@mail.com"));
        doctorList.add(new Doctor("Robert Redis", "redis@mail.com"));
        doctorList.add(new Doctor("Roxana Santos", "roxi@mail.com"));
        doctorList.add(new Doctor("Cristian Velazques", "velasquez@mail.com"));

        ArrayList<Patient> patientsList = new ArrayList<>();
        patientsList.add(new Patient("Juan Cruz", "juancruz@mail.com"));
        patientsList.add(new Patient("Pedri Lisboa", "lisboa@mail.com"));
        patientsList.add(new Patient("Charlie Castro", "chcastro@mail.com"));

        boolean correctEmail = false;
        
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingresar email: \n");
            String email = scan.nextLine();
            if(userType == 1){

                for (Doctor doc : doctorList) {
                    if(doc.getEmail().equals(email)){
                        correctEmail = true;
                        doctorLoged = doc;
                        UIDoctorMenu.doctorMenu();
                    }
                }

            }

            if(userType == 2){
                for (Patient patient : patientsList) {
                    if(patient.getEmail().equals(email)){
                        correctEmail = true;
                        patientLoged = patient;
                        UIPatientMenu.patientMenu();
                    }
                }
            }

        } while (!correctEmail);

    }
}
