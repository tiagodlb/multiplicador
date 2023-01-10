import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        Scanner scan = new Scanner(System.in);
        logger.info("Enter the number");
        
        int numero = scan.nextInt();
        multiplicador tabela = new multiplicador();
        tabela.imprimir(numero);
    }
}
