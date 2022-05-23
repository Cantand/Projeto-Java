public class App {
    public static void main(String[] args) throws Exception {
       // iphone 13. tela 6.1 ; 256 Gb
       // Samsung a33 tela 6.7 ; 128 Gb 
      // Xiaomi Mi 11 Pro , tela de 6.b1 , 64 Gb
      
      
      //Declarando um objeto de tipo Celular = Instanciando um Objeto
      Celula celulaA = new Celula();
      celulaA.nome = "Iphone 13";
      celulaA.tamanhoTela = 6.1f;
      celulaA.espaco = 256;
      celulaA.sistema = "IOS";

      // "Celular " + celular %s com tela de %f , com %d e SO %s"
      System.out.format("Celular %s com tela de %f, com %d e SO %s");



    }
}
