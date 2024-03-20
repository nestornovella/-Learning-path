public class BucleFor {
    static boolean thurnedLightOn = false;

    public static void main(String[] args) {
        thurnOnLight();

        for (int i = 1; i <= 10; i++) {
            sosMessage();
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
