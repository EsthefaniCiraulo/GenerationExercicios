
//Classe Curso
class Curso {
 private String nome;
 private String instrutor;
 private int duracaoHoras;
 private double preco;
 private String descricao;

 // Construtor
 public Curso(String nome, String instrutor, int duracaoHoras, double preco, String descricao) {
     this.nome = nome;
     this.instrutor = instrutor;
     this.duracaoHoras = duracaoHoras;
     this.preco = preco;
     this.descricao = descricao;
 }

 // Métodos Get e Set para nome
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Métodos Get e Set para instrutor
 public String getInstrutor() {
     return instrutor;
 }
 public void setInstrutor(String instrutor) {
     this.instrutor = instrutor;
 }

 // Métodos Get e Set para duracaoHoras
 public int getDuracaoHoras() {
     return duracaoHoras;
 }
 public void setDuracaoHoras(int duracaoHoras) {
     this.duracaoHoras = duracaoHoras;
 }

 // Métodos Get e Set para preco
 public double getPreco() {
     return preco;
 }
 public void setPreco(double preco) {
     this.preco = preco;
 }

 // Métodos Get e Set para descricao
 public String getDescricao() {
     return descricao;
 }
 public void setDescricao(String descricao) {
     this.descricao = descricao;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome do Curso: " + nome);
     System.out.println("Instrutor: " + instrutor);
     System.out.println("Duração (horas): " + duracaoHoras);
     System.out.println("Preço: " + preco);
     System.out.println("Descrição: " + descricao);
 }
}

//Classe TestaCurso
public class TestaCurso {
 public static void main(String[] args) {
     // Instanciando objetos da classe Curso
     Curso curso1 = new Curso("Programação Java", "João Silva", 40, 249.99, "Aprenda a programar em Java.");
     Curso curso2 = new Curso("Design Gráfico", "Maria Souza", 30, 199.99, "Crie designs incríveis.");

     // Exibindo informações dos cursos
     System.out.println("Informações do Curso 1:");
     curso1.visualizar();
     System.out.println("\nInformações do Curso 2:");
     curso2.visualizar();
 }
}
