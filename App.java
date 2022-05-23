import aula02.Caneta;

public class App{
    public static void main(String[] args)  throws Exception{
        Caneta c1 = new Caneta ();
        c1.modelo = "Bic cristar";
        c1.cor = "Roso";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = false;
        c1.status();
        c1.rabiscar();
    }
}