package projetoobjetosformandos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        short idFormando = 0;
        short idCurso = 0;
        short idDisciplina = 0;

        ArrayList<Formandos> listaFormandos = new ArrayList<>();
        ArrayList<Cursos> listaCursos = new ArrayList<>();
        ArrayList<Disciplinas> listaDisciplinas = new ArrayList<>();
        ArrayList<CursoDisciplina> listaCursoDisciplina = new ArrayList<>();
        ArrayList<Candidaturas> listaCandidatura = new ArrayList<>();

        Menus menu = new Menus();
        Continuar continuar = new Continuar();

        short escolha = 0;
        short escolhaSec = 0;

        escolha = menu.showMenuPrincipal();
        do {
            switch (escolha) {

                case 1:
                    do {

                        escolhaSec = menu.showMenuSecundario("Formando");

                        switch (escolhaSec) {
                            case 1:

                                System.out.println();
                                do {

                                    Formandos formando = new Formandos();
                                    Scanner sc = new Scanner(System.in);

                                    formando.setIdFormando(idFormando++);
                                    System.out.println("Nome do Formando: ");
                                    formando.setNomeFormando(sc.nextLine());
                                    System.out.println("Idade :");
                                    formando.setIdade(sc.nextShort());
                                    System.out.println("Masculino (true/false):");
                                    formando.setMasculino(sc.nextBoolean());
                                    System.out.println("Telefone :");
                                    formando.setNumTelefone(sc.nextInt());

                                    listaFormandos.add(formando);

                                } while (continuar.perguntar("Inserir mais um Formando?"));
                                break;

                            case 2:
                                System.out.println();

                                if (listaFormandos.isEmpty()) {
                                    System.out.println("Não há formandos !");
                                } else {
                                    Scanner sc = new Scanner(System.in);
                                    Scanner sc1 = new Scanner(System.in);

                                    for (Formandos f : listaFormandos) {
                                        System.out.println(f.toString());
                                    }

                                    System.out.println("ID do formando");
                                    int id = sc.nextInt();

                                    try {

                                        Formandos formando = listaFormandos.get(id);

                                        System.out.println("Nome do Formando: ");
                                        String nome = sc.nextLine();
                                        nome = formando.getNomeFormando();
                                        if (!nome.isEmpty()) {

                                            formando.setNomeFormando(sc.nextLine());
                                        }

                                        System.out.println("Idade: ");
                                        short idade = sc.nextShort();
                                        short idade1 = formando.getIdade();
                                        if (idade != idade1) {
                                            formando.setIdade(idade);
                                        }

                                        System.out.println("Masculino (true/false):");
                                        String genero = sc1.nextLine();
                                        if (!genero.isEmpty()) {
                                            formando.setMasculino((genero.equals("true")) ? true : false);
                                        }

                                        System.out.println("Insira o novo número de telefone :");
                                        int telefone = sc.nextInt();
                                        int telefone1 = formando.getNumTelefone();
                                        if (telefone != telefone1) {
                                            formando.setNumTelefone(telefone);
                                        }

                                    } catch (Exception e) {

                                        System.out.println("O formando " + id + " não existe");

                                    }
                                }
                                break;

                            case 3: //Eliminar Formandos

                                System.out.println();
                                if (listaFormandos.isEmpty()) {
                                    System.out.println("Não há formandos !");
                                } else {

                                    Scanner sc = new Scanner(System.in);

                                    for (Formandos f : listaFormandos) {
                                        System.out.println(f.toString());
                                    }

                                    System.out.println("ID do formando");
                                    int id = sc.nextInt();

                                    try {

                                        Formandos formando = listaFormandos.get(id);
                                        listaFormandos.remove(id);

                                    } catch (Exception e) {

                                        System.out.println("O formando " + id + " não existe");
                                    }
                                }
                                break;

                            case 4:

                                System.out.println();

                                if (listaFormandos.isEmpty()) {
                                    System.out.println("Não há formandos !");
                                } else {

                                    for (Formandos f : listaFormandos) {
                                        System.out.println(f.toString());
                                    }
                                    System.out.println();

                                }

                                break;
                            //Fim do case 4 Formando
                        }

                    } while (escolhaSec != 9);

                case 2:
                    do {
                        escolhaSec = menu.showMenuSecundario("Curso");

                        switch (escolhaSec) {
                            case 1:
                                System.out.println();

                                do {
                                    Cursos curso = new Cursos();
                                    Scanner sc1 = new Scanner(System.in);

                                    curso.setIdCurso(idCurso++);
                                    System.out.println("Nome do Curso: ");
                                    curso.setNomeCurso(sc1.nextLine());
                                    System.out.println("Número total de horas do curso :");
                                    curso.setTotalHorasCurso(sc1.nextShort());
                                    System.out.println("Número de vagas :");
                                    curso.setNumVagas(sc1.nextShort());
                                    System.out.println("Número de Disciplinas :");
                                    curso.setNumDisciplinas(sc1.nextShort());

                                    listaCursos.add(curso);

                                } while (continuar.perguntar("Deseja inserir mais um Curso?"));
                                break;
                            //Fim do case 1 Curso

                            case 2:
                                System.out.println();

                                if (listaCursos.isEmpty()) {
                                    System.out.println("Não há cursos !");
                                } else {
                                    Scanner sc1 = new Scanner(System.in);
                                    Scanner sc2 = new Scanner(System.in);

                                    for (Cursos c : listaCursos) {
                                        System.out.println(c.toString());
                                    }

                                    System.out.println("ID do curso");
                                    int id = sc1.nextInt();

                                    try {

                                        Cursos curso = listaCursos.get(id);

                                        System.out.println("Nome do Curso: ");
                                        String nome = sc1.nextLine();
                                        nome = curso.getNomeCurso();
                                        if (!nome.isEmpty()) {
                                            curso.setNomeCurso(sc1.nextLine());
                                        }

                                        System.out.println("Total de Horas do Curso: ");
                                        short totalHorasCurso = sc1.nextShort();
                                        short totalHorasCurso1 = curso.getTotalHorasCurso();
                                        if (totalHorasCurso != totalHorasCurso1) {
                                            curso.setTotalHorasCurso(totalHorasCurso);
                                        }

                                        System.out.println("Nº de vagas: ");
                                        short vagas = sc1.nextShort();
                                        short vagas1 = curso.getNumVagas();
                                        if (vagas != vagas1) {
                                            curso.setNumVagas(vagas);
                                        }

                                        System.out.println("Nº de Disciplinas: ");
                                        short disc = sc1.nextShort();
                                        short disc1 = curso.getNumDisciplinas();
                                        if (disc != disc1) {
                                            curso.setNumDisciplinas(disc);
                                        }

                                    } catch (Exception e) {
                                        System.out.println("O curso " + id + " não existe");
                                    }

                                }
                                break;
                            //Fim do case 2 Curso

                            case 3:
                                System.out.println();

                                if (listaCursos.isEmpty()) {
                                    System.out.println("Não há cursos !");
                                } else {

                                    Scanner sc1 = new Scanner(System.in);

                                    for (Cursos c : listaCursos) {
                                        System.out.println(c.toString());
                                    }

                                    System.out.println("ID do curso");
                                    int id = sc1.nextInt();

                                    try {

                                        Cursos curso = listaCursos.get(id);

                                        listaCursos.remove(id);

                                    } catch (Exception e) {

                                        System.out.println("O curso " + id + " não existe");
                                    }
                                }
                                break;
                            //Fim do case 3 Curso

                            case 4:
                                System.out.println("--- Lista dos Cursos ---");

                                if (listaCursos.isEmpty()) {
                                    System.out.println("Não há cursos !");
                                } else {
                                    for (Cursos c : listaCursos) {
                                        System.out.println(c.toString());
                                    }
                                }
                                break;
                            //Fim do case 4 Curso

                        }//Fim do Switch MenuSec

                    } while (escolhaSec != 9);

                case 3:
                    do {
                        escolhaSec = menu.showMenuSecundario("Disciplina");

                        switch (escolhaSec) {
                            case 1:
                                System.out.println();

                                do {
                                    Disciplinas disciplina = new Disciplinas();
                                    Scanner sc2 = new Scanner(System.in);

                                    disciplina.setIdDisciplina(idDisciplina++);
                                    System.out.println("Nome da Disciplina : ");
                                    disciplina.setNomeDisciplina(sc2.nextLine());
                                    System.out.println("Número de Horas da disciplina :");
                                    disciplina.setTotalHoras(sc2.nextShort());

                                    listaDisciplinas.add(disciplina);
                                } while (continuar.perguntar("Deseja introduzir mais uma Disciplina? "));
                                break;
                            //fim do case 1 Disciplina

                            case 2:
                                System.out.println();

                                if (listaDisciplinas.isEmpty()) {
                                    System.out.println("Não há Disciplinas !");
                                } else {
                                    Scanner sc = new Scanner(System.in);

                                    for (Disciplinas d : listaDisciplinas) {
                                        System.out.println(d.toString());
                                    }

                                    System.out.println("ID da disciplina");
                                    int id = sc.nextInt();

                                    try {
                                        Disciplinas disciplina = listaDisciplinas.get(id);

                                        System.out.println("Nome da Disciplina: ");
                                        String nome = sc.nextLine();
                                        nome = disciplina.getNomeDisciplina();
                                        if (!nome.isEmpty()) {
                                            disciplina.setNomeDisciplina(sc.nextLine());
                                        }

                                        System.out.println("Total de Horas da Disciplina: ");
                                        short totalHorasDisc = sc.nextShort();
                                        short totalHorasDisc1 = disciplina.getTotalHoras();

                                        if (totalHorasDisc != totalHorasDisc1) {
                                            disciplina.setTotalHoras(totalHorasDisc);
                                        }

                                    } catch (Exception e) {
                                        System.out.println("A disciplina " + id + " não existe");
                                    }
                                }
                                break;
                            //fim do case 2

                            case 3:
                                System.out.println();

                                if (listaDisciplinas.isEmpty()) {
                                    System.out.println("Não há Disciplinas !");
                                } else {

                                    Scanner sc = new Scanner(System.in);

                                    for (Disciplinas d : listaDisciplinas) {
                                        System.out.println(d.toString());
                                    }

                                    System.out.println("ID da disciplina");
                                    short id = sc.nextShort();

                                    try {

                                        Disciplinas disciplina = listaDisciplinas.get(id);

                                        listaDisciplinas.remove(id);

                                    } catch (Exception e) {

                                        System.out.println("A disciplina " + id + " não existe");
                                    }
                                }
                                break;
                            //Fim do case 3 Disciplina

                            case 4:
                                System.out.println("--- Lista das Disciplinas ---");

                                if (listaDisciplinas.isEmpty()) {
                                    System.out.println("Não há Disciplinas !");
                                } else {

                                    for (Disciplinas d : listaDisciplinas) {
                                        System.out.println(d.toString());
                                    }

                                }
                                break;

                        }//Fim do Switch MenuSec
                    } while (escolhaSec != 9);

                case 4:
                    do {
                        escolhaSec = menu.showMenuSecundario("Disciplinas de Cursos");

                        switch (escolhaSec) {

                            case 1:
                                System.out.println();

                                do {
                                    CursoDisciplina cursodisciplina = new CursoDisciplina();
                                    Scanner sc2 = new Scanner(System.in);

                                    System.out.println("Insere o ID do Curso : ");
                                    short idInserido = sc2.nextShort();
                                    System.out.println("Insere o ID da Disciplina : ");
                                    short idDisc = sc2.nextShort();
                                    cursodisciplina.setIdCurso(idInserido);
                                    cursodisciplina.setIdDisciplina(idDisc);

                                    listaCursoDisciplina.add(cursodisciplina);

                                } while (continuar.perguntar("Deseja inserir mais disciplinas para os cursos?"));//Fim do Switch MenuSec
                                break;

                            case 2:
                                System.out.println();

                                if (listaCursoDisciplina.isEmpty()) {
                                    System.out.println("Não há Cursos com Disciplinas !");
                                } else {
                                    Scanner sc = new Scanner(System.in);

                                    for (CursoDisciplina cdisc : listaCursoDisciplina) {
                                        System.out.println(cdisc.toString());
                                    }

                                    System.out.println("ID do Curso");
                                    int id = sc.nextInt();

                                    try {
                                        CursoDisciplina cursodisciplina = listaCursoDisciplina.get(id);

                                        System.out.println("Novo ID do Curso  ");
                                        short novoID = sc.nextShort();
                                        short novoID1 = cursodisciplina.getIdCurso();
                                        if (novoID != novoID1) {
                                            cursodisciplina.setIdCurso(novoID);
                                        }

                                        System.out.println("Novo ID da Disciplina: ");
                                        short novoIDdisc = sc.nextShort();
                                        short novoIDdisc1 = cursodisciplina.getIdDisciplina();

                                        if (novoIDdisc != novoIDdisc1) {
                                            cursodisciplina.setIdDisciplina(novoIDdisc);
                                        }

                                    } catch (Exception e) {
                                        System.out.println("Não foi possivel modificar.");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println();

                                if (listaCursoDisciplina.isEmpty()) {
                                    System.out.println("Não há Cursos com disciplinas !");
                                } else {

                                    Scanner sc = new Scanner(System.in);

                                    for (CursoDisciplina cdisc : listaCursoDisciplina) {
                                        System.out.println(cdisc.toString());
                                    }

                                    System.out.println("ID do Curso");
                                    short id = sc.nextShort();

                                    try {

                                        CursoDisciplina cursodisciplina = listaCursoDisciplina.get(id);

                                        listaCursoDisciplina.remove(id);

                                    } catch (Exception e) {

                                        System.out.println("A disciplina " + id + " não existe");
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("--- Lista dos Cursos com Disciplinas ---");

                                if (listaCursoDisciplina.isEmpty()) {
                                    System.out.println("Não há Cursos com Disciplinas !");
                                } else {

                                    for (CursoDisciplina cdisc : listaCursoDisciplina) {
                                        System.out.println(cdisc.toString());
                                    }

                                }
                                break;

                        }

                    } while (escolhaSec != 9);

                case 5:
                    do {
                        escolhaSec = menu.showMenuSecundario("Candidatura");

                        switch (escolhaSec) {

                            case 1:
                                System.out.println();

                                short idMatricula = 0;

                                do {
                                    Candidaturas candidatura = new Candidaturas();
                                    Scanner scan = new Scanner(System.in);

                                    for (Cursos c : listaCursos) {
                                        System.out.println(c.toString());
                                    }

                                    candidatura.setIdMatricula(idMatricula++);
                                    System.out.println("Insira o ID do Formando: ");
                                    short newID = scan.nextShort();
                                    System.out.println("Insira o ID do Curso: ");
                                    short newIDcurso = scan.nextShort();
                                    candidatura.setIdFormando(newID);
                                    candidatura.setIdCurso(newIDcurso);

                                    listaCandidatura.add(candidatura);

                                } while (continuar.perguntar("Deseja inserir mais inscrições?"));
                                break;

                            case 2:
                                System.out.println();

                                if (listaCandidatura.isEmpty()) {
                                    System.out.println("Não há Candidaturas !");
                                } else {
                                    Scanner sc = new Scanner(System.in);

                                    for (Candidaturas ca : listaCandidatura) {
                                        System.out.println(ca.toString());
                                    }

                                    System.out.println("ID da matricula");
                                    int id = sc.nextInt();

                                    try {
                                        Candidaturas candidatura = listaCandidatura.get(id);

                                        System.out.println("Novo ID do Formando  ");
                                        short novoID = sc.nextShort();
                                        short novoID1 = candidatura.getIdFormando();
                                        if (novoID != novoID1) {
                                            candidatura.setIdFormando(novoID);
                                        }

                                        System.out.println("Novo ID do Curso: ");
                                        short novoIDcurso = sc.nextShort();
                                        short novoIDcurso1 = candidatura.getIdCurso();

                                        if (novoIDcurso != novoIDcurso1) {
                                            candidatura.setIdCurso(novoIDcurso);
                                        }

                                    } catch (Exception e) {
                                        System.out.println("Não foi possivel modificar.");
                                    }
                                }
                                break;
                            //fim do case 2
                            case 3:
                                System.out.println();

                                if (listaCandidatura.isEmpty()) {
                                    System.out.println("Não há Candidaturas !");
                                } else {

                                    Scanner sc = new Scanner(System.in);
                                    Scanner sca = new Scanner(System.in);

                                    for (Candidaturas ca : listaCandidatura) {
                                        System.out.println(ca.toString());
                                    }

                                    System.out.println("Deseja eliminar todas as candidaturas? (sim ou s)");
                                    String res = sca.nextLine();

                                    if (res.equals("sim") || res.equals("s")) {
                                        listaCandidatura.clear();
                                        break;
                                    } else {

                                        System.out.println("ID da matricula");
                                        short id = sc.nextShort();

                                        try {
                                            Disciplinas disciplina = listaDisciplinas.get(id);

                                            listaCandidatura.remove(id);

                                        } catch (Exception e) {

                                            System.out.println("A matricula " + id + " não existe");
                                        }
                                    }
                                }
                                break;
                            //Fim do case 3
                            case 4:
                                System.out.println("Lista das candidaturas");

                                if (listaCandidatura.isEmpty()) {
                                    System.out.println("Não há Candidaturas !");
                                } else {

                                    for (Candidaturas ca : listaCandidatura) {
                                        System.out.println(ca.toString());
                                    }

                                }
                        }
                        break;

                    } while (escolhaSec != 9);

            }

        } while (escolha != 9);

    }

}