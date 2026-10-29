package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoTecnicoTest {

    @Test
    void deveRetornarElegivel() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(6.0f);
        assertEquals("Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarNaoElegivel() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(5.9f);
        assertEquals("Não Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(5.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("AlunoTecnico{matricula=2, nome='Marcelo', resultado=Não Elegível}", aluno.getInfo());
    }
}
