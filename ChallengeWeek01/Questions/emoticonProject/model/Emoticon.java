package emoticonProject.model;
    /*
    *Esta classe é responsável por representar um emoticon em uma mensagem de texto.
    * Ela também contém métodos que são necessários para a implementação coesa do projeto.
    */
public class Emoticon {
    private String mensagem;
    private int divertidos = 0;
    private int chateados = 0;

    public Emoticon(String mensagem) {
        this.mensagem = mensagem;
        this.counterEmoticons();
    }

    //Responsável por verificar, contar e setar emoticons
    private void counterEmoticons() {
        for (int i = 0; i < mensagem.length() - 1; i++) {
            if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == '-') {
                if (i + 2 < mensagem.length() && mensagem.charAt(i + 2) == ')') { divertidos++;
                } else if (i + 2 < mensagem.length() && mensagem.charAt(i + 2) == '(') { chateados++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\u001B[32mA mensagem: '" + mensagem + "' expressa um sentimento " + getSentimento() + ".\u001B[0m";
    }

    //Responsável por retornar um sentimento de acordo com a quantidade de emoticons
    private String getSentimento() {
        return (divertidos > chateados) ? "diversão"
                : (divertidos == chateados) ? "neutro"
                : "chateado";
    }
}



