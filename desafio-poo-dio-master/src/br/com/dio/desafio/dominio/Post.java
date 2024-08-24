package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Post {

    private static Set<Post> posts = new LinkedHashSet<>();
    private Dev autor;
    private String titulo;
    private String descricao;
    private Set<Comentario> comentarios = new LinkedHashSet<>();

    public Post(Dev autor, String titulo, String descricao) {
        this.autor = autor;
        this.titulo = titulo;
        this.descricao = descricao;

        posts.add(this);
    }

    public static Set<Post> getPosts() {
        return posts;
    }

    public void addComentario(Dev autor, String comentario, Post post) {
        comentarios.add(new Comentario(autor, post, comentario));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set getComentarios() {

        return this.comentarios;
    }

    @Override
    public String toString() {
        return "Post [autor=" + autor.getNome() + ", titulo=" + titulo + ", descricao=" + descricao + ", comentarios="
                + comentarios + "]";
    }

}
