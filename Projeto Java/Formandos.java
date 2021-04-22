
package projetoobjetosformandos;


public class Formandos {
    
    private short idFormando;
    private String nomeFormando;
    private short idade;
    private boolean masculino;
    private int numTelefone;
    
    public Formandos(){
        
    }

    public Formandos(short idFormando, String nomeFormando, short idade, boolean masculino, int numTelefone) {
        this.idFormando = idFormando;
        this.nomeFormando = nomeFormando;
        this.idade = idade;
        this.masculino = masculino;
        this.numTelefone = numTelefone;
    }

    public short getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(short idFormando) {
        this.idFormando = idFormando;
    }

    public String getNomeFormando() {
        return nomeFormando;
    }

    public void setNomeFormando(String nomeFormando) {
        this.nomeFormando = nomeFormando;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return "Formandos{" + "idFormando=" + idFormando + ", nomeFormando=" + nomeFormando + ", idade=" + idade + ", masculino=" + masculino + ", numTelefone=" + numTelefone + '}';
    }
    
    
    
    
    
}