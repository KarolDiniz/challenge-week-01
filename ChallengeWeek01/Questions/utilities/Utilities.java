package utilities;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {
    /*
     * Esta classe foi desenvolvida com a finalidade de fornecer métodos utilitários
     * para tratar erros. Dessa forma, é possível reduzir a replicação de código nas diversas
     * atividades propostas neste desafio, e assim, consequentemente, aumentar a reutilização
     * de recursos similares em diferentes pontos do código.
     */

    //Verifica se uma entrada em formato de string é válida (não está vazia e/ou não contém números)
    public static String readStringInput(Scanner input, String message) {
        System.out.println(message);
        String value = input.nextLine().trim();
        while (value.isEmpty() || value.matches(".*\\d.*")) {
            System.out.println("\033[31mValor inválido! \033[0m" + message);
            value = input.nextLine().trim();
        }
        return value;
    }

    //Verifica se uma entrada de float é um valor numérico válido
    public static float readFloatInput(Scanner input, String message) {
        System.out.println(message);
        float value = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                value = input.nextFloat();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("\033[31mValor inválido! \033[0m" + message);
                input.nextLine();
            }
        }
        input.nextLine();
        return value;
    }

    //Valida a resposta em formato de 'continuação'("S" para sim ou "N" para não)
    public static String readContinue(Scanner input) {
        String resposta = "";
        do {
            resposta = resposta.toUpperCase();
            resposta = readStringInput(input, "Deseja enviar outra mensagem? (S/N)");
        } while (!resposta.equals("S") && !resposta.equals("N"));
        return resposta;
    }

    // Lê um arquivo JSON e retorna um JSONArray com os dados requeridos
    public static JSONArray readJson(String caminhoArquivo) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(caminhoArquivo));
            return (JSONArray) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
