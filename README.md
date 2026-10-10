# Inventario de una tiendita con lista ligada

Proyecto del Segundo Parcial. Sistema en Java que administra el inventario de una tiendita usando una lista ligada implementada en clase.

## Problemática

Una tiendita pequeña necesita llevar el control de los productos que vende: registrar los que llegan, quitar los que ya no maneja y corregir el precio o la cantidad cuando cambian, sin depender de un arreglo de tamaño fijo.

## Clases

- `Product`: representa un producto con nombre, precio y cantidad. Tiene `equals` y `hashCode` para comparar productos por su nombre.
- `Node<T>`: nodo que guarda un dato y la referencia al siguiente nodo.
- `SinglyLinkedList<T>`: lista ligada simple con los métodos `insertFirst`, `insertLast`, `traverse`, `contains`, `remove`, `update`, `clear`, `isEmpty` y `getSize`.
- `Main`: menú que interactúa con el usuario por consola.

## Cómo ejecutarlo

Con el JDK instalado, desde la carpeta que contiene los archivos `.java`:

```
javac *.java
java Main
```

## Menú

1. Agregar producto al inicio (se piden nombre, precio y cantidad)
2. Agregar producto al final
3. Eliminar producto (se pide el nombre)
4. Mostrar productos
5. Editar producto (operación adicional): se indica el nombre del producto y luego los nuevos datos
6. Salir

## Contacto
Jessica Cuahutle Romano
jessica.cuahutle.r@gmail.com