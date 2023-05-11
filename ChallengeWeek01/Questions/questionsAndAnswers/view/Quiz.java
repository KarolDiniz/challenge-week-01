package questionsAndAnswers.view;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import utilities.Utilities;

import java.util.Scanner;

/*
 * Essa classe refere-se a um Quiz que lê um arquivo JSON contendo perguntas
 * e respostas, assim, ele solicita o nome do usuário, exibe as perguntas e
 * espera que o usuário digite a resposta, após isso ele as valida e retorna
 * um resultado.
 * Link .jar JSON: https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/json-simple/json-simple-1.1.1.jar
 * */
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acertos = 0, erros = 0;
        double notaFinal;
        JSONArray perguntas = Utilities.readJson("C:\\Users\\carlo\\challenge\\ChallengeWeek01\\Questions\\questionsAndAnswers\\json\\output.json");
        int size = perguntas.size();
        System.out.println("\u001B[36m ---- QUIZ ---- \033[0m");
        System.out.print("Insira seu nome: ");
        String nomeUser = input.nextLine();
        System.out.println("\nOlá, " + nomeUser + "! Bem-vindo(a) ao quiz.");
        System.out.println("Responda os enunciados a seguir: ");

        JSONObject pergunta;
        for (int i = 0; i < size; i++) {
            pergunta = (JSONObject) perguntas.get(i);
            String enunciado = (String) pergunta.get("enunciado"); //Exibe o enunciado
            System.out.println("\n" + (i + 1) + ") " + enunciado);

            String respostaUser = input.nextLine().toLowerCase();
            while (respostaUser.isEmpty()) {
                System.out.println("Campo em branco! Insira algo:");
                respostaUser = input.nextLine().toLowerCase();
            }

            //Recebe a resposta correta e verifica se o user acertou, após isso, incrementa-se aos erros ou acertos
            String respostaEnunciado = (String) pergunta.get("resposta");
            if (respostaUser.equals(respostaEnunciado)) {
                System.out.println("\u001B[32mA Resposta correta! \033[0m");
                acertos++;
            } else {
                System.out.print("\u001B[31mResposta incorreta. \033[0m");
                System.out.print("A resposta correta é: " + "\u001B[32m" + respostaEnunciado + "\033[0m" + "\n");
                erros++;
            }
        }

        System.out.println("\n" + "\u001B[36m ---- QUIZ FINALIZADO! ---- \033[0m" + "\n");
        System.out.println("NOME: " + nomeUser);
        System.out.println("ACERTOS: " + acertos + "\nERROS: " + erros);
    }
}



