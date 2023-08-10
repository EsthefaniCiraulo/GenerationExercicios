
class Farmacia {
    private String nome;
    private String endereco;

    public Farmacia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

class Medicamento extends Farmacia {
    private String principioAtivo;

    public Medicamento(String nome, String endereco, String principioAtivo) {
        super(nome, endereco);
        this.principioAtivo = principioAtivo;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public void visualizar() {
        System.out.println("Medicamento:");
        System.out.println("Nome da Farmácia: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Princípio Ativo: " + principioAtivo);
    }
}

class Perfumaria extends Farmacia {
    private String fragrancia;

    public Perfumaria(String nome, String endereco, String fragrancia) {
        super(nome, endereco);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    public void visualizar() {
        System.out.println("Perfumaria:");
        System.out.println("Nome da Farmácia: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Fragrância: " + fragrancia);
    }
}

public class TestaFarmacia {
    public static void main(String[] args) {
        Medicamento medicamento1 = new Medicamento("Farmácia A", "Rua A, 123", "Paracetamol");
        Medicamento medicamento2 = new Medicamento("Farmácia B", "Rua B, 456", "Ibuprofeno");

        Perfumaria perfume1 = new Perfumaria("Farmácia X", "Av. X, 789", "Floral");
        Perfumaria perfume2 = new Perfumaria("Farmácia Y", "Av. Y, 987", "Cítrico");

        medicamento1.visualizar();
        System.out.println();
        medicamento2.visualizar();
        System.out.println();
        perfume1.visualizar();
        System.out.println();
        perfume2.visualizar();
    }
}
