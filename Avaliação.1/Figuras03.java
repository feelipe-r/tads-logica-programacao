import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras03 extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
       int x0=0, y0=400, x1=400, y1=400;
       int a=25;

       while(x0<200){
           x0 = (x0+a);
           y1 = (y1-a);
           g.drawLine(x0, y0, x1, y1);
       }
       while(y0>1){
           y0 = (y0-a);
           x1 = (x1-a);
           g.drawLine(x0, y0, x1, y1);
       }
       while(x0>1){
           x0 = (x0-a);
           y1 = (y1+a);
           g.drawLine(x0, y0, x1, y1);
       }
       while(y0<200){
           y0 = (y0+a);
           x1 = (x1+a);
           g.drawLine(x0, y0, x1, y1);
       }
       //g.drawLine(0, 0, 400, 400);
    }
    public static void main(String[]args){
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras03 painel = new Figuras03();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);  
    }
}