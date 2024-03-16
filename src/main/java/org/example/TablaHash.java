package org.example;


import java.util.HashMap;
import java.util.Map;

        public class TablaHash {
            public static void main(String[] args) {
                // Creamos una tabla hash de cadenas (clave, valor)
                Map<String, String> tablaHash = new HashMap<>(); // Utilizamos la interfaz Map y la implementación HashMap

                // Agregar elementos a la tabla hash
                tablaHash.put("clave1", "valor1"); // Agregamos el par clave-valor "clave1"-"valor1" a la tabla
                tablaHash.put("clave2", "valor2"); // Agregamos el par clave-valor "clave2"-"valor2" a la tabla
                tablaHash.put("clave3", "valor3"); // Agregamos el par clave-valor "clave3"-"valor3" a la tabla

                // Acceder a un valor a través de una clave
                String valor = tablaHash.get("clave2"); // Obtenemos el valor asociado a la clave "clave2"
                System.out.println("Valor asociado a clave2: " + valor); // Imprimimos el valor asociado a la clave "clave2"
            }
        }

    