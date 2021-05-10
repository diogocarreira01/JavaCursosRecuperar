
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */

    public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomecurso;
     private String nomedisciplina;
    private int idcurso;
    private int horas;

    public Curso(String nomecurso, int idcurso, int horas, String nomedisciplina) {
        this.nomecurso = nomecurso;
        this.idcurso = idcurso;
        this.horas = horas;
        this.nomedisciplina = nomedisciplina;
    }

    
    Curso() {
        
    }
    
    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }
    
    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Curso{" + "nomecurso=" + nomecurso + ", idcurso=" + idcurso + ", horas=" + horas + '}';
    }


    
    
    
}








