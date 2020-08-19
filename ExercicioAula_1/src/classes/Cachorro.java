package classes;

public class Cachorro extends Animal {
    
    // Metodo que utiliza o getNome para informar qual 
    // cachorro está latindo
    public String late() {
        return getNome() + ", está latindo";
    }
}