package model;
import model.MaterialBibliografia;

public class Libro extends MaterialBibliografia{
    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;


    public Libro(String codigo, String titulo, boolean disponible, boolean prestable, String autor, String isbn,
        String editorial, int paginas) {
        super(codigo, titulo, disponible, prestable);
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.paginas = paginas;
    }


    @Override
    public String toString(){
        String disponibilidad = "NA";
        String prestar = "NA";
        if (prestable == true) {
            prestar = "Si";
        }else{
            prestar = "No";
        }

        if (disponible == true) {
            disponibilidad = "Si";
        }else{
            disponibilidad = "No";
        }
        return "Codigo:" + codigo + "\ntitulo:" + titulo + "\nautor:" + autor + "\ndisponible:" + disponibilidad
                + "\nisbn:" + isbn + "\nprestable:" + prestar + "\neditorial:" + editorial + "\npaginas:"
                 + paginas;
    }

    
    

}
