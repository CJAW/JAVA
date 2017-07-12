package planegame.frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;

public class Plane {
	
	double x,y;
	Image img;
	boolean up ,down ,left ,right;
	int speed=10;
	int width;
	int height;
	private boolean Live=true;
	
	public Plane(double x ,double y ,Image img){
		super();
		this.x=x;
		this.y=y;
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
	public Rectangle getRect(){
	Rectangle r= new Rectangle((int)x,(int)y,img.getWidth(null),img.getHeight(null));
	return r;
	}
	
	
	public void draw(Graphics g){
		if(Live){
		g.drawImage(img, (int)x, (int)y, null);
		move();
	}
	}
	
	public void move(){
		
		if(up){
			if(y<650-50){
			y+=speed;
			}
		}
		if(down){
			if(y>5){
			y-=speed;
			}
		}

		if(left){
			x-=speed;
		}

		if(right){
			x+=speed;
		}

		
	}
   
   
	 public void Dircetion(KeyEvent e){
		    switch(e.getKeyCode()){
		    
		    	    case 37:
		    	    	left=true;		    		     
		    		     break;
		    	    case 38:
		    	    	down=true;
		    	    	 break;
		    	    case 39:
		    	    	right=true;
		    	    	break;
		    	    case 40:
		    	    	up=true;		    	    	
		    	    	break;
		    	    case 65:
		    	    	left=true;	
		   		        break;
		   	        case 87:
		   	        	down=true;
		   	    	    break;
		   	        case 68:
		   	        	right=true;
		   	    	    break;
		   	        case 83:
		   	        	up=true;
		    	    	break;
		    	    	
		    	    	default:
		    	    	break;
		    	    	
		    }
		}
	 
	 public void StopDircetion(KeyEvent e){
		    switch(e.getKeyCode()){
		    
		    	    case 37:
		    	    	left=false;		    		     
		    		     break;
		    	    case 38:
		    	    	down=false;
		    	    	 break;
		    	    case 39:
		    	    	right=false;
		    	    	break;
		    	    case 40:
		    	    	up=false;		    	    	
		    	    	break;
		    	    case 65:
		    	    	left=false;	
		   		        break;
		   	        case 87:
		   	        	down=false;
		   	    	    break;
		   	        case 68:
		   	        	right=false;
		   	    	    break;
		   	        case 83:
		   	        	up=false;
		    	    	break;
		    	    	
		    	    	default:
		    	    	break;
		    	    	
		    		
		    		
		    }
		    }

	public boolean isLive() {
		return Live;
	}

	public void setLive(boolean live) {
		Live = live;
	}
	 
	
}
