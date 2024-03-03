package entidades;

import java.util.ArrayList;
import java.util.List;

import servico.UsuarioServico;

public class Biblioteca {
    protected List<Livro> livros;
    protected List<UsuarioServico> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<UsuarioServico> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioServico> usuarios) {
        this.usuarios = usuarios;
    }
    }

