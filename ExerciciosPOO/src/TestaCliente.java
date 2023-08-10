
//Classe Cliente
class Cliente {
 private String nome;
 private String email;
 private String telefone;
 private String endereco;
 private int idade;

 // Construtor
 public Cliente(String nome, String email, String telefone, String endereco, int idade) {
     this.nome = nome;
     this.email = email;
     this.telefone = telefone;
     this.endereco = endereco;
     this.idade = idade;
 }

 // Métodos Get e Set para nome
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Métodos Get e Set para email
 public String getEmail() {
     return email;
 }
 public void setEmail(String email) {
     this.email = email;
 }

 // Métodos Get e Set para telefone
 public String getTelefone() {
     return telefone;
 }
 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 // Métodos Get e Set para endereco
 public String getEndereco() {
     return endereco;
 }
 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 // Métodos Get e Set para idade
 public int getIdade() {
     return idade;
 }
 public void setIdade(int idade) {
     this.idade = idade;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Email: " + email);
     System.out.println("Telefone: " + telefone);
     System.out.println("Endereço: " + endereco);
     System.out.println("Idade: " + idade);
 }
}

//Classe TestaCliente
public class TestaCliente {
 public static void main(String[] args) {
     // Instanciando objetos da classe Cliente
     Cliente cliente1 = new Cliente("João", "joao@example.com", "123456789", "Rua A, 123", 30);
     Cliente cliente2 = new Cliente("Maria", "maria@example.com", "987654321", "Avenida B, 456", 25);

     // Exibindo informações dos clientes
     System.out.println("Informações do Cliente 1:");
     cliente1.visualizar();
     System.out.println("\nInformações do Cliente 2:");
     cliente2.visualizar();
 }
}
