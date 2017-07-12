package solarsystem;
import java.awt.Color;
/**
 * 行星的变化，数度，角度，绕行，长轴，短轴
 * @author user
 *
 */
import java.awt.Graphics;

import java.awt.Image;

public class Planet extends Stare{
	
	double longAxis;
	double shortAxis;
	double speed;
	Stare center;
	double degree;
	Image img;
	
	public Planet(double longAxis,double shortAxis,double speed, Stare center,double degree,Image img){
		
		
		this.longAxis=longAxis;  //长轴
		this.shortAxis=shortAxis; //短轴
		this.speed=speed;         // 速度
		this.center= center;      // 绕行
		this.degree=degree;       //角度
		this.img = img;           //加载图片
		
		this.x= center.x+longAxis;
		this.y= center.y+shortAxis;
		
		//得到图片的中心坐标
		this.width=img.getWidth(null); 
		this.height=img.getHeight(null);
	}
	
	public void paintTrach(Graphics g){
		
		double  _x,_y,_width,_height;
		
		_x=longAxis;
		_y=shortAxis;
		_width=(center.x+center.width/2)-longAxis;
		_height=(center.y+center.height/2)-shortAxis;
		
	    
		g.setColor(Color.BLUE);
		g.drawOval((int)_x, (int)_y, (int)_width,(int) _height);
		
			}

	
	public void paint(Graphics g){
		
	    g.drawImage(img, (int)x, (int)y, null);
	    
	    
	    //绕中心坐标旋转
	    x=(center.x+center.width/2)+longAxis*Math.cos(degree);   
	    y=(center.y+center.height/2)+longAxis*Math.sin(degree);  
	    
	    degree += speed; 
	    
	}
	
	public Planet(Image img, double x, double y,int width,int height) {
		super(img, x, y, height, height);
		
	}

}
