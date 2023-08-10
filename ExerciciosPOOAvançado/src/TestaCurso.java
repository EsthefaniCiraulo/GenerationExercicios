
class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

class CursoLivre extends Curso {
    private String patrocinador;

    public CursoLivre(String nome, int cargaHoraria, String patrocinador) {
        super(nome, cargaHoraria);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void visualizar() {
        System.out.println("Curso Livre:");
        System.out.println("Nome: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Patrocinador: " + patrocinador);
    }
}

class Especializacao extends Curso {
    private String certificado;

    public Especializacao(String nome, int cargaHoraria, String certificado) {
        super(nome, cargaHoraria);
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public void visualizar() {
        System.out.println("Curso de Especialização:");
        System.out.println("Nome: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Certificado: " + certificado);
    }
}

public class TestaCurso {
    public static void main(String[] args) {
        CursoLivre cursoLivre1 = new CursoLivre("Programação Java", 40, "Empresa A");
        CursoLivre cursoLivre2 = new CursoLivre("Design Gráfico", 30, "Empresa B");

        Especializacao especializacao1 = new Especializacao("MBA em Gestão", 360, "Certificado Reconhecido pelo MEC");
        Especializacao especializacao2 = new Especializacao("Especialização em Direito Ambiental", 400, "Certificado Reconhecido pelo MEC");

        cursoLivre1.visualizar();
        System.out.println();
        cursoLivre2.visualizar();
        System.out.println();
        especializacao1.visualizar();
        System.out.println();
        especializacao2.visualizar();
    }
}
