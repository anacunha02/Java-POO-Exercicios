
public abstract class Pessoa {
    private String nome;
    private int idade;

    // Pediu para que fosse criado o construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

        // Getter e Setter para idade
        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        // Método abstrato
        public abstract void apresentar();
    }