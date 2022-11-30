import java.util.Locale;
import java.util.Scanner;

/**
 * Tic Tac Toe, Jogo do Galo ou Jogo da Velha.
 * @author Pedro D. Tauzen
 * @version 2022/11/28
 *
 */

public class TicTacToe {

    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','

    static String[] gameBoard; // o array de strings para o jogo
    static String turn; // a string que controla a vez dos jogadores

    public static void main(String[] args) {
        showMainMenu(); // abre o menu principal do jogo
    } // END main

    private static void showMainMenu() {

        System.out.println("JOGO DO GALO");
        System.out.println("Escolha uma das Opções:");
        System.out.println("1 - Novo Jogo");
        System.out.println("2 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            chooseGameMode();
        }
        else if (option == 2) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            showMainMenu();
        }
    } // END showMainMenu

    private static void chooseGameMode() {

        System.out.println("");
        System.out.println("JOGO DO GALO");
        System.out.println("Escolha o seu modo de jogo:");
        System.out.println("1 - Jogador 1 vs Jogador 2");
        System.out.println("2 - Jogador 1 vs Jogador 2 (Menos Empates)");
        System.out.println("3 - Jogador 1 vs Computador");
        System.out.println("4 - Jogador 1 vs Computador (Menos Empates)");
        System.out.println("5 - Voltar ao Menu Principal");
        System.out.println("6 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            showInfoGame1();
        }
        else if (option == 2) {
            showInfoGame2();
        }
        else if (option == 3) {
            showInfoGame3();
        }
        else if (option == 4) {
            showInfoGame4();
        }
        else if (option == 5) {
            showMainMenu();
        }
        else if (option == 6) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            chooseGameMode();
        }
    } // END chooseGameMode

    private static void showInfoGame1() {

        System.out.println("");
        System.out.println("Jogador 1 vs Jogador 2");
        System.out.println("");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Voltar a Escolher Modo de Jogo");
        System.out.println("3 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            startGame01();
        }
        else if (option == 2) {
            chooseGameMode();
        }
        else if (option == 3) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            showMainMenu();
        }
    }

    private static void showInfoGame2() {

        System.out.println("");
        System.out.println("Jogador 1 vs Jogador 2 (Menos Empates)");
        System.out.println("");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Voltar a Escolher Modo de Jogo");
        System.out.println("3 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            showGameBoard();
        }
        else if (option == 2) {
            chooseGameMode();
        }
        else if (option == 3) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            showMainMenu();
        }
    }

    private static void showInfoGame3() {

        System.out.println("");
        System.out.println("Jogador 1 vs Computador");
        System.out.println("");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Voltar a Escolher Modo de Jogo");
        System.out.println("3 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            showGameBoard();
        }
        else if (option == 2) {
            chooseGameMode();
        }
        else if (option == 3) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            showMainMenu();
        }
    }

    private static void showInfoGame4() {

        System.out.println("");
        System.out.println("Jogador 1 vs Computador (Menos Empates)");
        System.out.println("");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Voltar a Escolher Modo de Jogo");
        System.out.println("3 - Sair do Jogo");

        int option = scanner.nextInt();

        if (option == 1) {
            showGameBoard();
        }
        else if (option == 2) {
            chooseGameMode();
        }
        else if (option == 3) {
            System.out.println("Jogo Terminado -_- ");
            System.exit(0);
        }
        else {
            System.out.println("Opção Inválida!");
            showMainMenu();
        }
    }

    private static void startGame01() {
        showGameBoard();
    }

    private static void showGameBoard() {
        System.out.println("");
        System.out.println("********** JOGO DO GALO ***********");
        System.out.println("");
        System.out.println("           |           |           ");
        System.out.println("     " + gameBoard[0] + "     |     " + gameBoard[1] + "     |      " + gameBoard[2] + "      ");
        System.out.println("           |           |           ");
        System.out.println("-----------------------------------");
        System.out.println("           |           |           ");
        System.out.println("     " + gameBoard[3] + "     |     " + gameBoard[4] + "     |      " + gameBoard[5] + "      ");
        System.out.println("           |           |           ");
        System.out.println("-----------------------------------");
        System.out.println("           |           |           ");
        System.out.println("     " + gameBoard[6] + "     |     " + gameBoard[7] + "     |      " + gameBoard[8] + "      ");
        System.out.println("           |           |           ");
        System.out.println("");
    } // END showGameBoard

} // END TicTacToe