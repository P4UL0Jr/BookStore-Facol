package entidades;

import java.util.ArrayList;
import java.util.List;

import servico.UsuarioServico;

public abstract class Biblioteca {
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
    public void adicionarLivro(Livro livro) {
        
    }

    public void removerLivro(Livro livro) {
    
    }

    public void registrarUsuario(UsuarioServico usuario) throws InterruptedException {
        
    }

    
    
    public void removerUsuario(UsuarioServico usuario) {
        
    }
    
    public void emprestarLivro(UsuarioServico usuario, Livro livro) {
        
    }

    public void verUsuarios() {
    
}

    public void verLivros() {
        
    }

    public void devolverLivro(Livro livro) {
        
    }
}

    

