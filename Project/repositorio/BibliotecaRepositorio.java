package repositorio;
import entidades.Biblioteca;
import entidades.Livro;
import servico.UsuarioServico;

public class BibliotecaRepositorio extends Biblioteca {

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
    }
    @Override
    public void removerLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livros.remove(livro);
            System.out.println("Livro removido da biblioteca: " + livro.getTitulo());
        } else {
            System.out.println("Não é possível remover o livro, pois está emprestado.");
        }
    }
    @Override
    public void registrarUsuario(UsuarioServico usuario) throws InterruptedException {
        usuarios.add(usuario);
        System.out.println("Usuário registrado na biblioteca: " + usuario.getNome());
        Thread.sleep(2000);
    }

    
    @Override
    public void removerUsuario(UsuarioServico usuario) {
        boolean possuiLivrosEmprestados = false;
        for (Livro livro : usuario.getLivrosEmprestados()) {
            if (!livro.isDisponivel()) {
                possuiLivrosEmprestados = true;
                break;
            }
        }
    
        if (!possuiLivrosEmprestados) {
            usuarios.remove(usuario);
            System.out.println("Usuário removido da biblioteca: " + usuario.getNome());
        } else {
            System.out.println("Não é possível remover o usuário, pois ele tem livros emprestados.");
        }
    }
    @Override
    public void emprestarLivro(UsuarioServico usuario, Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            livro.setUsuarioEmprestado(usuario);
            System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }
    @Override
    public void verUsuarios() {
    System.out.println("  _Lista de usuários_ \n");
    for (UsuarioServico usuario : usuarios) {
        System.out.println("Nome: " + usuario.getNome() + ", ID: " + usuario.getId());
    }
}
@Override
    public void verLivros() {
        System.out.println("  _Lista de livros na biblioteca_");
        for (Livro livro : livros) {
            System.out.print("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getISBN());
            if (livro.isDisponivel()) {
                System.out.println(" (Disponível)");
            } else {
                System.out.println(" (Emprestado para: " + livro.getUsuarioEmprestado().getNome() + ")");
            }
        }
    }
    @Override
    public void devolverLivro(Livro livro) {
        if (!livro.isDisponivel()) {
            livro.setDisponivel(true);
            livro.setUsuarioEmprestado(null);
            System.out.println("Livro devolvido com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }
}


