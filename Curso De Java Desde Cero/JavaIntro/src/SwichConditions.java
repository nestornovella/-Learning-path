


public class SwichConditions {
    public static void main(String[] args) {
        System.out.println("_________start__________");
        /* 
        statement swith 
        */
        String modeColorSelected = "Dark";
        String messagge = "The mode Selected is: ";
        switch (modeColorSelected) {
            case "Dark":
                System.out.println(messagge + modeColorSelected);
                break;
            case "Night":
                System.out.println(messagge + modeColorSelected);
                break;
            case "Blue Dark":
                System.out.println(messagge + modeColorSelected);
                break;
            default:
                System.out.println("Error dato invalido!");
                break;
        }
        System.out.println("_________end__________");
        
    }

}
