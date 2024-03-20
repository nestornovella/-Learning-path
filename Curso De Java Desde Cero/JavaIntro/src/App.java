public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mathematic Operations");

        double x = 2.3;
        double y = 3;

        // Redondeos
        // hacia abajo
        System.out.println(Math.floor(x));

        // hacia arriba
        System.out.println(Math.ceil(x));

        // redondea
        System.out.println(Math.round(x));

        // Aritmetica
        // area de un circulo
        // formula PI * cat2
        System.out.println(Math.PI * Math.pow(y, 2));

        // area de una esfera
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // volumen de una esfera
        // formula 4/3 * PI * cat3
        System.out.println(4 / 3 * Math.PI * Math.pow(y, 3));

        // raiz cuadrada
        System.out.println(Math.sqrt(y));

        // maximo numero
        System.out.println(Math.max(x, y));

        //minimo
        System.out.println(Math.min(x, y));
        int i=1, j=2, k=3, m=2;

        System.out.println ((j >= i) || (k == m));
        byte edad = 32;
    }
}
