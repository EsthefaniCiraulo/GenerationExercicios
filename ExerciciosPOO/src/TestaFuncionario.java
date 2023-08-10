
//Classe Funcionario
class Funcionario {
 private String nome;
 private String cargo;
 private double salario;
 private int idade;
 private String departamento;

 // Construtor
 public Funcionario(String nome, String cargo, double salario, int idade, String departamento) {
     this.nome = nome;
     this.cargo = cargo;
     this.salario = salario;
     this.idade = idade;
     this.departamento = departamento;
 }

 // Métodos Get e Set para nome
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Métodos Get e Set para cargo
 public String getCargo() {
     return cargo;
 }
 public void setCargo(String cargo) {
     this.cargo = cargo;
 }

 // Métodos Get e Set para salario
 public double getSalario() {
     return salario;
 }
 public void setSalario(double salario) {
     this.salario = salario;
 }

 // Métodos Get e Set para idade
 public int getIdade() {
     return idade;
 }
 public void setIdade(int idade) {
     this.idade = idade;
 }

 // Métodos Get e Set para departamento
 public String getDepartamento() {
     return departamento;
 }
 public void setDepartamento(String departamento) {
     this.departamento = departamento;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Cargo: " + cargo);
     System.out.println("Salário: " + salario);
     System.out.println("Idade: " + idade);
     System.out.println("Departamento: " + departamento);
 }
}

//Classe TestaFuncionario
public class TestaFuncionario {
 public static void main(String[] args) {
     // Instanciando objetos da classe Funcionario
     Funcionario funcionario1 = new Funcionario("João", "Analista", 5000.0, 28, "TI");
     Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 8000.0, 35, "Administração");

     // Exibindo informações dos funcionários
     System.out.println("Informações do Funcionário 1:");
     funcionario1.visualizar();
     System.out.println("\nInformações do Funcionário 2:");
     funcionario2.visualizar();
 }
}
