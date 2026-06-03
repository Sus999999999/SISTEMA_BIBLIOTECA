package model;

public class MaterialBibliografia {
    protected String codigo;
    protected String titulo;
    protected boolean disponible;
    protected boolean prestable;
    

    public boolean prestable(boolean puede){
        prestable = puede;
        return prestable;
    }

    

    @Override
    public String toString() {
        return "MaterialBibliografia [codigo=" + codigo + ", titulo=" + titulo + ", disponible=" + disponible
                + ", prestable=" + prestable + "]";
    }



    public MaterialBibliografia(String codigo, String titulo, boolean disponible, boolean prestable) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponible = disponible;
        this.prestable = prestable;
    }

    
}

