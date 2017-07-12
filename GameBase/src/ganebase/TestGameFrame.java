package ganebase;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestGameFrame extends Frame{
	
	Image img = GameUtil.getImage("images/sun.jpg"); //图片加载
	
	/**
	 * 加载窗口
	 */
	
	public void launchFrame(){
		setSize(1000,800);
	    setLocation(400,400);
	    setVisible(true);
	    
	    addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent e){	
	    		System.exit(0);
	    	}
	    	
	    });
		
	    
	}
	
	/**
	 * 
	 * 运用Hook方法,不用调用，可直接使用.
	 */
	
	private double x=100 , y=100;
	private double degree=3.14/3;
	private double speed=14;
	
	public void paint(Graphics g){
		
	    new PaintThread().start(); //启动动画 
	   
	    g.drawImage(img,(int)x,(int)y,null);
	    
	    if(speed>0){
	    	speed-=0.02;
	    }else{
	    	speed = 0;
	    }
	    
	    x += speed*Math.cos(degree);
	    y += speed*Math.sin(degree);
	    

	if(y>800-65||y<65){
		degree=-degree;
	}
	
	
	if(x<0||x>1000-65){
		
		degree=Math.PI-degree;
	
	}
	
}
	
	/**
	 * 
	 * @author user
	 *
	 *动画的实现
	 */
	
	class PaintThread extends Thread{
         public void  run(){
        	 while (true){
        		 repaint();
        		 try{
        		 Thread.sleep(50);
        		 }catch(InterruptedException e){
        			 e.printStackTrace();
        		 }
        	 }
         }
	}
	
	
	public static void main(String[] args){
		
		TestGameFrame fs = new TestGameFrame();
		fs.launchFrame();
	
	}
}
