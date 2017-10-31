
package uno;
import java.io.*; 
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
public class Cards {
      public static enum Color {
       BLUE,RED,YELLOW,GREEN
    };
    Color color;
    int number; 
    static Image image;
    Cards(Image _image,Color _color) {
            image = _image;
}
   public static void draw(Graphics2D g,Uno obj)
    {
        drawCardImage(g,Window.getX(200),Window.getYNormal(100),
        0,1,1,obj);
    }
   private static void drawCardImage(Graphics2D g,int xpos,int ypos,
    double rot,double xscale,double yscale,Uno obj){
         g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        int width = image.getWidth(obj);
        int height = image.getHeight(obj);
         
        g.drawImage(image,-width/2,-height/2,width,height,obj);        
     
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
       
   }
}
