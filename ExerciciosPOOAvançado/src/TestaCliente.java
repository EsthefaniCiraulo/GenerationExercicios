class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
    }
}

class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + cnpj);
    }
}

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica("João", "Rua A, 123", "(11) 1234-5678", "123.456.789-00");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria", "Rua B, 456", "(22) 9876-5432", "987.654.321-00");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa A", "Av. X, 789", "(33) 1111-2222", "12.345.678/0001-00");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa B", "Av. Y, 987", "(44) 3333-4444", "98.765.432/0001-00");

        pessoaFisica1.visualizar();
        System.out.println();
        pessoaFisica2.visualizar();
        System.out.println();
        pessoaJuridica1.visualizar();
        System.out.println();
        pessoaJuridica2.visualizar();
    }
}