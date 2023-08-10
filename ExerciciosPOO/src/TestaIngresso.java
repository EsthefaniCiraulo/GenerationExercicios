
//Classe Ingresso
class Ingresso {
 private String nomeEvento;
 private String local;
 private double preco;
 private String data;
 private int quantidadeDisponivel;

 // Construtor
 public Ingresso(String nomeEvento, String local, double preco, String data, int quantidadeDisponivel) {
     this.nomeEvento = nomeEvento;
     this.local = local;
     this.preco = preco;
     this.data = data;
     this.quantidadeDisponivel = quantidadeDisponivel;
 }

 // Métodos Get e Set para nomeEvento
 public String getNomeEvento() {
     return nomeEvento;
 }
 public void setNomeEvento(String nomeEvento) {
     this.nomeEvento = nomeEvento;
 }

 // Métodos Get e Set para local
 public String getLocal() {
     return local;
 }
 public void setLocal(String local) {
     this.local = local;
 }

 // Métodos Get e Set para preco
 public double getPreco() {
     return preco;
 }
 public void setPreco(double preco) {
     this.preco = preco;
 }

 // Métodos Get e Set para data
 public String getData() {
     return data;
 }
 public void setData(String data) {
     this.data = data;
 }

 // Métodos Get e Set para quantidadeDisponivel
 public int getQuantidadeDisponivel() {
     return quantidadeDisponivel;
 }
 public void setQuantidadeDisponivel(int quantidadeDisponivel) {
     this.quantidadeDisponivel = quantidadeDisponivel;
 }

 // Método visualizar
 public void visualizar() {
     System.out.println("Nome do Evento: " + nomeEvento);
     System.out.println("Local: " + local);
     System.out.println("Preço: " + preco);
     System.out.println("Data: " + data);
     System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
 }
}

//Classe TestaIngresso
public class TestaIngresso {
 public static void main(String[] args) {
     // Instanciando objetos da classe Ingresso
     Ingresso ingresso1 = new Ingresso("Concerto de Rock", "Estádio Central", 50.0, "15/08/2023", 1000);
     Ingresso ingresso2 = new Ingresso("Peça de Teatro", "Teatro Municipal", 30.0, "20/08/2023", 500);

     // Exibindo informações dos ingressos
     System.out.println("Informações do Ingresso 1:");
     ingresso1.visualizar();
     System.out.println("\nInformações do Ingresso 2:");
     ingresso2.visualizar();
 }
}
