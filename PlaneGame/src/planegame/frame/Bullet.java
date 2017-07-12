package planegame.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet {

	double x,y;
	double degree;
	double speed=3;
	int width;
	int height;
	
	public Bullet(){
	
	degree=Math.random()*Math.PI*2;
	x=400/2;
	y=600/2;
	width=10;
	height=10;
		
	}
	
	public Rectangle getRect(){
		Rectangle r= new Rectangle((int)x,(int)y,width,height);
		return r;
		}

	public void paint(Graphics g){
		    
		Color c=g.getColor();
		g.setColor(Color.yellow);
		g.fillOval((int)x,(int) y, width, height);
		g.setColor(c);
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		if(y>650-10||y<20){
			degree=-degree;
		}
		
		
		if(x<0||x>400-10){
			
			degree=Math.PI-degree;
		
		}

	}
	
	
}
