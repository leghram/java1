
package ja1;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class Tecla extends JFrame{

    Molde m = new Molde();
    Button b3 = new Button("MOLDA");
    Teclado t2 = new Teclado();
    Clic c = new Clic();
    
    public Tecla(){
        
        setVisible(true);
        setBounds(400,400,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("eventos con teclas");
        add(b3);
        add(m);
        b3.setLocation(500,500);
        addKeyListener(t2);
        addMouseListener(c);
    }
    
  
}


class Clic extends MouseAdapter{
    
    int largo;
    int alto;
    boolean hizo=true;
    
    public void mouseClicked(MouseEvent me){
        System.out.println("Se hizo click");
        largo = me.getX();
        alto = me.getY();
        
        hizo = true;
            
    }
    

    
    
    
    
}












class Molde extends JPanel{
    
    Button bt1 = new Button("Enviar");
    Button bt2= new Button("Salir");
    Clic como= new Clic();
    Teclado t1 = new Teclado();
    
    public Molde(){
       
        setBackground(Color.yellow);
        add(bt2);
        add(bt1);

    }
    

    
    
    
}




class Teclado implements KeyListener{

    public void keyReleased(KeyEvent ke){
        
    }
    
    public void keyPressed(KeyEvent ke){
        int codigo = ke.getKeyCode();
        System.out.println(codigo);
        if(codigo == 56){
            System.out.println("HAS GANADO CTMARE");
        }
    }
    
    public void keyTyped(KeyEvent ke){
        
    }
    
}












