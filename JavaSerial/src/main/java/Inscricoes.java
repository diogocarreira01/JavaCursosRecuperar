
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
  public class Inscricoes implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomecurso;
    private String nomeperson;
    private int idcurso;
    private int idperson;

    public Inscricoes(String nomecurso, String nomeperson, int idcurso, int idperson) {
        this.nomecurso = nomecurso;
        this.idcurso = idcurso;
        this.nomeperson = nomeperson;
        this.idperson = idperson;
    }

    
    Inscricoes() {
        
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

    public String getNomeperson() {
        return nomeperson;
    }

    public void setNomeperson(String nomeperson) {
        this.nomeperson = nomeperson;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }
    
    
    @Override
    public String toString() {
        return "Curso{" + "nomecurso=" + nomecurso + ", idcurso=" + idcurso + ", idperson=" + idperson + ", nomeperson=" + nomeperson + '}';
    }


    
    
    
}
