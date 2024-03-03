package entidades;

import servico.UsuarioServico;

public abstract class Livro {
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponivel;
    private UsuarioServico usuarioEmprestado;

    public Livro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponivel = true;
        this.usuarioEmprestado = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int iSBN) {
        this.ISBN = iSBN;
    }

    public UsuarioServico getUsuarioEmprestado() {
        return usuarioEmprestado;
    }

    public void setUsuarioEmprestado(UsuarioServico usuarioEmprestado) {
        this.usuarioEmprestado = usuarioEmprestado;
    }

    public abstract void emprestar();
}



