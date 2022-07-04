
package ja1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Tecla extends JFrame{

    Molde m = new Molde();
    Button b3 = new Button("MOLDA");

    
    public Tecla(){
        
        setVisible(true);
        setBounds(400,400,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("eventos con teclas");

        add(m);


    }
    
  
}













class Molde extends JPanel implements MouseListener{
    
    Button bt1 = new Button("Enviar");
    Button bt2= new Button("Salir");

   
   JTextField j1;
   JTextField j2 = new JTextField();
    
    public Molde(){

        setBackground(Color.yellow);
        add(bt2);
        add(bt1);
        
        addMouseListener(this);

        add(j2);

        
        
    }
    

    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        j1= new JTextField();
    }
 
    

    
    
    public void mouseClicked(MouseEvent me){
        
        System.out.println("Hola se hizo click");
        
        int numero =(int)Math.ceil(Math.random()*250);
        int numero2 =(int)Math.ceil(Math.random()*250);
        int numero3 =(int)Math.ceil(Math.random()*250);
        if(true){
            setBackground(new Color(numero3,numero2,numero));
        }
        
        


    }
    
    public void mouseEntered(MouseEvent me){
    }
    
    public void mouseExited(MouseEvent me){
    }
    
    public void mousePressed(MouseEvent me){
    
    }
    
    
    public void mouseReleased(MouseEvent me){
        
    }
    
    

}







//
//class Clic extends MouseAdapter{
//    
//    int ancho;
//    int alto;
//    
//    public void mouseClicked(MouseEvent me){
//        System.out.println("HOLA SE HIZO CLIC");
//        ancho = me.getX();
//        alto = me.getY();
//    }
//    
//}
//
//






//
//class Teclado implements KeyListener{
//
//    public void keyReleased(KeyEvent ke){
//        
//    }
//    
//    public void keyPressed(KeyEvent ke){
//        int codigo = ke.getKeyCode();
//        System.out.println(codigo);
//        if(codigo == 56){
//            System.out.println("HAS GANADO CTMARE");
//        }
//    }
//    
//    public void keyTyped(KeyEvent ke){
//        
//    }
//    
//}












