package emoticonProject.view;
import java.util.Scanner;
import emoticonProject.model.Emoticon;
import utilities.Utilities;

/*
 * Essa classe é responsável pela execução do programa, realizando assim, a
 * interação com o usurário via console.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\u001B[36m ---- EMOTICON'S PROJECT ---- \033[0m");
        System.out.println("      Seja bem-vindo!            \n");

        boolean continuar = true;
        while (continuar) {
            //Invoca um método útil do pacote utilities.
            String mensagem = Utilities.readStringInput(input, "Insira uma mensagem aqui: ");
            Emoticon emoticon = new Emoticon(mensagem);
            System.out.println(emoticon.toString());

            String resposta = Utilities.readStringInput(input, "Deseja enviar outra mensagem? (S/N)");
            if (resposta.equals("N")) {
                continuar = false;
            }
        }
    }
}
