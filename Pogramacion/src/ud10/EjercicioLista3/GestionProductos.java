package ud10.EjercicioLista3;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {

    static ArrayList<Producto> lista = new ArrayList<>();

    // AGREGAR
    public static void agregar(Producto producto) {
        lista.add(producto);
    }

    // ELIMINAR
    public static boolean eliminar(int codigo) {
        Producto producto = obtener(codigo);

        if (producto != null) {
            lista.remove(producto);
            return true;
        }

        return false;
    }

    // OBTENER
    public static Producto obtener(int codigo) {
        for (Producto producto : lista) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }

        return null;
    }

    // BUSCAR
    public static ArrayList<Producto> buscar(String tipo) {
        ArrayList<Producto> encontrados = new ArrayList<>();

        for (Producto producto : lista) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                encontrados.add(producto);
            }
        }

        return encontrados;
    }

    // TAMAÑO
    public static int tamaño() {
        return lista.size();
    }

    // AGREGAR SIN DUPLICADOS
    public static void agregarSinDuplicados(Producto nuevo) {

        Producto existente = obtener(nuevo.getCodigo());

        if (existente == null) {
            lista.add(nuevo);
            System.out.println("Producto añadido.");
            return;
        }

        if (!existente.getNombre().equalsIgnoreCase(nuevo.getNombre()) ||
            !existente.getTipo().equalsIgnoreCase(nuevo.getTipo())) {

            System.out.println("ERROR: código repetido con datos distintos.");
            return;
        }

        if (existente.getPrecio() != nuevo.getPrecio()) {
            existente.setPrecio(nuevo.getPrecio());
        }

        existente.setStock(existente.getStock() + nuevo.getStock());

        System.out.println("Stock actualizado.");
    }

    // AUMENTAR PRECIO
    public static void aumentarPrecio(String tipo, double porcentaje) {
        for (Producto producto : lista) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                double nuevoPrecio =
                        producto.getPrecio() * (1 + porcentaje / 100);

                producto.setPrecio(nuevoPrecio);
            }
        }
    }

    // ELIMINAR SIN STOCK
    public static int eliminarSinStock() {
        int contador = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getStock() == 0) {
                lista.remove(i);
                contador++;
                i--;
            }
        }

        return contador;
    }

    // MAIN CON MENÚ
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Obtener producto");
            System.out.println("4. Buscar por tipo");
            System.out.println("5. Mostrar tamaño");
            System.out.println("6. Agregar sin duplicados");
            System.out.println("7. Aumentar precio");
            System.out.println("8. Eliminar sin stock");
            System.out.println("9. Salir");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Código: ");
                    int codigo = leer.nextInt();
                    leer.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = leer.nextLine();

                    System.out.print("Tipo: ");
                    String tipo = leer.nextLine();

                    System.out.print("Precio: ");
                    double precio = leer.nextDouble();

                    System.out.print("Stock: ");
                    int stock = leer.nextInt();
                    leer.nextLine();

                    agregar(new Producto(codigo, nombre, tipo, precio, stock));
                    break;

                case 2:
                    System.out.print("Código: ");
                    codigo = leer.nextInt();

                    if (eliminar(codigo)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 3:
                    System.out.print("Código: ");
                    codigo = leer.nextInt();

                    Producto p = obtener(codigo);

                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("No encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Tipo: ");
                    tipo = leer.nextLine();

                    System.out.println(buscar(tipo));
                    break;

                case 5:
                    System.out.println("Total productos: " + tamaño());
                    break;

                case 6:
                    System.out.print("Código: ");
                    codigo = leer.nextInt();
                    leer.nextLine();

                    System.out.print("Nombre: ");
                    nombre = leer.nextLine();

                    System.out.print("Tipo: ");
                    tipo = leer.nextLine();

                    System.out.print("Precio: ");
                    precio = leer.nextDouble();

                    System.out.print("Stock: ");
                    stock = leer.nextInt();
                    leer.nextLine();

                    agregarSinDuplicados(
                            new Producto(codigo, nombre, tipo, precio, stock)
                    );
                    break;

                case 7:
                    System.out.print("Tipo: ");
                    tipo = leer.nextLine();

                    System.out.print("Porcentaje: ");
                    double porcentaje = leer.nextDouble();
                    leer.nextLine();

                    aumentarPrecio(tipo, porcentaje);
                    break;

                case 8:
                    System.out.println(
                            "Eliminados: " + eliminarSinStock()
                    );
                    break;

                case 9:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 9);

        leer.close();
    }
}
