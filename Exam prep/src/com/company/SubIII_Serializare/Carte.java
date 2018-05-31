package com.company.SubIII_Serializare;

import java.io.Serializable;
import java.util.Date;

public class Carte implements Serializable {

    float pret;
    Date data_aparitie;
    String isbn;
    String autor;

    public Carte(float pret, Date data_aparitie, String isbn, String autor) {

        this.pret = pret;
        this.data_aparitie = data_aparitie;
        this.isbn = isbn;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "pret=" + pret +
                ", data_aparitie=" + data_aparitie +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
