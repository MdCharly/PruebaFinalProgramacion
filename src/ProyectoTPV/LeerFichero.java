package ProyectoTPV;

import javax.swing.*;
import java.io.*;

public class LeerFichero {
    public LeerFichero(String nombre, int precio, String edad) {
    }

    public static void main(String[] args) throws IOException {
        try(DataInputStream dis=new DataInputStream(new FileInputStream(args[0]))) {
            while(true) {
                String nombre = dis.readUTF();
                int precio = dis.readInt();
                String edad = dis.readUTF();
                LeerFichero leido = new LeerFichero(nombre, precio,edad);

                //Tengo que leer los productos
                short numeroProductos=dis.readShort();
                for (int i = 0; i < numeroProductos; i++) {
                    String nombreProductos=dis.readUTF();
                    leido.anyadeProductos(nombreProductos);
                }
                JOptionPane.showMessageDialog(null,leido);
            }
        }
    }

    private void anyadeProductos(String nombreProductos) {
    }
}