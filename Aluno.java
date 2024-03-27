public class Aluno {

  private String nome;
  private int idade;
  private String matricula;

  // Construtores

  public Aluno() {

  }

  public Aluno(String nome, int idade, String matricula) {
    this.setNome(nome);
    this.setIdade(idade);
    this.setMatricula(matricula);
  }

  // todos os SETs

  public void setNome(String nome) {

    this.validarNomeDoAluno(nome);

  }

  public void setIdade(int idade) {

    this.validarIdadeDoAluno(idade);

  }

  public void setMatricula(String matricula) {

    this.validarMatriculaDoAluno(matricula);

  }

  // todos os GETs

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getMatricula() {
    return this.matricula;
  }

  // todas as validações

  private void validarNomeDoAluno(String nome) {
    if (nome.matches("[a-zA-zÀ-ú ]+")) {
      this.nome = nome;
    } else {

      System.out.println("Nome do aluno invalido podendo conter apenas letras e espaços");

    }

  }

  private void validarIdadeDoAluno(int idade) {
    if (idade >= 0 && idade <= 100) {
      this.idade = idade;
    } else {
      System.out.println("Idade do aluno invalida");
    }
  }

  private void validarMatriculaDoAluno(String matricula) {
    if (matricula.matches("[0-9]{11}")) {

      this.matricula = matricula;

    } else {

      System.out.println("Matricula do aluno invalida");

    }

  }

}