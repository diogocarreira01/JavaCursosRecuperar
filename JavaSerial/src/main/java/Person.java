
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String pais;
    private int ano;
    private String nome;
    private int altura;
    private int idperson;
    private String nomecurso;

    public Person(String pais, int ano, String nome, int height, int idperson, String nomecurso) {
        this.pais = pais;
        this.ano = ano;
        this.nome = nome;
        this.altura = height;
        this.idperson = idperson;
        this.nomecurso = nomecurso;
    }

    Person() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getidperson() {
        return idperson;
    }
    
     public void setidperson(int idperson) {
        this.idperson = idperson;
    }
    
     public String getNomecurso() {
        return nomecurso;
    }
    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
    

    @Override
    public String toString() {
        return "Person{" + "país=" + pais + ", ano=" + ano + ", nome=" + nome + ", altura=" + altura + ", ID Pessoa =" + idperson + ", Nome do Curso=" + nomecurso +'}';
    }

}
