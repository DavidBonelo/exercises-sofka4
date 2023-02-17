package com.davidbonelo._2_entry_point;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("""
                ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?
                En caso positivo, ¿cómo se determina el punto de entrada a un programa?""");
        System.out.println("""
                R: Sí, al crear el archivo JAR, en el manifest se debe poner cuál es la clase principal donde se buscará el metodo main
                que será el punto de entrada para la ejecución así: Main-Class: MyPackage.MyClass
                ej: jar cfm MyJar.jar Manifest.txt MyPackage/*.class
                
                también se puede con la flag 'e' (de entrypoint) la cual crea o sobreescribe el atributo Main-Class del manifest
                ej: jar cfe app.jar MyApp MyApp.class

                https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html""");
    }
}
