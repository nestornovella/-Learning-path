
fun main(args: Array<String>) {
    val arregloDeSo = mutableListOf("windows vista","mac OS catalina", "linux ubuntu", "windows xp", "windows 10", "mac OS big sur")
    
    arregloDeSo.run { 
        
      this.removeIf({e -> e.contains("OS")})  
   
        
        //this.forEach { so -> println(so) }  
     } 

    println(arregloDeSo)
    
}