public class Compra {

    private Double saldo;


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public void inicializaSaldo(Double valePresente){
        this.setSaldo(valePresente);
    }

}
