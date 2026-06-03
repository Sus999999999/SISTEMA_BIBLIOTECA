package service;

import model.MaterialBibliografia;

import java.util.ArrayList;

public class InventarioService {

    private ArrayList<MaterialBibliografia> libros = new ArrayList<>();

    public void agregarProducto(MaterialBibliografia libro) {
        libros.add(libro);
    }

    public void mostrarInventario() {

        System.out.println("\n===== INVENTARIO =====");
        System.out.println("----------------------");

        for (MaterialBibliografia mat : libros) {

            System.out.println(mat.toString());

            System.out.println("----------------------");
        }
    }
}
