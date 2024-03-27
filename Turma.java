public class Turma {
  // Atributos da classe Turma
  private String nomeTurma;
  private int numeroAlunos;
  private boolean tecnico;

  // Construtor da classe Turma

  public Turma() {

  };

  public Turma(String nomeTurma, int numeroAlunos, boolean tecnico) {
    this.setNomeTurma(nomeTurma);
    this.setNumeroAlunos(numeroAlunos);
    this.setTecnico(tecnico);
  }

  // Getters e Setters da classe Turma

  public void setNomeTurma(String nomeTurma) {
    this.nomeTurma = nomeTurma;
  }

  public void setNumeroAlunos(int numeroAlunos) {
    this.numeroAlunos = numeroAlunos;
  }

  public void setTecnico(boolean tecnico) {
    this.tecnico = tecnico;
  }

  public String getNomeTurma() {
    return nomeTurma;
  }

  public int getNumeroAlunos() {
    return numeroAlunos;
  }

  public boolean getTecnico() {
    return this.tecnico;
  }

}