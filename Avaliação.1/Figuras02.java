import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras02 extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        int x0=0, y0=0, x1=0, y1=400;
        int a=25;

        while((x0<400)&&(y0<400)){
            x0 = (x0+a);
            y0 = (y0+a);
            g.drawLine(x0, y0, x1, y1);
        }
        x1=400;
        y1=0;
        while((x0>1)&&(y0>1)){
            x0 = (x0-a);
            y0 = (y0-a);
            g.drawLine(x0, y0, x1, y1);
        }
        x0=400;
        x1=0;
        while(y0<400){
            x0 = (x0-a);
            y0 = (y0+a);
            g.drawLine(x0, y0, x1, y1);
        }
        x1 = 400;
        y1 = 400;
        while(x0<400){
            x0 = (x0+a);
            y0 = (y0-a);
            g.drawLine(x0, y0, x1, y1);
        }
    }
    public static void main(String[]args){
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras02 painel = new Figuras02();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
    }
}