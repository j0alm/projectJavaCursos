package projetoobjetosformandos;

public class Disciplinas {
    
    private short idDisciplina;
    private String nomeDisciplina;
    private short totalHoras;
    
    public Disciplinas(){
        
    }

    public Disciplinas(short idDisciplina, String nomeDisciplina, short totalHoras) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.totalHoras = totalHoras;
    }

    public short getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(short idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public short getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(short totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "idDisciplina=" + idDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", totalHoras=" + totalHoras + '}';
    }
    
    

}