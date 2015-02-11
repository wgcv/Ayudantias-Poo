import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
public class Prueba{
    class Ventana extends JFrame{
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        public Ventana(){

            Container container = getContentPane();
            container.setLayout(null);
            Boton boton1 = new Boton("Mueveme");
            panel1.setBorder(BorderFactory.createLineBorder(Color.black));
            panel1.setLayout(new GridLayout(3,2));
            panel1.setBounds(10, 10, 200, 200);
            panel1.add(boton1);

            panel2.setBorder(BorderFactory.createLineBorder(Color.black));
            panel2.setBounds(270, 260, 100, 100);

            container.add(panel1);
            container.add(panel2);

        }
    }
    class Boton extends JButton implements MouseMotionListener{

        public Boton(String mensaje){
            super.setText(mensaje);
            addMouseMotionListener(this);
        }
        public void mouseDragged(MouseEvent mme){

            setLocation(this.getX() + mme.getX() - this.getWidth() / 2,this.getY() + mme.getY() - this.getHeight() / 2);

        }
        public void mouseMoved(MouseEvent mme) {}

    }

    public void correr(){
        Ventana window = new Ventana();
        window.setVisible(true);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Prueba drag = new Prueba();
        drag.correr();
    }
}