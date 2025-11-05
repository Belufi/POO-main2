public class Aluno{
    private int  Prontuario;
    private String Nome;


    public Aluno (String Nome, int Prontuario){
        this.Prontuario = Prontuario;
        this.Nome = Nome;
    }
    
    public Aluno(){}

    public Aluno (int Prontuario){
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