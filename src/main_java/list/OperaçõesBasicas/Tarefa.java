package main_java.list.OperaçõesBasicas;

public class Tarefa {
  // atributo
  private String descricao;

  public String getDescricao() {
    return descricao;
  }

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String toString() {
    return descricao;
  }
}
