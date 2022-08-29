import Model.carro;

public class APP {
    public static void main(String[] args) {
        
        
        carro gol = new carro("BSD6432", 1664);
        //gol.setPlaca("BSD6432");
        //gol.setNumChassi(1664);

        System.out.printf("Carro contém a placa %s e o número do chassi %d",  gol.getPlaca(),gol.getNumChassi());

        

    }
}