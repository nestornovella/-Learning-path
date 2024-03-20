public class Conditionals {
    public static void main(String[] args) {
        //necesitamos mandar un archivo por Bloototh
        System.out.println("_______start ejecut_______");
        boolean blotoothStatus = true;
        int sendedFill = 2;

        if(blotoothStatus == true){
            //send File
            sendedFill++;
            System.out.println("Archivo Enviado");
        }else{
            System.out.println("El archivo no se pudo enviar");
        }

        System.out.println("Archivos enviados: " + sendedFill);
        System.out.println("_______end ejecut_______");
    }
    
}
