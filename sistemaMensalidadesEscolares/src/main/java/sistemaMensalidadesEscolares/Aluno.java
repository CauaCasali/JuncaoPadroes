package sistemaMensalidadesEscolares;

public abstract class Aluno {

    private int matricula;
    protected String nome;
    private float notaProva;
    private float notaTrabalho;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(float notaProva) {
        this.notaProva = notaProva;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float calcularMediaNotas() {
        return (notaProva + notaTrabalho) / 2;
    }

    public abstract String verificarElegibilidadeBolsa();

    public abstract float getMediaCorteElegibilidade();

    public String getTipoCurso() {
        return "Aluno";
    }

    public String getInfo() {
        return getTipoCurso() + "{matricula=" + this.matricula +
                ", nome='" + this.nome + "', resultado=" + this.verificarElegibilidadeBolsa() + "}";
    }
}
