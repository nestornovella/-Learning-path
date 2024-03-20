public class Arrays {
    public static void main(String[] args) {
        // arreglos de 1 dimension
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // arreglos de 2 dimension
        String cities[][] = new String[4][2];

        // arreglos de 3 dimensiones
        int numbers[][][] = new int[2][2][2];

        // arreglos de 4 dimensiones
        int numbers4[][][][] = new int[2][2][2][2];

        //agregando datos a los arrays

        //1 dimencion
        androidVersions[0] = "1.2";
        androidVersions[1] = "3.2";
        System.out.println(androidVersions[1]);

        //2 dimensiones
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Argentina";
        cities[1][1] = "Buenos Aires";
        cities[2][0] = "Mexico";
        cities[2][1] = "Jalisco";
        cities[3][0] = "Bolivia";
        cities[3][1] = "La Paz";
        System.out.println(cities[0][0] + " " + cities[0][1]);

        String[][][][] animales = new String[2][3][2][2];

        animales[1][0][0][1] = "changuito";
        System.out.println(animales);

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("--------------");

        for ( String[] arreglo : cities ) {
            for (String city : arreglo) {
                System.out.println(city);
            }
        }

       


    }

}
