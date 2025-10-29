package veiculo;

public class Carro extends Veiculo {

    public void locomover() {
        System.out.println("O carro está se movendo...");
    }
    public static void main(String[] args) {
        
        Carro c = new Carro();
        c.locomover();
    }
}
