package servico;
import java.util.ArrayList;
import java.util.List;

import entidades.Livro;
import entidades.Usuario;

public class UsuarioServico extends Usuario{
    
   

    public UsuarioServico(String nome, int id) {
       this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            getLivrosEmprestados().add(livro);
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    @Override
    public int getId() {
        
        return super.getId();
    }

    @Override
    public List<Livro> getLivrosEmprestados() {
        
        return super.getLivrosEmprestados();
    }

    @Override
    public String getNome() {
       
        return super.getNome();
    }

    @Override
    public void setId(int id) {
       
        super.setId(id);
    }

    @Override
    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
      
        super.setLivrosEmprestados(livrosEmprestados);
    }

    @Override
    public void setNome(String nome) {
       
        super.setNome(nome);
    }

    
}

