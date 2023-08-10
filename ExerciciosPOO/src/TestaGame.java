
//Classe Produto
class Produto {
 private String nome;
 private String plataforma;
 private double preco;
 private int estoque;
 private String genero;

 // Construtor
 public Produto(String nome, String plataforma, double preco, int estoque, String genero) {
     this.nome = nome;
     this.plataforma = plataforma;
     this.preco = preco;
     this.estoque = estoque;
     this.genero = genero;
 }

 // Métodos Get e Set para nome
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Métodos Get e Set para plataforma
 public String getPlataforma() {
     return plataforma;
 }
 public void setPlataforma(String plataforma) {
     this.plataforma = plataforma;
 }

 // Métodos Get e Set para preco
 public double getPreco() {
     return preco;
 }
 public void setPreco(double preco) {
     this.preco = preco;
 }

 // Métodos Get e Set para estoque
 public int getEstoque() {
     return estoque;
 }
 public void setEstoque(int estoque) {
     this.estoque = estoque;
 }

 // Métodos Get e Set para genero
 public String getGenero() {
     return genero;
 }
 public void setGenero(String genero) {
     this.genero = genero;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Plataforma: " + plataforma);
     System.out.println("Preço: " + preco);
     System.out.println("Estoque: " + estoque);
     System.out.println("Gênero: " + genero);
 }
}

//Classe TestaGame
public class TestaGame {
 public static void main(String[] args) {
     // Instanciando objetos da classe Produto
     Produto game1 = new Produto("The Last of Us Part II", "PlayStation 4", 199.99, 50, "Ação e Aventura");
     Produto game2 = new Produto("Animal Crossing: New Horizons", "Nintendo Switch", 179.99, 30, "Simulação");

     // Exibindo informações dos produtos
     System.out.println("Informações do Produto 1:");
     game1.visualizar();
     System.out.println("\nInformações do Produto 2:");
     game2.visualizar();
 }
}
