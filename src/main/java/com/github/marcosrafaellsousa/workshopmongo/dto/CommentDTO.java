package com.github.marcosrafaellsousa.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String texto;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String texto, Date date, AuthorDTO author) {
        this.setTexto(texto);
        this.setDate(date);
        this.setAuthor(author);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
