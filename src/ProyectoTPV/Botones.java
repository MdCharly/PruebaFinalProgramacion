package ProyectoTPV;

import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// Creamos los botones , texto y el panel
    public class Botones extends JFrame {
        JPanel contienepanel;
            JLabel texto, label1,label2,label3,panelSuperior;
            JButton boton1, boton2, boton3,boton4,boton5,boton6,boton7,boton8,boton9;

        //Control de la ventana

        Botones() {
            super("Charly´s Shop");
            setBounds(700, 700, 700, 700);
            setVisible(true);
            contienepanel = new JPanel();
            setContentPane(contienepanel);
            getContentPane().setLayout(new GridLayout(3,3));
            setLocationRelativeTo(null);


            // Todos los botones

            texto = new JLabel("Deportes Charly");
            boton1 = new JButton("Futbol");
            boton1.setForeground(Color.black);
            boton1.setFont(new Font("arial",3, 20));
            boton1.setBackground(Color.orange);
            boton2 = new JButton("Beisbol");
            boton2.setForeground(Color.white);
            boton2.setFont(new Font("arial",3, 20));
            boton2.setBackground(Color.orange);
            boton3 = new JButton("Baloncesto");
            boton3.setForeground(Color.magenta);
            boton3.setFont(new Font("arial",3, 20));
            boton3.setBackground(Color.orange);
            boton4 = new JButton("Nike");
            boton4.setForeground(Color.black);
            boton4.setFont(new Font("arial",3, 20));
            boton4.setBackground(Color.pink);
            boton5 = new JButton("Adidas");
            boton5.setForeground(Color.white);
            boton5.setFont(new Font("arial",3, 20));
            boton5.setBackground(Color.pink);
            boton6 = new JButton("Fila");
            boton6.setForeground(Color.magenta);
            boton6.setFont(new Font("arial",3, 20));
            boton6.setBackground(Color.pink);
            boton7 = new JButton("Converse");
            boton7.setForeground(Color.black);
            boton7.setFont(new Font("arial",3, 20));
            boton7.setBackground(Color.cyan);
            boton8 = new JButton("Puma");
            boton8.setForeground(Color.white);
            boton8.setFont(new Font("arial",3, 20));
            boton8.setBackground(Color.cyan);
            boton9 = new JButton("Asics");
            boton9.setForeground(Color.magenta);
            boton9.setFont(new Font("arial",3, 20));
            boton9.setBackground(Color.cyan);

            // Añadimos los botones

            add(texto);
            add(boton1);
            add(boton2);
            add(boton3);
            add(boton4);
            add(boton5);
            add(boton6);
            add(boton7);
            add(boton8);
            add(boton9);


        }

        public static void main(String[] args) {
            Botones ventana=new Botones();

        }
    }