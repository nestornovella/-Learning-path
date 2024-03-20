public class Casting {
    public static void main(String[] args) {
        // suponiendo que recogi 230 perritos
        // y quiero saber cuantos fueron por mes

        double perritos = 230.0;
        double meses = 12.0;
        // obtengo un numero decimal, pero si quiero un estimativo
        double perritosPorMesExacto = perritos / meses;
        System.out.println(perritosPorMesExacto);
        // o mejor dicho un entero lo puedo parcear a integer
        int perrosPorMes = (int) perritosPorMesExacto;
        System.out.println(perrosPorMes);

        int xvalue = 21;
        int yvalue = 10;

        System.out.println((double) xvalue / yvalue);

        char n = '1';
        int n2 = n;
        System.out.println(n2);
        System.out.println("|-------------TAREA-------------->");
        //Tarea , convierte los tipos de datos de los siguientes ejercicios
        // char c = ‘z’; conviertelo a int
        char ej1 = 'z';
        int ej1Convert = ej1;
        System.out.println(ej1Convert);
        // int i = 250; conviertelo a long y luego de long a short
        int iej2 = 250;
        long convertToLong = iej2;
        short converToShort = (short)convertToLong;
        System.out.println(converToShort);
        // double d = 301.067; conviertelo a long
        double d = 301.057;
        long doubleToLong =(long) d;
        System.out.println(doubleToLong);
        // int i = 100; súmale 5000.66 y conviertelo a float
        int i = 100;
        float resultFloat = (float)(i + 5000.66);
        System.out.println(resultFloat);
        // int i = 737; multiplícalo por 100 y conviertelo a byte
        int numerInteger = 737 * 100;
        byte response =(byte) numerInteger;
        
        System.out.println(response);
        // double d = 298.638; divídelo entre 25 y conviertelo a long
        double dou = 298.637 / 25;
        long end = (long) dou;
        System.out.println(end);
    }
}
