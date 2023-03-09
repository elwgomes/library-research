package com.elwgomes.library.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_books")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    private String book_name;
    private String book_author;
    private String book_sinopse;

    public Book () {
        //empty
    }

    public Book(Long book_id, String book_name, String book_author, String book_sinopse) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_sinopse = book_sinopse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(book_id, book.book_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_id);
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_sinopse() {
        return book_sinopse;
    }

    public void setBook_sinopse(String book_sinopse) {
        this.book_sinopse = book_sinopse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                ", book_sinopse='" + book_sinopse + '\'' +
                '}';
    }
}
