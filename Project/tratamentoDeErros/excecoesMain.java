package tratamentoDeErros;

public class excecoesMain {
 

    public static void erroMenuBiblioteca(){

        System.out.println("Opção inválida. Tente novamente.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void erroValorLivro(){
        System.out.println("Valor inválido");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}