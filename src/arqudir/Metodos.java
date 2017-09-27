/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqudir;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author jquesadaabeijon
 */
public class Metodos {

    File dir = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/arquivos/arquivosdir");
    File fil = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
    File dir2 = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/arquivos/arquivosdir/subdir");
    File fil2 = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");

    /*
        1. Crear o directorio 'arquivosdir' na ruta '/home/oracle/NetBeansProjects/arquivos/' sempre e cando dito directorio non exista.
           comprobar que a ruta foi creada ou existe mediante o comandos do sistema operativo
     */
    public void creararquivosdir() {

        if (!dir.exists()) {
            System.out.println("creando directorio: " + dir.getName());
            boolean result = false;

            try {
                dir.mkdirs();
                result = true;
            } catch (SecurityException se) {
            }
            if (result) {
                System.out.println("El directorio " + dir.getName() + " ha sido creado");
            }

        }
    }

    /*
        2. Crear  o arquivo Products1.txt no directorio mencionado anteriormente (arquivosdir) sempre e cando dito arquivo non exista. 
           comprobar que o arquivo foi creado ou existe mediante comandos do sistema operativo
     */
    public void createproducts1() throws IOException {

        if (!fil.exists()) {
            System.out.println("creando archivo txt: " + fil.getName());
            boolean result = false;

            try {
                fil.createNewFile();
                result = true;
            } catch (SecurityException se) {
            }
            if (result) {
                System.out.println("El archivo " + fil.getName() + " ha sido creado");
            }

        }
    }

    /*
        3. Comprobar que a ruta foi creada mediante o metodo da clase File axeitado 
           comprobar que o arquivo foi creado mediante o metodo da clase File axeitado
     */
    //Hecho en los ejercicios anteriores.
    /*
        4. Crear o directorio 'subdir'  na ruta '/home/oracle/NetBeansProjects/arquivos/arquivosdir/' creada anteriormente
           crear o arquivo Products2.txt no directorio mencionado anteriormente (subdir) sempre e cando dito arquivo non exista.
     */
    public void createsubdirproducts2() throws IOException {

        if (!dir2.exists()) {
            System.out.println("creando directorio: " + dir2.getName());
            boolean result = false;

            try {
                dir2.mkdir();
                result = true;
            } catch (SecurityException se) {
            }
            if (result) {
                System.out.println("El directorio " + dir2.getName() + " ha sido creado");
            }

        }

        if (!fil2.exists()) {
            System.out.println("creando archivo txt: " + fil2.getName());
            boolean result = false;

            try {
                fil2.createNewFile();
                result = true;
            } catch (SecurityException se) {
            }
            if (result) {
                System.out.println("El archivo " + fil2.getName() + " ha sido creado");
            }

        }
    }

    /*
        5. Amosar arquivos e subdirectorios do directorio creado '/home/oracle/NetBeansProjects/arquivos/arquivosdir/'
	   utilizar para elo o metodo da clase File axeitado : debería verse o seguinte resultado:

		Products1.txt
		subdir
     */
    public void mostrararquivosdir() {

        System.out.println("Mostrando archivos y directorios dentro del directorio: " + dir.getAbsolutePath());

        File[] lista = dir.listFiles();

        for (final File fileEntry : dir.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println("Directorio: " + fileEntry.getName());

            } else {
                if (fileEntry.isFile()) {
                    System.out.println("Archivo: " + fileEntry.getName());
                }
            }

        }
    }

    /*
    6. Utilizando  os metodos axeitados amosar a ruta que corresponde  ao primeiro  directorio creado:
     */
    public void mostrarDirectorio() {

        System.out.println("Mostrando ruta del primer directorio creado: " + dir.getAbsolutePath());
    }

    /*
    7. Utilizando  os metodos axeitados amosar a seguinte informacion sobre o primeiro obxecto arquivo creado:
	 nome
	 ruta
	 si e posible ou non escribir nel
	 si e posible ou non ler del
	 a sua lonxitude en bytes (para isto escribir no arquivo mediante calquerea editor de texto  ,  o texto 'ola')
     */
    public void products1Info() {

        System.out.println("Nombre: " + fil.getName());
        System.out.println("Ruta: " + fil.getAbsolutePath());
        System.out.println("Lectura: " + fil.canRead());
        System.out.println("Escritura: " + fil.canWrite());
        System.out.println("Longitud: " + fil.length());

    }

    /*
    8. Forzar a que o mesmo arquivo referido no apartado anterior sexa de so lectura
       comprobar dende o sistema operativo que no se pode escribir nada en dito arquivo
     */
    public void noEscritura() {
        fil.setWritable(false);
        System.out.println("El archivo 'products1' no tiene permisos de escritura");
    }

    /*
    9. Forzar a que o arquivo referido no apartado anterior pase de novo a ser de novo de escritura
       comprobar dendo o sistema operativo que se pode ler do arquivo
     */
    public void siEscritura() {
        fil.setWritable(true);
        System.out.println("El archivo 'products1' tiene permisos de escritura");
    }
    
    /*
    10. Borrar o arquivo referido no apartado anterior
	comprobar dende o sistema operativo que o arquivo foi borrado
    */
    public void borrarArchivo(){
        fil.delete();
        System.out.println("El archivo 'products1' ha sido borrado");
    }
    
    /*
    11. Borrar o resto de arquivos e directorios creados anteriormente
    */
    public void borrarTodo(){
        fil2.delete();
        dir2.delete();
        fil.delete();
        dir.delete();
        System.out.println("Todos los archivos creados han sido borrados");
    }

}
