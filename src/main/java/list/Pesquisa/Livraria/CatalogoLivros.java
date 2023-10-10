package main.java.list.Pesquisa.Livraria;

import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLibvro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livorsPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livorsPorAutor.add(l);
                }
            }
        }
        return livorsPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livorsPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livorsPorIntervaloAnos.add(l);
                }
            }
        }
        return livorsPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLibvro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLibvro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLibvro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLibvro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLibvro("Livro4", "Autor4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));

    }
}
