package EmoticonProject.model;

public class Emoticon {
    private String mensagem;
    private int divertidos = 0;
    private int chateados = 0;

    public Emoticon(String mensagem) {
        this.mensagem = mensagem;
        this.counterEmoticons();
    }

    private void counterEmoticons() {
        for (int i = 0; i < mensagem.length() - 1; i++) {
            if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == '-') {
                if (i + 2 < mensagem.length() && mensagem.charAt(i + 2) == ')') {
                    divertidos++;

                } else if (i + 2 < mensagem.length() && mensagem.charAt(i + 2) == '(') {
                    chateados++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\u001B[32mA mensagem: '" +  mensagem + "' expressa um sentimento " + getSentimento() + ".\u001B[0m";
    }

    private String getSentimento() {
        if (divertidos > chateados) {
            return "diversão";
        } else if (divertidos == chateados) {
            return "neutro";
        } else {
            return "chateado";
        }
    }
}



