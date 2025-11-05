

public class Principal {
    
    public static void main(String[] args) {
        //Instanciando um objeto aluno
        System.out.println("Instanciando um objeto aluno");
        Alunos vitor = new Alunos("Vitor Gabriel",80);        
        vitor.setNome("Vitor Gabriel");
        vitor.setProntuario(80 ); 

        Alunos maria = new Alunos();
        maria.setNome("Moriah");
        maria.setProntuario(2020);

        Alunos jose = new Alunos(01);
        jose.setNome("Jose");

        Endereço luz = new Endereço();
        luz.setCep("10293847");
        luz.setRua("romenia");
        luz.setNumero(2);

        System.out.println("O aluno " + vitor.getNome() + " mora na rua: " + luz.getRua() + " De numero:" + luz.getNumero() + " e de CEP: " + luz.getCep());
        System.out.println("Aluno " + vitor.getNome() + " com o prontuario: " + vitor.getProntuario());
        System.out.println("Aluno " + maria.getNome() + " com o prontuario: " + maria.getProntuario());
        System.out.println("Aluno " + jose.getNome() + " com o prontuario: " + jose.getProntuario());
    }
}
