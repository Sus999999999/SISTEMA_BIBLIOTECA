package model;

public class Revista extends MaterialBibliografia {
    private String edicion;
    private int mesPub;
    private String categoria;

    


    public Revista(String codigo, String titulo, boolean disponible, boolean prestable,
         String edicion, int mesPub,
        String categoria) {
        super(codigo, titulo, disponible, prestable);
        this.edicion = edicion;
        this.mesPub = mesPub;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String disponibilidad;
        if (disponible == true) {
            disponibilidad = "Si";
        }else{
            disponibilidad = "No";
        }
        return "Revista\nCodigo:" + codigo + "\ntitulo:" + titulo + "\ndisponible:" + disponibilidad +
        "\nEdicion:" + edicion + "\nMes de publicacion:" + mesPub +
         "\nCategoria:" + categoria;
    }


}