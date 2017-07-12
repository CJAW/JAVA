package planegame.frame;

import java.awt.Graphics;
import java.awt.Image;

import planegame.util.GameUtil;

public class Explode {
	
	double x,y;
	static Image[] imgs = new Image[14];
	int count;
	
	static{
		for(int i=0;i<15;i++){
			imgs[i]=GameUtil.getImage("exploredImages/expiored"+(i+1)+".gif");
			imgs[i].getWidth(null);
		}
	}
	
	
	public void draw(Graphics g){
		if(count<=15){
			g.drawImage(imgs[count], (int)x,(int)y, null);
		    count++;
		}
		
	}
	
	public Explode(double x,double y){
		this.x=x;
		this.y=y;
	}

	
}
