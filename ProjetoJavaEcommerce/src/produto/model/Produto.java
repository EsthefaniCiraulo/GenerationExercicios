package produto.model;

public class Produto {

	private int codigo;
	private double valor;
	private String nome;
	private String descricao;
	private Boolean ativa;
	private double peso;

	private Produto(int codigo, double valor, String nome, String descricao, Boolean ativa, double peso) {
		this.codigo = codigo;
		this.valor = valor;
		this.nome = nome;
		this.descricao = descricao;
		this.ativa = ativa;
		this.peso = peso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtiva() {
		return ativa;
	}

	private void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static Produto NovoProduto(int codigo, double valor, String nome, String descricao, Boolean ativa,
			double peso) {
		return new Produto(codigo, valor, nome, descricao, ativa, peso);
	}

	public void ExcluirProduto() {
		setAtiva(false);
	}

	public void DetalharProduto() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Detalhe do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Ativo: " + this.ativa);
	}
}
