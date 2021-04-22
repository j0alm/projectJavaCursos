package projetoobjetosformandos;

public class Cursos {
    
    private short idCurso;
    private String nomeCurso;
    private short totalHorasCurso;
    private short numVagas;
    private short numDisciplinas;
    
    public Cursos(){
        
    }

    public Cursos(short idCurso, String nomeCurso, short totalHorasCurso, short numVagas, short numDisciplinas) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.totalHorasCurso = totalHorasCurso;
        this.numVagas = numVagas;
        this.numDisciplinas = numDisciplinas;
    }

    public short getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(short idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public short getTotalHorasCurso() {
        return totalHorasCurso;
    }

    public void setTotalHorasCurso(short totalHorasCurso) {
        this.totalHorasCurso = totalHorasCurso;
    }

    public short getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(short numVagas) {
        this.numVagas = numVagas;
    }

    public short getNumDisciplinas() {
        return numDisciplinas;
    }

    public void setNumDisciplinas(short numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }

    @Override
    public String toString() {
        return "Cursos{" + "idCurso=" + idCurso + ", nomeCurso=" + nomeCurso + ", totalHorasCurso=" + totalHorasCurso + ", numVagas=" + numVagas + ", numDisciplinas=" + numDisciplinas + '}';
    }
    
    

}