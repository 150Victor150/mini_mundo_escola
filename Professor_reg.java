public class Professor_reg {
  String nome;
  int hora_aula;
  Turma turma;

  // construtores

  public Professor_reg() {

  }

  public Professor_reg(String nome, int hora_aula, Turma turma) {
    this.setNome(nome);
    this.setHora_aula(hora_aula);
    this.setTurma(turma);

  }

  // todos os SETs

  public void setNome(String nome) {
    this.validarNomeDoProfessor(nome);

  }

  public void setHora_aula(int hora_aula) {
    this.hora_aula = hora_aula;

  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }

  // todos os GETs

  public String getNome() {
    return this.nome;
  }

  public int getHora_aula() {
    return this.hora_aula;
  }

  public Turma getTurma() {
    return this.turma;
  }

  // todas as validações

  private void validarNomeDoProfessor(String nome) {
    if (nome.matches("[a-zA-zÀ-ú ]+")) {
      this.nome = nome;
    } else {
      System.out.println("Nome do aluno invalido podendo conter apenas letras e espaços");
    }
  }

}