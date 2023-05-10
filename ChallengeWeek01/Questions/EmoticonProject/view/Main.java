package EmoticonProject.view;
import java.util.Scanner;
import EmoticonProject.model.Emoticon;
import EmoticonProject.utilities.Utilities;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36m ---- EMOTICON'S PROJECT ---- \033[0m");
        System.out.println("      Seja bem-vindo!            \n");

        boolean continuar = true;
        while (continuar) {
            String mensagem = Utilities.readStringInput(sc, "Insira uma mensagem aqui: ");
            Emoticon emoticon = new Emoticon(mensagem);
            System.out.println(emoticon.toString());

            String resposta = Utilities.readStringInput(sc, "Deseja enviar outra mensagem? (S/N)");
            if (resposta.equals("N")) {
                continuar = false;
            }
        }
    }
}
