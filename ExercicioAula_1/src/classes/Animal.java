package classes;

// Classe que representa um animal pelos atributos de nome e raca
public class Animal {
    
    private String nome;
    private String raca;

    // Metodos de getters e setters para
    // atribuir e recuperar os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public Animal() {

    }

    public Animal(String nome) {
        this.nome = nome;
    }

    // Metodo que usa os atributos raca e nome para informar o animal
    // que está caminhando
    public String caminha() {
        return "O " + raca + " chamado " + nome + ", está caminhando";
    }
}