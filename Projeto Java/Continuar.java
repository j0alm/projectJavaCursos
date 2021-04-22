package projetoobjetosformandos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Continuar {

    private String pergunta = "Repetir";

    public Continuar() {

    }

    public Continuar(String pergunta) {
        this.pergunta = pergunta;

    }

    public boolean perguntar(String pergunta) {
        return (fazerPergunta(pergunta));
    }

    public boolean fazerPergunta(String pergunta) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pergunta);
        String resposta = sc.nextLine();
        String[] res = new String[]{"Sim", "Ok", "Yes", "s", "y","sim"};
        List<String> sim = Arrays.asList(res);
        if (sim.contains(resposta.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}