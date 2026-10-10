import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList<Product> products = new SinglyLinkedList<>();
        String option;

        do {
            System.out.println("\n**** Inventario de la tiendita****");
            System.out.println("1. Agregar producto al inicio");
            System.out.println("2. Agregar producto al final");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Editar producto");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextLine();

            switch (option) {
                case "1": {
                    try {
                        System.out.print("Nombre: ");
                        String name = scanner.nextLine();
                        System.out.print("Precio: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        System.out.print("Cantidad: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        products.insertFirst(new Product(name, price, quantity));
                        System.out.println("Producto agregado.");
                    } catch (NumberFormatException e) {
                        System.out.println("Precio o cantidad inválidos.");
                    }
                    break;
                }
                case "2": {
                    try {
                        System.out.print("Nombre: ");
                        String name = scanner.nextLine();
                        System.out.print("Precio: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        System.out.print("Cantidad: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        products.insertLast(new Product(name, price, quantity));
                        System.out.println("Producto agregado.");
                    } catch (NumberFormatException e) {
                        System.out.println("Precio o cantidad inválidos.");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Nombre del producto a eliminar: ");
                    String name = scanner.nextLine();
                    // Los productos se comparan solo por nombre, por eso el precio y la cantidad van en 0
                    if (products.remove(new Product(name, 0, 0))) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("No se encontró ese producto.");
                    }
                    break;
                }
                case "4":
                    if (products.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        products.traverse();
                        System.out.println("Total de productos: " + products.getSize());
                    }
                    break;
                case "5": {
                    try {
                        System.out.print("Nombre del producto a editar: ");
                        String oldName = scanner.nextLine();
                        System.out.print("Nuevo nombre: ");
                        String newName = scanner.nextLine();
                        System.out.print("Nuevo precio: ");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        System.out.print("Nueva cantidad: ");
                        int newQuantity = Integer.parseInt(scanner.nextLine());
                        if (products.update(new Product(oldName, 0, 0), new Product(newName, newPrice, newQuantity))) {
                            System.out.println("Producto actualizado.");
                        } else {
                            System.out.println("No se encontró ese producto.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Precio o cantidad inválidos.");
                    }
                    break;
                }
                case "6":
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!option.equals("6"));

        scanner.close();
    }
}
