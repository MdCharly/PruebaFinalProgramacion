package ProyectoTPV;

import javax.swing.*;
import java.awt.*;

public class Inicio {

    public static void main(String[] args) {

        Producto pulsar= new Producto("pulsar", 1, "arial");

        JFrame a = new JFrame();
        JPanel contienepanel = new JPanel();
        a.setBounds(700, 700, 700, 700);
        a.setVisible(true);
        a.setContentPane(contienepanel);
        a.getContentPane().setLayout(new GridLayout(3,3));
        a.setLocationRelativeTo(null);

        JButton b = new JButton(pulsar.getNombre());
        b.setFont(new Font(pulsar.getFuente(),3, 20));

        /*for (Producto productos: arraylist) {
            Producto sebas= new Producto(productos.getNombre(), productos.getPrecio(), productos.getFuente());
            JButton b = new JButton(productos.getNombre());
            b.setFont(new Font(productos.getFuente(),3, 20));

        }
*/
    }

}
