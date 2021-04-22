package projetoobjetosformandos;

import java.util.Scanner;

public class Menus {

    Scanner sc = new Scanner(System.in);

    short showMenuPrincipal() {
        short escolha = 0;

        do {
            System.out.println("===================");
            System.out.println(" 1. Formandos ");
            System.out.println(" 2. Cursos");
            System.out.println(" 3. Disciplinas");
            System.out.println(" 4. Disciplinas do Curso");
            System.out.println(" 5. Candidaturas");
            System.out.println();
            System.out.println(" 9. Sair");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção:");
            System.out.println();
            escolha = sc.nextShort();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha !=4 && escolha !=5 && escolha != 9);
        return escolha;

    }

    public short showMenuSecundario(String tipo) {
        short escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Inserir " + tipo);
            System.out.println(" 2. Modificar " + tipo);
            System.out.println(" 3. Eliminar " + tipo);
            System.out.println(" 4. Listar ");
            System.out.println();
            System.out.println("9. Sair");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            System.out.println();
            escolha = sc.nextShort();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
        return escolha;

    }

}