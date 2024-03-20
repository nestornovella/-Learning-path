import java.util.Scanner;

public class WhileCicle {
    public static void main(String[] args) {
        int response = 0;

        Funciones.print("S");
        do {
            Funciones.print("Selecciona la opcion Deseada!");
            Funciones.print("1 para Movies");
            Funciones.print("2 para Series");
            Funciones.print("3 para Salir");
            Scanner scanner = new Scanner(System.in);
            try {
                response = Integer.valueOf(scanner.nextLine());
            } catch (Exception e) {
                response = 0;
            }
            switch (response) {
                case 1:
                    Funciones.print("Movies");
                    break;
                case 2:
                    Funciones.print("Series");
                    break;
                case 3:
                    Funciones.print("Gracias por usar la aplicacion");
                    break;

                default:
                    Funciones.print("Selecciona una opcion correcta");
                    break;
            }

        } while (response != 3);

        Funciones.print("E");

    }

}
