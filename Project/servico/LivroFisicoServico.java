package servico;

import entidades.Livro;

class LivroFisicoServico extends Livro {
    private boolean emBomEstado;

    public LivroFisicoServico(String titulo, String autor, int ISBN) {
        super(titulo, autor, ISBN);
        this.emBomEstado = true;
    }

    public boolean isEmBomEstado() {
        return emBomEstado;
    }

    public void setEmBomEstado(boolean emBomEstado) {
        this.emBomEstado = emBomEstado;
    }

    @Override
    public void emprestar() {
        if (isDisponivel() && isEmBomEstado()) {
            setDisponivel(false);
            System.out.println("Livro físico emprestado com sucesso!");
        } else {
            System.out.println("Não é possível emprestar o livro físico.");
        }
    }
}
