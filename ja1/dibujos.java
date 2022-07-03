
package ja1;

import java.awt.*;
import javax.swing.*;

public class dibujos extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        g.drawRect(300, 400, 500, 500);
    }
    
    
}
