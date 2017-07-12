package ganebase;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestGameFrame2 extends MyFrame{
	
	Image img = GameUtil.getImage("images/sun.jpg");
	
	
	/**
	 * 
	 * 运用Hook方法,不用调用，可直接使用.
	 */
	
	private double x=100 , y=100;
	private Boolean left;
	//private Boolean up;
	
	
	public void paint(Graphics g){
		
	    new PaintThread().start(); //启动动画 
	   
	    g.drawImage(img,(int)x,(int)y,null);
	    if(left){
	    	x-=310;
	    }else{
	    	x+=310;
	    }if(x>500-100){
	    	left=true;
	    }if(x<0){
	    	left=false;
	    }
	    }
	
	public static void main(String[] args){
		
		TestGameFrame2 fs = new TestGameFrame2();
		fs.launchFrame();
	
	}
}
