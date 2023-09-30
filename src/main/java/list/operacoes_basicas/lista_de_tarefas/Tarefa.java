package main.java.list.operacoes_basicas.lista_de_tarefas;

public class Tarefa {
  // atributo
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return descricao;
  }
}