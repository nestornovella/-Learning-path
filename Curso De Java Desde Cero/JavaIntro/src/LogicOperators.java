public class LogicOperators {
    public static void main(String[] args) {
       /*  operadores logicos
        los operadores logicos < > !+ == ||  */
        System.out.println("_______start ejecut_______");
        var a = 10;
        var b = 35;

        if(a == b || a == 11){
            System.out.println("se dio una condicion");
        }else if(a != b && b == 35){
            System.out.println("se dieron ambas condiciones!");
        }else{
            System.out.println("No se cumplio ninguna condicion!");
        }

        System.out.println("_______end ejecut_______");
    }
    
}
