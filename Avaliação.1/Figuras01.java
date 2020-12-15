import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras01 extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        int x0 = 0, y0 = 0, x1 = 0, y1 = 0;

        while((x1<400)&&(y1<400)){
            if(x0<=y0){
                x0 = (x0+25);
                g.drawLine(x0, y0, x1, y1);
                x1 = x0;
            }
            else if(y0<x0){
                y0 = (y0+25);
                g.drawLine(x0, y0, x1, y1);
                y1 = y0;
            }
        }
        //g.drawLine(0, 0, 400, 400);  
    }
    public static void main(String[]args){
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras01 painel = new Figuras01();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);  
    }
}