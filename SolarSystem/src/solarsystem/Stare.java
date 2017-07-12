package solarsystem;

/**
 * 恒星的位置
 */

import java.awt.Graphics;
import java.awt.Image;

public class Stare {
	
	Image img;
	double x,y;
	int width , height;

	public void paint(Graphics g){
		
		g.drawImage(img, (int)x,(int)y, null);
		
	}
	
	public Stare(Image img,double x,double y,int width,int height){
		
		this.img=img;
		this.x=x;
		this.y=y;
		
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
	
	public Stare(){
		
	}
		
}
