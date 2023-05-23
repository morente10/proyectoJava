package MisEjercicios;

import javax.swing.*;
import java.util.HashMap;

public class MenuOpciones {
    public static void main(String[] args) {
        int opcionIndice = 0;
        HashMap<String, Integer> menu=new HashMap();
        menu.put("Actualizar", 1);
        menu.put("Eliminar", 2);
        menu.put("Agregar", 3);
        menu.put("Listar", 4);
        menu.put("Salir", 5);

        Object[] array = menu.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione una Opción",
                "Título",
                JOptionPane.INFORMATION_MESSAGE, null, array, array[0]);
        if (opcion==null){ JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
    }else {
            opcionIndice= menu.get(opcion.toString());
            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Actualizar");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Eliminar");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Agregar");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Listar");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }


        }
}}
/*
while  (opcionIndice<=0 && opcionIndice>5)    {

            HashMap<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // aca un if o switch para las distintas opciones.
            }

        }
if (opcion != null) {
                switch (opcion) {
                    case "1":
                        actualizarProducto(productos);
                        break;
                    case "2":
                        eliminarProducto(productos);
                        break;
                    case "3":
                        crearProducto(productos);
                        break;
                    case "4":
                        listarProductos(productos);
                        break;
                    case "5":
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } else {
                salir = true;
            }
        }
    }

    private static void actualizarProducto(HashMap<Integer, String> productos) {
        int codigo = obtenerCodigoProducto(productos);
        if (productos.containsKey(codigo)) {
            String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del producto:", "Actualizar producto",
                    JOptionPane.PLAIN_MESSAGE);
            productos.put(codigo, nuevoNombre);
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.", "Actualización exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El producto con el código especificado no existe.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void eliminarProducto(HashMap<Integer, String> productos) {
        int codigo = obtenerCodigoProducto(productos);
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.", "Eliminación exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El producto con el código especificado no existe.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void crearProducto(HashMap<Integer, String> productos) {
        int codigo = obtenerCodigoProducto(productos);
        if (productos.containsKey(codigo)) {
            JOptionPane.showMessageDialog(null, "Ya existe un producto con el código especificado.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:", "Crear producto",
                    JOptionPane.PLAIN_MESSAGE);
            productos.put(codigo, nombre);
            JOptionPane.showMessageDialog(null, "Producto creado correctamente.", "Creación exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void listarProductos(HashMap<Integer, String> productos) {
        StringBuilder listaProductos = new StringBuilder();
        for (int codigo : productos.keySet()) {
            String nombre = productos.get(codigo);
            listaProductos.append("Código: ").append(codigo).append(", Nombre: ").append(nombre).append("\n");





User
explicación de la clase hashmap en java y sus métodos mas importantes ejemplos

ChatGPT
La clase HashMap en Java es una implementación de la interfaz Map, que representa una colección de pares clave-valor. Permite almacenar y acceder a elementos utilizando una clave única para cada valor. A continuación, se explican algunos de los métodos más importantes de la clase HashMap junto con ejemplos:

put(K key, V value): Este método se utiliza para agregar un par clave-valor al mapa.
java
Copy code
HashMap<String, Integer> mapa = new HashMap<>();
mapa.put("A", 1);
mapa.put("B", 2);
mapa.put("C", 3);
get(Object key): Este método devuelve el valor asociado a una clave específica.
java
Copy code
int valor = mapa.get("B"); // Devuelve 2
containsKey(Object key): Este método verifica si una clave está presente en el mapa.
java
Copy code
boolean contiene = mapa.containsKey("C"); // Devuelve true
remove(Object key): Este método elimina el par clave-valor asociado a una clave específica.
java
Copy code
mapa.remove("A"); // Elimina el par clave-valor con clave "A"
size(): Este método devuelve la cantidad de pares clave-valor en el mapa.
java
Copy code
int cantidad = mapa.size(); // Devuelve la cantidad de elementos en el mapa
keySet(): Este método devuelve un Set que contiene todas las claves del mapa.
java
Copy code
Set<String> claves = mapa.keySet(); // Devuelve un Set con las claves "B" y "C"
values(): Este método devuelve una colección que contiene todos los valores del mapa.
java
Copy code
Collection<Integer> valores = mapa.values(); // Devuelve una colección con los valores 2 y 3
entrySet(): Este método devuelve un Set que contiene todos los pares clave-valor del mapa como objetos Map.Entry.
java
Copy code
Set<Map.Entry<String, Integer>> entradas = mapa.entrySet();
for (Map.Entry<String, Integer> entrada : entradas) {
    String clave = entrada.getKey();
    int valor = entrada.getValue();
    System.out.println("Clave: " + clave + ", Valor: " + valor);
}
Estos son solo algunos de los métodos más comunes de la clase HashMap. Puedes consultar la documentación oficial de Java para obtener más información y explorar todas las funcionalidades proporcionadas por esta clase.




User
explicación de JOptionPane.showInputDialog

ChatGPT
El método JOptionPane.showInputDialog es parte de la clase JOptionPane en Java y se utiliza para mostrar un cuadro de diálogo que solicita al usuario que ingrese un valor o una entrada de texto. A continuación, se explica en detalle este método:

Sintaxis básica:
java
Copy code
public static String showInputDialog(Component parentComponent, Object message, String title, int messageType)
parentComponent: El componente padre en relación al cual se muestra el cuadro de diálogo. Puede ser null si no hay un componente padre.
message: El mensaje o la pregunta que se muestra al usuario en el cuadro de diálogo.
title: El título del cuadro de diálogo.
messageType: El tipo de mensaje que se muestra (por ejemplo, JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, etc.).
Valor de retorno:
El método showInputDialog devuelve una cadena de texto (String) ingresada por el usuario. Si el usuario presiona el botón "Aceptar", se devuelve el valor ingresado. Si el usuario presiona el botón "Cancelar" o cierra el cuadro de diálogo, se devuelve null.
Ejemplo de uso:
java
Copy code
String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Nombre", JOptionPane.PLAIN_MESSAGE);
if (nombre != null) {
    System.out.println("Hola, " + nombre + "!");
} else {
    System.out.println("No se ingresó ningún nombre.");
}
En este ejemplo, se muestra un cuadro de diálogo solicitando al usuario que ingrese su nombre. El método showInputDialog espera hasta que el usuario ingrese un valor y presione el botón "Aceptar" o "Cancelar". Luego, el valor ingresado se asigna a la variable nombre. Si el usuario ingresó un nombre y presionó "Aceptar", se muestra un saludo con el nombre. Si el usuario presionó "Cancelar" o cerró el cuadro de diálogo, se muestra un mensaje indicando que no se ingresó ningún nombre.

El método showInputDialog también admite argumentos adicionales para personalizar aún más el cuadro de diálogo, como un valor predeterminado, opciones seleccionables, un icono personalizado, etc. Consulta la documentación oficial de Java para obtener más detalles sobre todas las opciones disponibles.





*/