package br.com.dio.desafio.dominio;

public class Comentario {
    private String comentario;
    private Dev autor;
    private Post post;

    public Comentario(Dev autor, Post post, String comentario) {
        this.comentario = comentario;
        this.autor = autor;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comentario [comentario=" + comentario + ", autor=" + autor.getNome() + ", post=" + post.getTitulo() + "]\n";
    }

    
    
}
