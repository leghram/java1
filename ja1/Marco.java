
package ja1;

import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.*;

public class Marco extends JFrame {
    
    Image logo;
    
    
    public Marco(){
        
        Toolkit datosSistema = Toolkit.getDefaultToolkit();
        
        Dimension pantalla = datosSistema.getScreenSize();
        int altura = pantalla.width;
        int ancho = pantalla.height;
        
        setTitle("es el titulo");
        setBounds(0, 0,altura , ancho  );
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        logo = datosSistema.getImage("C:\\Users\\ASUS\\Desktop\\PROGRAMACION_PROYECTOS\\EN_JAVA\\logo.png");
        setIconImage(logo);


        
        

        Areas zona = new Areas();
        add(zona);


    }
    

    
    
}
