package servico;
import entidades.Livro;
import entidades.Usuario;

public class UsuarioServico extends Usuario{
    

    

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            getLivrosEmprestados().add(livro);
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    
}

