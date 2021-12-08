package com.Projeto_Livro;

public class Livro implements Publicacao {  //Implementes foi colocado para adicionar os metodos abstratos da interface
    // Atributos
    private String titulo, autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    public Pessoa leitor;

    //Metodos toString()

    public String detalhes() {
        return "Livro: \n" + "Titulo = '" + titulo + '\'' + "\n, Autor = '" + autor + '\'' + "\n, totalPaginas = " + totalPaginas +
                "\n, pagAtual = " + pagAtual +
                "\n, Aberto = " + aberto +
                "\n, Leitor = " + leitor.getNome() + "\n, Idade = " + leitor.getIdade() + "\n, Sexo = " + leitor.getSexo();
    }
    // Metodo construtor
    // O metodo construtor do  atributo aberto não foi colocado, pq quando ele instanciar o livro vai estar fechado
    // O metodo construtor da pagAtual não foi colocado, pq ele vai estar na pagna zero quando for iniciado
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
        // Metodos abstratos que vem de implementes da interface publicacao
    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;


    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPaginas) {
            this.pagAtual = 0;
        }else {
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}

