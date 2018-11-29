public class Cantante extends Humano{
    
    String profesion = "cantante";
    String cantar;
    
    public Cantante(String nombre, int edad, String profesion, String cantar){
        
        super(nombre, edad, profesion);
        
        this.cantar = cantar;
        
        System.out.println("Y yo el constructor de Cantante, extiendo de humano");
    }
    
    public void Cantar(){}
    
}
