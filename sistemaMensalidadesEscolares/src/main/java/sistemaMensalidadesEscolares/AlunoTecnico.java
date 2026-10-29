package sistemaMensalidadesEscolares;

public class AlunoTecnico extends Aluno {

    public String verificarElegibilidadeBolsa() {
        if (this.calcularMediaNotas() >= this.getMediaCorteElegibilidade()) {
            return "Elegível";
        }
        else {
            return "Não Elegível";
        }
    }

    public float getMediaCorteElegibilidade() {
        return 6.0f;
    }

    @Override
    public String getTipoCurso() {
        return "AlunoTecnico";
    }
}
