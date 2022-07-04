
package ja1;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;






public class Tecla extends JFrame{

    Button b3 = new Button("MOLDA");
    Molde m = new Molde();
        
    public Tecla(){
        
        setVisible(true);
        setBounds(400,400,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("eventos con teclas");
        
        add(m);




    }
    
  
}



class Molde extends JPanel {
    
    JButton bt1 = new JButton("NUMERO");
    JButton bt2 = new JButton("ENVIAR");
    JButton bt3 = new JButton("TERCERO");
    
    
    public Molde(){
     
        add(bt1);
        add(bt2);
        add(bt3);
        
        
    }
    
}



class Acto extends AbstractAction{
    
    public void actionPerformed(ActionEvent ae){
        
    }

    
}























//
//
//
//class Molde extends JPanel{
//    Button bt1= new Button("MOLDE");
//    JTextField te1 = new JTextField();
//    JTextField te2 = new JTextField();
//    Evento1 ev = new Evento1();
//    
//    int largo=200;
//    int alto=200;
//    
//    public Molde(){
//        setBackground(Color.yellow);
//        add(te1);
//        setLayout(null);
//        te1.setBounds(100,50,300,20);
//        add(bt1);
//        te2.setBounds(100,200,300,20);
//        add(te2);
//        
//        bt1.setBounds(100, 300,200,40);
//        
//        addMouseListener(ev);
//    }
//    
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        g.drawRect(100, 100, largo,alto);
//            
//    }
//    
//    
//    class Evento1 extends MouseAdapter {
//    
//
//        int numero,numero1,numero2;
//
//        public void mouseClicked(MouseEvent me){
//            numero = (int) Math.ceil(Math.random()*200);
//            numero1 = (int) Math.ceil(Math.random()*200);
//            numero2= (int) Math.ceil(Math.random()*200);
//            setBackground(new Color(numero,numero1,numero2));
//            largo= me.getX() -100;
//            alto = me.getY() -100;
//
//        }
//
//        
//    }
//}
//
//
//
//
//
//






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












