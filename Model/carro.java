package Model;

public class carro {
    private String placa;
    private int numChassi;

    
    
    public carro(String placa, int NumChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    
    public carro(String placa, int numChassi){
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public void acelerar(){

    }

    public boolean frear(){
        return false;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        if(placa.length() == 7 && placa.matches("[A-Z]{3}\\d{4}")){
        this.placa = placa;
        }else{
            this.placa = "ERRO!!!";
        }
    }
}
