package contador;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        // Verifica se foram passados os dois parâmetros esperados
        if (args.length != 2) {
            System.err.println("É necessário passar exatamente dois parâmetros.");
            return;
        }

        // Obtém os parâmetros do terminal
        int parametro1 = Integer.parseInt(args[0]);
        int parametro2 = Integer.parseInt(args[1]);

        // Verifica se o segundo parâmetro é maior que o primeiro
        if (parametro2 <= parametro1) {
            try {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            } catch (ParametrosInvalidosException e) {
                System.err.println(e.getMessage());
                return;
            }
        }

        // Realiza a iteração e imprime os números incrementados
        for (int i = parametro1 + 1; i <= parametro2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
