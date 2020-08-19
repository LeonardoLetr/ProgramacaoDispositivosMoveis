package classes;

public class Gato extends Animal {
    
    // Metodo que utiliza o getNome para informar qual 
    // gatp está miando
    public String mia() {
        return getNome() + ", está miando";
    }
}