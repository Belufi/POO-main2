public class Alunos {

    private int  Prontuario;
    private String Nome;


    public Alunos (String Nome, int Prontuario){
        this.Prontuario = Prontuario;
        this.Nome = Nome;
    }
    
    public Alunos(){}

    public Alunos (int Prontuario){
        this.Prontuario = Prontuario;
    }

    
    public void estudar(){
        System.out.println("Estudando...");
    }

    public int  getProntuario(){
        return Prontuario;
    }

    public String getNome(){
        return Nome;
    }

    public void setProntuario(int  Prontuario) {
        this.Prontuario = Prontuario;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

}