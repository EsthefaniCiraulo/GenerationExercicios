
class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Gerente extends Funcionario {
    private String areaResponsavel;

    public Gerente(String nome, double salario, String areaResponsavel) {
        super(nome, salario);
        this.areaResponsavel = areaResponsavel;
    }

    public String getAreaResponsavel() {
        return areaResponsavel;
    }

    public void setAreaResponsavel(String areaResponsavel) {
        this.areaResponsavel = areaResponsavel;
    }

    public void visualizar() {
        System.out.println("Gerente:");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Área Responsável: " + areaResponsavel);
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void visualizar() {
        System.out.println("Vendedor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Comissão: " + comissao);
    }
}

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Ana", 5000, "Vendas");
        Gerente gerente2 = new Gerente("Carlos", 6000, "Marketing");

        Vendedor vendedor1 = new Vendedor("João", 2000, 500);
        Vendedor vendedor2 = new Vendedor("Maria", 1800, 300);

        gerente1.visualizar();
        System.out.println();
        gerente2.visualizar();
        System.out.println();
        vendedor1.visualizar();
        System.out.println();
        vendedor2.visualizar();
    }
}
