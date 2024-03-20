

public class Funciones {
    public static void main(String[] args) {
        print("S");

        print(circleArea(10));

        print("E");
    }

    public static double circleArea(double r) {

        return Math.PI * Math.pow(r, 2);
    }
    


    /**
     * Description: la funcion imprime cualquier tipo de dato en la consola
     * @param data el parametro data puede ser cualquier tipo de dato
     * @return la funcion no retorna ningun valor.
     */
    public static void print(Object data) {
        if (data == "S") {
            System.out.println("___________Start___________");

        } else if (data == "E") {
            System.out.println("___________End___________");

        }else{

            System.out.println(data);
        }
    }

}
