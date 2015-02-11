/**
 * @(#)Ejercicio3.java
 *
 *
 * @author
 * @version 1.00 2015/1/29
 */
 import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
import javax.swing.*;

public class Ejercicio3 {

    /**
     * Creates a new instance of <code>Ejercicio3</code>.
     */
    public Ejercicio3() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame f = new JFrame();
         f.setLayout( new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        f.setResizable(false);//para configurar si se redimensiona la ventana
        f.setLocation(500,200);//para ubicar inicialmente donde se muestra la ventana (x, y)
        f.setSize(500,500);//configurando t amaño de la ventana (ancho, alto)
        f.setVisible(true);//configurando visualización de la ventana

        JTextField txttarget = new JTextField();

txttarget.setDragEnabled(true);
txttarget.setPreferredSize( new Dimension( 200, 24 ) );
f.add(txttarget);

JLabel label = new JLabel("Arrastrame!");

label.setTransferHandler(new TransferHandler("text"));
f.add(label);
label.addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent e)
{
JComponent comp = (JComponent)e.getSource();
TransferHandler th = comp.getTransferHandler();
th.exportAsDrag(comp, e, TransferHandler.COPY);
}
 });
    }
}
