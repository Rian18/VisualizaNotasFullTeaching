
package testeDeSoftware;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rian Alves
 */
public class Turma {
    private int id;
    private String professor;
    private String disciplina;
    private List<AlunoNota> lstAluno = new ArrayList<>();

    public Turma() {
    }

    public Turma(int id, String professor, String disciplina) {
        this.id = id;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the lstAluno
     */
    public List<AlunoNota> getLstAluno() {
        return lstAluno;
    }

    /**
     * @param lstAluno the lstAluno to set
     */
    public void setLstAluno(List<AlunoNota> lstAluno) {
        this.lstAluno = lstAluno;
    }
    
    
}
