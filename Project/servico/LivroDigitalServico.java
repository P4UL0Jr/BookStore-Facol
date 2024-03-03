package servico;

import entidades.Livro;
import interfaces.ILivro;

class LivroDigitalServico extends Livro implements ILivro{
    public LivroDigitalServico(String titulo, String autor, int ISBN) {
        super(titulo, autor, ISBN);
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Livro digital emprestado com sucesso!");
        } else {
            System.out.println("Não é possível emprestar o livro digital.");
        }
    }
}
