
class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class Vip extends Ingresso {
    private String tipo;

    public Vip(double valor, String tipo) {
        super(valor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        System.out.println("Ingresso VIP:");
        System.out.println("Valor: " + getValor());
        System.out.println("Tipo: " + tipo);
    }
}

class MeiaEntrada extends Ingresso {
    private String categoria;

    public MeiaEntrada(double valor, String categoria) {
        super(valor);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void visualizar() {
        System.out.println("Ingresso Meia Entrada:");
        System.out.println("Valor: " + getValor());
        System.out.println("Categoria: " + categoria);
    }
}

public class TestaIngresso {
    public static void main(String[] args) {
        Vip vip1 = new Vip(100.0, "Premium");
        Vip vip2 = new Vip(80.0, "Regular");

        MeiaEntrada meia1 = new MeiaEntrada(50.0, "Estudante");
        MeiaEntrada meia2 = new MeiaEntrada(60.0, "Idoso");

        vip1.visualizar();
        System.out.println();
        vip2.visualizar();
        System.out.println();
        meia1.visualizar();
        System.out.println();
        meia2.visualizar();
    }
}
