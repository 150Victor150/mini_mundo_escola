public class Main {
  public static void main(String[] args) {

    // Alunos

    Aluno aluno1 = new Aluno("Victor", 16, "00000000001");

    Aluno aluno2 = new Aluno("Vitor", 17, "00000000002");

    Aluno aluno3 = new Aluno("Antoni", 16, "00000000003");

    Aluno aluno4 = new Aluno("Estefani", 18, "00000000004");

    Aluno aluno5 = new Aluno("Joao", 17, "00000000005");

    Aluno aluno6 = new Aluno("Erick", 17, "00000000006");

    Aluno aluno7 = new Aluno("Marco", 17, "00000000007");

    Aluno aluno8 = new Aluno("jose", 17, "00000000008");

    Aluno aluno9 = new Aluno("Vitoria", 17, "00000000009");

    Aluno aluno10 = new Aluno("Gurgel", 17, "00000000010");

    Aluno aluno11 = new Aluno("Maria Eduarda", 17, "00000000011");

    Aluno aluno12 = new Aluno("Maria Vitoria", 17, "00000000012");

    Aluno aluno13 = new Aluno("Hendrwil", 18, "00000000013");

    Aluno aluno14 = new Aluno("kaua", 17, "00000000014");

    Aluno aluno15 = new Aluno("Gydeao", 17, "00000000015");

    Aluno aluno16 = new Aluno("Welington", 18, "00000000016");

    /*
     * System.out.println("Nome do aluno1: " + aluno1.getNome());
     * System.out.println("Idade do Aluno1: " + aluno1.getIdade());
     * System.out.println("Matricula do Aluno1: " + aluno1.getMatricula());
     */

    Sala sala1 = new Sala("Laboratorio_01", 32, 32);

    Sala sala2 = new Sala("Laboratorio_02", 32, 32);

    Sala sala3 = new Sala("Laboratorio Biologia", 32, 32);

    Sala sala4 = new Sala("01", 32, 32);

    Sala sala5 = new Sala("02", 32, 32);

    Sala sala6 = new Sala("03", 32, 32);

    Sala sala7 = new Sala("04", 32, 32);

    Sala sala8 = new Sala("05", 32, 32);

    Sala sala9 = new Sala("06", 32, 32);

    Sala sala10 = new Sala("07", 32, 32);

    Sala sala11 = new Sala("08", 32, 32);

    Sala sala12 = new Sala("09", 32, 32);

    Sala sala13 = new Sala("10", 32, 32);

    Sala sala14 = new Sala("11", 32, 32);

    Sala sala15 = new Sala("12", 32, 32);

    Sala sala16 = new Sala("13", 32, 32);

    Sala sala17 = new Sala("14", 32, 32);

    Sala sala18 = new Sala("15", 32, 32);

    Sala sala19 = new Sala("16", 32, 32);

    Sala sala20 = new Sala("17", 32, 32);

    Sala sala21 = new Sala("18", 32, 32);

    Sala sala22 = new Sala("19", 32, 32);

    Sala sala23 = new Sala("20", 32, 32);

    Sala sala24 = new Sala("21", 32, 32);

    Sala sala25 = new Sala("22", 32, 32);

    /*
     * System.out.println("Numero/Nome da sala1: " + sala1.getNome_numero());
     * System.out.println("Quantidade de alunos da sala1: " +
     * sala1.getQtd_alunos());
     * System.out.println("Capacidade de pessoas da sala1: " +
     * sala1.getCapacidade());
     */

    Turma turma1 = new Turma("3A tec", 16, true);

    Turma turma2 = new Turma("3a", 32, false);

    Turma turma3 = new Turma("3b", 32, false);

    Turma turma4 = new Turma("2a", 32, false);

    Turma turma5 = new Turma("2b", 32, false);

    Turma turma6 = new Turma("1a", 32, false);

    Turma turma7 = new Turma("1b", 32, false);

    Turma turma8 = new Turma("9a", 32, false);

    Turma turma9 = new Turma("9b", 32, false);

    Turma turma10 = new Turma("8a", 32, false);

    Turma turma11 = new Turma("8b", 32, false);

    Turma turma12 = new Turma("7a", 32, false);

    Turma turma13 = new Turma("7b", 32, false);

    Turma turma14 = new Turma("6a", 32, false);

    Turma turma15 = new Turma("6b", 32, false);

    /*
     * System.out.println("Nome da turma1: " + turma1.getNomeTurma());
     * System.out.println("Quantidade de alunos da turma1: " +
     * turma1.getNumeroAlunos());
     * System.out.println("Tecnico da turma1: " + turma1.getTecnico());
     * 
     * Turma turma2 = new Turma("3B", 20, false);
     * 
     * System.out.println("Nome da turma2: " + turma2.getNomeTurma());
     * System.out.println("Quantidade de alunos da turma2: " +
     * turma2.getNumeroAlunos());
     * System.out.println("Tecnico da turma2: " + turma2.getTecnico());
     */

    // diciplinas

    Diciplina diciplina1 = new Diciplina("Matematica", 4, "Marcos");
    Diciplina diciplina2 = new Diciplina("Portugues", 4, "Renata");

    Professor_reg professor1 = new Professor_reg("Norberto", 40, turma1);

    System.out.println("Nome do Professor regente1: " + professor1.getNome());
    System.out.println("Horas aulas do Professor regente1: " + professor1.getHora_aula());
    System.out.println("turma do Professor regente1: " + professor1.getTurma().getNomeTurma());

    Professor_reg professor2 = new Professor_reg("Vinicius", 25, turma2);

    System.out.println("Nome do Professor regente2: " + professor2.getNome());
    System.out.println("Horas aulas do Professor regente2: " + professor2.getHora_aula());
    System.out.println("turma do Professor regente2: " + professor2.getTurma().getNomeTurma());

    Professor_reg professor3 = new Professor_reg("Fernando", 30, turma3);

    System.out.println("Nome do Professor regente3: " + professor3.getNome());
    System.out.println("turma do Professor regente3: " + professor3.getTurma().getNomeTurma());

  }

}