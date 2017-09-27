package arqudir;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class arqudir {

    public static void main(String[] args) throws IOException {

        Metodos met = new Metodos();
        int op;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Crear directorio 'arquivosdir' \n2. Crear fichero 'products1' \n3. Crear 'subdir' y 'products2' \n4. Mostrar archivos de 'arquivosdir' \n5. Mostrar ruta primer directorio creado \n6. Mostrar detalles archivo 'products1' \n7. Quitar permiso de escritura a archivo 'products1' \n8. Dar permiso de escritura a archivo 'products1' \n9. Borrar archivo 'products1' \n10. Borrar todos los archivos creados \n11. Salir"));
            } catch (HeadlessException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
                op = 0;
            }

            switch (op) {

                case 1:
                    met.creararquivosdir();
                    break;
                case 2:
                    met.createproducts1();
                    break;
                case 3:
                    met.createsubdirproducts2();
                    break;
                case 4:
                    met.mostrararquivosdir();
                    break;
                case 5:
                    met.mostrarDirectorio();
                    break;
                case 6:
                    met.products1Info();
                    break;
                case 7:
                    met.noEscritura();
                    break;
                case 8:
                    met.siEscritura();
                    break;
                case 9:
                    met.borrarArchivo();
                    break;
                case 10:
                    met.borrarTodo();
                    break;
                case 11:
                    System.exit(0);
                    break;
            }

        } while (op != 0);

    }
}
