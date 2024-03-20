


public class DataTypes{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // tipos de datos
        int n = 1234567890;
        long nMayor = 123456789011123L; //siepmre con una L al final
        byte by =123;

        float decimal = 0.32322F;
        double decimalMasLargo = 2.42323232;
        boolean verdadero = true;
        String[] comidas = {"pasta", "bistec"};

        var nombre = "pedro";

        //ciclo for
        for(var i = 0; i < comidas.length; i++ ){
            System.out.println(comidas[i]);
        }
    }
}
