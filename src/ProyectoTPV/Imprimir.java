package ProyectoTPV;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Imprimir {

    public static class ImprimirString {
        public static void main(String[] args) throws IOException {
            imprimirTicket("Ticket");
        }

        static void imprimirTicket(String ticket) {
            JTextPane panel = new JTextPane();
            panel.setBackground(Color.white);
            panel.setFont(new Font("Arial", Font.BOLD, 22));
            panel.setText(ticket);
            boolean show = true;
            try {
                panel.print(null, null, show, null, null, show);
            } catch (java.awt.print.PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }
}



