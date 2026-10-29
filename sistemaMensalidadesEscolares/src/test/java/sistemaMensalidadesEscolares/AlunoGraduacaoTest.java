package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoGraduacaoTest {

    @Test
    void deveRetornarElegivel() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(7.0f);
        assertEquals("Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarNaoElegivel() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(6.9f);
        assertEquals("Não Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(6.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("Aluno{matricula=2, nome='Marcelo', resultado=Não Elegível}", aluno.getInfo());
    }
}
