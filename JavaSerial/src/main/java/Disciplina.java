/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Worten
 */
import java.io.Serializable;

public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L; 
    private String nomedisciplina;
    private int iddisciplina;
    private int horasdisciplinas;
    private String nomecurso;

    public Disciplina(String nomedisciplina, int iddisciplina, int horasdisciplinas, String nomecurso) {
        this.nomedisciplina = nomedisciplina;
        this.iddisciplina = iddisciplina;
        this.horasdisciplinas = horasdisciplinas;
        this.nomecurso = nomecurso;

    }

    Disciplina() {
    }

    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }

    public int getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
    }
    
    public int getHorasdisciplinas() {
        return horasdisciplinas;
    }
    
     public void setHorasdisciplinas(int horasdisciplinas) {
        this.horasdisciplinas = horasdisciplinas;
    }
       public String getNomecurso() {
        return nomecurso;
    }
    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nomedisciplina=" + nomedisciplina + ", iddisciplina=" + iddisciplina + ", horasdisciplinas=" + horasdisciplinas +  ", Nome do Curso=" + nomecurso +'}';
    }

}

