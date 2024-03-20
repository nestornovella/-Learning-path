import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import UImenu.UImenu;
import models.Doctor;

public class App {
     public static void main(String[] args) throws Exception {
          UImenu.MainMenu();

          
          Doctor pablo = new Doctor("pablo", "pablo@gmail.com");
          Doctor pedro = new Doctor("pedro", "pedro@gmail.com");
          Doctor carlos = new Doctor("carlos", "carlos@gmail.com");

          ArrayList<Doctor> allDoctors = new ArrayList<>();
          allDoctors.add(pablo);
          allDoctors.add(carlos);
          allDoctors.add(pedro);

          String[] personasCasadas = new String[3];
          personasCasadas[0] = "pedro";
          personasCasadas[1] = "ramon";
          personasCasadas[2] = "juancarlos";

          Map<String, Doctor> doctores = new HashMap<>();

          for (Doctor doctor : allDoctors) {
               doctores.put(doctor.getName(), doctor);
          }

          for (Map.Entry<String, Doctor> doctor : doctores.entrySet()) {
               System.out.println(doctor.getKey() + ": " + doctor.getValue().getName());

          }

          Map<Integer, Map<String, Doctor>> imprime = new TreeMap<>();

          imprime.put(Integer.valueOf(1), doctores);


          for (Map.Entry<Integer, Map<String, Doctor>> impres : imprime.entrySet()) {
               for (Map.Entry<String, Doctor> doc : impres.getValue().entrySet()) {

                    System.out.println("___________________");
                    System.out.println(doc.getValue().getName());
                    
               }
               
          }

          

     }

}
