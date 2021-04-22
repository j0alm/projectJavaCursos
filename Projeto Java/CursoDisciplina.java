package projetoobjetosformandos;


public class CursoDisciplina{
    
    private short idCurso;
    private short idDisciplina;
    
    public CursoDisciplina(){
    
}

    public CursoDisciplina(short idCurso, short idDisciplina) {
        this.idCurso = idCurso;
        this.idDisciplina = idDisciplina;
    }
    

    public short getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(short idCurso) {
        this.idCurso = idCurso;
    }

    public short getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(short idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public String toString() {
        return "CursoDisciplina{" + "idCurso=" + idCurso + ", idDisciplina=" + idDisciplina + '}';
    }
    
    
    
    
}