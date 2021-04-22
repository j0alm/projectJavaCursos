
package projetoobjetosformandos;


public class Candidaturas {
    private int idMatricula;
    short idFormando;
    short idCurso;
    
    public Candidaturas(){
        
    }

    public Candidaturas(int idMatricula, short idFormando, short idCurso) {
        this.idMatricula = idMatricula;
        this.idFormando = idFormando;
        this.idCurso = idCurso;
    }
    
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(short idMatricula) {
        this.idMatricula = idMatricula;
    }

    public short getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(short idFormando) {
        this.idFormando = idFormando;
    }

    public short getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(short idCurso) {
        this.idCurso = idCurso;
    }
    
    

    @Override
    public String toString() {
        return "Candidaturas{" + "idMatricula=" + idMatricula + ", idFormando=" + idFormando + ", idCurso=" + idCurso + '}';
    }
   
}