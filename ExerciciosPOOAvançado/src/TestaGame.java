
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

class Jogo extends Produto {
    private String plataforma;

    public Jogo(String nome, double preco, String plataforma) {
        super(nome, preco);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void visualizar() {
        System.out.println("Jogo:");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Plataforma: " + plataforma);
    }
}

class Console extends Produto {
    private String modelo;

    public Console(String nome, double preco, String modelo) {
        super(nome, preco);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void visualizar() {
        System.out.println("Console:");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Modelo: " + modelo);
    }
}

public class TestaGame {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("The Witcher 3", 59.99, "PC");
        Jogo jogo2 = new Jogo("The Last of Us Part II", 69.99, "PlayStation 4");

        Console console1 = new Console("PlayStation 5", 499.99, "PS5");
        Console console2 = new Console("Xbox Series X", 499.99, "Xbox");

        jogo1.visualizar();
        System.out.println();
        jogo2.visualizar();
        System.out.println();
        console1.visualizar();
        System.out.println();
        console2.visualizar();
    }
}

