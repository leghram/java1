
package ja1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class dos extends JFrame {
    
    public dos(){
        
        setBounds(400,400,600,600);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t encima = new t();
        add(encima);
        
    }
    
    
    
}


class t extends JPanel implements ActionListener{
    
    JButton bt = new JButton("boton 1");
    JButton bt2 = new JButton("boton 2");
    JButton bt3 = new JButton("bot 3");
    boolean valor = true;
    int eva;

    Color c= new Color(34,65,56);
    fondo ff = new fondo(c);
    
    public t(){
        
        add(bt);
        add(bt2);
        add(bt3);
        bt.addActionListener(this);
        
       
       bt2.addActionListener(ff);
    }

    
    
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        
        if(obj == bt2){
            
        }
        
        if(true){
           eva= (int)Math.ceil(Math.random()* 5);
           if(eva==1){
               c= new Color(233,4,23);
           }else if(eva == 2){
               c= new Color(223,223,254);
           }else if(eva==3){
               c= new Color(3,243,54);
           }else if(eva==4){
               c= new Color(2,2,2);
           }else{
               c= new Color(22,2,222);
           }
           setBackground(c); 
           
           
        }
        
    }
    
    
    
    class fondo implements ActionListener{
    
        private Color colorFondo;

        public fondo(Color c){
            colorFondo = c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorFondo);
        }
    
    }
    
    

    
}




