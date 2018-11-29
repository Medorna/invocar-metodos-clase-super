public class Principal {
  
    public static void main(String[] args){
        
        Cantante opera = new Cantante("Pavarotti",71, "cantante", "lalalalala");
        
        System.out.println(opera.nombre);
        System.out.println(opera.edad + " años");
        System.out.println(opera.profesion);
        System.out.println(opera.cantar);
    
    }
}
