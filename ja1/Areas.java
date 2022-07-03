package ja1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Areas extends JPanel {

            Image i;
            File aa= new File("C:\\Users\\ASUS\\Desktop\\PROGRAMACION_PROYECTOS\\EN_JAVA\\logo.png");
    
    public Areas(){

        

        
        setBackground(Color.yellow);

        setBounds(0,0,233,234);
        

        
        setVisible(true);
    }

    
    public void paintComponent( Graphics g){        
            super.paintComponent(g);
            
            try{
            i = ImageIO.read(aa);
            }
            catch(IOException e){
                  System.out.println("no se encontro la imagen");
            }
            g.drawImage(i, 5, 5, null);
            g.drawString("esto es un ejemplo de texto", 500, 100);
            
    }


    


    
}
