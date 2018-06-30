
package testeDeSoftware;

/**
 *
 * @author Rian Alves
 */
public class TurmaAluno {
    private String turma;
    private String professor;
    private String nomeAluno;
    private String notaFinal;

    public TurmaAluno(String turma, String professor, String nomeAluno, String notaFinal) {
        this.turma = turma;
        this.professor = professor;
        this.nomeAluno = nomeAluno;
        this.notaFinal = notaFinal;
    }
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the notaFinal
     */
    public String getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(String notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
