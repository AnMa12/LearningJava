package Exercitiu;

public class Carte {
    public String titlu;
    private String autor;
    public String ISBN;
    private int an_aparitie;
    public int nr_pagini;

    public Carte() {

    }

    public Carte(String titlu, String autor, String ISBN) {
        this.titlu = titlu;
        this.autor = autor;
        this.ISBN = ISBN;

    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", an_aparitie=" + an_aparitie +
                ", nr_pagini=" + nr_pagini +
                '}';
    }

    public Carte(String titlu, String autor, String ISBN, int an_aparitie, int nr_pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.ISBN = ISBN;
        this.an_aparitie = an_aparitie;
        this.nr_pagini = nr_pagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAn_aparitie() {
        return an_aparitie;
    }

    public void setAn_aparitie(int an_aparitie) {
        this.an_aparitie = an_aparitie;
    }

    public int getNr_pagini() {
        return nr_pagini;
    }

    public void setNr_pagini(int nr_pagini) {
        this.nr_pagini = nr_pagini;
    }

}
