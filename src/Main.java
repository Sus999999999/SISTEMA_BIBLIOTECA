import java.util.Scanner;
import model.*;
import service.InventarioService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        InventarioService inventario = new InventarioService();

        int opcion;

        do {

            System.out.println("\n===== Sistema Biblioteca =====");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar Tesis");;
            System.out.println("4. Registrar alumno");
            System.out.println("5. Realizar prestamo");
            System.out.println("6. Mostrar Materiales");
            System.out.println("7. Mostrar Prestamos");
            System.out.println("8. Salir");

            String codigo;
            String titulo;
            boolean disponible;
            boolean prestable;

            System.out.println("\nElija una Opcion");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n___ Agregacion Libro ___\n");

                    System.out.println("Código:");
                    codigo = sc.nextLine();

                    System.out.println("Titulo:");
                    titulo = sc.nextLine();

                    System.out.println("Disponble:");
                    disponible = sc.nextBoolean();
                    sc.nextLine();

                    System.out.println("Se puede prestar?:");
                    prestable = sc.nextBoolean();

                    System.out.println("Autor:");
                    String autor = sc.nextLine();
                    while (autor == "") {
                        autor = sc.nextLine();
                    }
                    
                    System.out.println("ISBN:");
                    String isbn = sc.nextLine();

                    System.out.println("Editorial:");
                    String editorial = sc.nextLine();

                    System.out.println("Numero de Paginas:");
                    int paginas = sc.nextInt();


                    Libro li = new Libro(
                            codigo,
                            titulo,
                            disponible,
                            prestable,
                            autor,
                            isbn,
                            editorial,
                            paginas
                    );

                    inventario.agregarProducto(li);

                    break;

                case 2:

                System.out.println("\n___ Agregacion de revista ___\n");

                    System.out.println("Código:");
                    codigo = sc.nextLine();

                    System.out.println("Titulo:");
                    titulo = sc.nextLine();

                    System.out.println("Disponble:");
                    disponible = sc.nextBoolean();
                    sc.nextLine();

                    System.out.println("Edicion:");
                    String edicion = sc.nextLine();
                    while (edicion == "") {
                        edicion = sc.nextLine();
                    }
                    
                    System.out.println("Mes de publicacion:");
                    int mesPub = sc.nextInt();

                    System.out.println("Categoria:");
                    String categoria = sc.nextLine();


                    Revista rev = new Revista(
                            codigo,
                            titulo,
                            disponible,
                            true,
                            edicion,
                            mesPub,
                            categoria
                    );

                    inventario.agregarProducto(rev);

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    inventario.mostrarInventario();
                    System.out.println("Preciona Enter para volver");
                    sc.nextLine();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Ingresa una opcion Valida");
                    break;


            }

        } while (opcion != 8);

        System.out.println("Sistema finalizado.");
    }
}