public class WhileLoop {
    
    static boolean thurnedLightOn = false;

    public static void main(String[] args) {
        int intentos = 0;
        thurnOnLight();

        while(thurnedLightOn && intentos < 11){
            sosMessage();
            intentos++;
        }

    }

    public static void sosMessage() {
        System.out.println(". . . _ _ _ . . .");
    };

    public static boolean thurnOnLight() {
        thurnedLightOn = !thurnedLightOn ? true : false;
        return thurnedLightOn;
    };
}
