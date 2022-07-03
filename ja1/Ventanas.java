
package ja1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class Ventanas extends JFrame {
    
    public Ventanas(){
        setVisible(true);
        setBounds(100,100,700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ESTAS SON VENTANAS");
        Oyente o = new Oyente();
        addWindowListener(o);
    }
    
    
}


class Oyente implements WindowListener{
    
    public void windowActivated(WindowEvent w){}
    public void windowClosed(WindowEvent w){}
    public void windowClosing(WindowEvent w){}
    public void windowDeactivated(WindowEvent w){}
    public void windowDeiconified(WindowEvent w){
        System.out.println("ventana miniminzada");
    }
    public void windowIconified(WindowEvent w){
        System.out.println("ventana miniminzada");
    }
    public void windowOpened(WindowEvent w){}
    
    
}