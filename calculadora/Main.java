package projetos.calculadora;
import java.util.Scanner;

public class Main {

    public static void Soma(double a, double b) {
        System.out.println("Soma dos números fornecidos: " + (a + b));
    }
    public static void Subtracao(double a, double b) {
        System.out.println("Subtração dos números fornecidos: " + (a - b));
    }
    public static void Multiplicacao(double a, double b) {
        System.out.println("Multiplicação dos números fornecidos: " + a * b);;
    }
    public static void Divisao(double a, double b) {
        System.out.println("Divisão dos números fornecidos: " + a / b);;
    }

    public static double teste() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o valor do número");
            String oneNumber = scanner.next();
            try {
                double firstNumberParsed = Double.parseDouble(oneNumber);
                return firstNumberParsed;

            } catch (NumberFormatException e) {

                System.out.println("O valor não é válido, insira um valor numérico para continuar");

            }
        } while (true);


    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("========================================================================\n" +
                    "Essa é a sua calculadora das quatro operações básicas, escolha uma operação:\n\n" +
                    "1- Soma\n" +
                    "2- Subtracao\n" +
                    "3- Multiplicacao\n" +
                    "4- Divisao\n" +
                    "5- Mostrar todas\n" +
                    "6- Sair\n" +
                    "========================================================================");

            opcao = scanner.nextInt();
            double firstNumber = 0;
            double secondNumber = 0;

            if (opcao > 0 && opcao <= 6) {
                firstNumber = teste();
                secondNumber = teste();
            }

            switch (opcao) {
                case 1: Soma(firstNumber, secondNumber);
                break;
                case 2: Subtracao(firstNumber, secondNumber);
                    break;
                case 3: Multiplicacao(firstNumber, secondNumber);
                break;
                case 4: Divisao(firstNumber, secondNumber);
                    break;
                case 5: Soma(firstNumber, secondNumber);
                        Subtracao(firstNumber, secondNumber);
                        Multiplicacao(firstNumber, secondNumber);
                        Divisao(firstNumber, secondNumber);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

    }
}
