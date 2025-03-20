package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//       int a = 5;
//       int b = 3;
//         System.out.println("Hello World!" + (a+b));
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}


class Livro {
    private String name;
    private Integer numPages;


    public Livro(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }



    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}