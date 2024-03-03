package servico;

import entidades.Livro;

class LivroDigital extends Livro {
    public LivroDigital(String titulo, String autor, int ISBN) {
        super(titulo, autor, ISBN);
    }

    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Livro digital emprestado com sucesso!");
        } else {
            System.out.println("Não é possível emprestar o livro digital.");
        }
    }
}
