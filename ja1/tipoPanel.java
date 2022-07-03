
package ja1;

import javax.swing.JPanel;
import java.awt.*;

public class tipoPanel extends JPanel {
    
    public tipoPanel(){
        super();
        setBounds(500,500,500,500);
        setVisible(true);
        setBackground(new Color(211,2,22));
    }
    
    public void  paintComoponent(Graphics g){
            
        super.paintComponent(g);
        g.drawString("Esto es mas texto",1000,200);
        
    }
    
    
}
