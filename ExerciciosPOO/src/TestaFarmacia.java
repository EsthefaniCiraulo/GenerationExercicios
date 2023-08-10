
//Classe Farmacia
class Farmacia {
 private String nome;
 private String tipo;
 private double preco;
 private int estoque;
 private String fabricante;

 // Construtor
 public Farmacia(String nome, String tipo, double preco, int estoque, String fabricante) {
     this.nome = nome;
     this.tipo = tipo;
     this.preco = preco;
     this.estoque = estoque;
     this.fabricante = fabricante;
 }

 // Métodos Get e Set para nome
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Métodos Get e Set para tipo
 public String getTipo() {
     return tipo;
 }
 public void setTipo(String tipo) {
     this.tipo = tipo;
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

 // Métodos Get e Set para fabricante
 public String getFabricante() {
     return fabricante;
 }
 public void setFabricante(String fabricante) {
     this.fabricante = fabricante;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Tipo: " + tipo);
     System.out.println("Preço: " + preco);
     System.out.println("Estoque: " + estoque);
     System.out.println("Fabricante: " + fabricante);
 }
}

//Classe TestaFarmacia
public class TestaFarmacia {
 public static void main(String[] args) {
     // Instanciando objetos da classe Farmacia
     Farmacia produto1 = new Farmacia("Paracetamol", "Analgésico", 10.99, 100, "Genérico");
     Farmacia produto2 = new Farmacia("Vitamina C", "Suplemento", 15.50, 50, "Marca A");

     // Exibindo informações dos produtos
     System.out.println("Informações do Produto 1:");
     produto1.visualizar();
     System.out.println("\nInformações do Produto 2:");
     produto2.visualizar();
 }
}
