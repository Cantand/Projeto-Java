package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada" + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }else {
             System.out.println("Estou Rabiscando");
        }
        
    }
    
    protected void trampa() {
     this.tampada = true;
    }

    protected void desctampar() {
        this.tampada = false;

    }
}



