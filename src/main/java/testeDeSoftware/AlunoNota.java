/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeDeSoftware;

/**
 *
 * @author Rian Alves
 */
public class AlunoNota {
    private int id;
    private String nome;
    private Double nota;

    public AlunoNota(int id, String nome, Double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
}
