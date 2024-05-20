import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (InputMismatchException ime) {
            System.out.println("Por favor, insira apenas números inteiros.");
        } catch (ParametrosInvalidosException pie) {
            System.out.println(pie.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
