public class Sala {
  private String nome_numero;
  private int qtd_alunos;
  private int capacidade;

  // construtores

  public Sala() {

  }

  public Sala(String nome_numero, int qtd_alunos, int capacidade) {
    this.setNome_numero(nome_numero);
    this.setQtd_alunos(qtd_alunos);
    this.setCapacidade(capacidade);
  }

  // todos os SETs

  public void setNome_numero(String nome_numero) {
    this.nome_numero = nome_numero;
  }

  public void setQtd_alunos(int qtd_alunos) {
    this.validarQtd_alunos(qtd_alunos);
  }

  public void setCapacidade(int capacidade) {
    this.validarCapacidade(capacidade);
  }

  // todos os GETs

  public String getNome_numero() {
    return this.nome_numero;
  }

  public int getQtd_alunos() {
    return this.qtd_alunos;
  }

  public int getCapacidade() {
    return this.capacidade;
  }

  // todas as validações

  private void validarQtd_alunos(int qtd_alunos) {
    if (qtd_alunos >= 0 && qtd_alunos <= 50) {
      this.qtd_alunos = qtd_alunos;
    } else {
      System.out.println("Quantidade invalida de alunos");
    }
  }

  private void validarCapacidade(int capacidade) {
    if (capacidade >= 0 && capacidade <= 50) {
      this.capacidade = capacidade;
    } else {
      System.out.println("Capaciade invalida de alunos");
    }
  }
}