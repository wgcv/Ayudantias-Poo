/**
 * @(#)ejercicio2.java
 *
 *
 * @author
 * @version 1.00 2015/1/29
 */

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio2  implements ActionListener{
    JButton bt1, bt2, bt3,bt4,bt5;//creando variables globales de los botones

    public ejercicio2(String titulo) {
    	    JFrame ventanaM = new JFrame(titulo);
    	            ventanaM.setLayout(new GridLayout(3,2));

        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setResizable(false);//para configurar si se redimensiona la ventana
        ventanaM.setLocation(500,200);//para ubicar inicialmente donde se muestra la ventana (x, y)
        ventanaM.setSize(500,500);//configurando tamaño de la ventana (ancho, alto)
        ventanaM.setVisible(true);//configurando visualización de la ventana
            bt1 = new JButton("Hola");
                ventanaM.add(bt1);
                 bt2 = new JButton("boton2");
                ventanaM.add(bt2);
                bt3 = new JButton("boton3");
                ventanaM.add(bt3);
                bt4 = new JButton("boton4");
                ventanaM.add(bt4);
                bt5 = new JButton("boton5");
                ventanaM.add(bt5);
 bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);





    }

    public static void main(String[] args) {
        // TODO code application logic here
                ejercicio2 ventana = new ejercicio2("Ventana Creada");

    }
     @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener

        if(e.getActionCommand().equals("Hola")){//podemos comparar por el contenido del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
        if(e.getSource()==bt2){//podemos comparar por el nombre del objeto del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
        if(e.getSource()==bt3){//podemos comparar por el nombre del objeto del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
    }
}
