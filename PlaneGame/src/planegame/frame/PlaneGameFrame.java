package planegame.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import planegame.util.GameUtil;
import planegame.util.MyFrame;

public class PlaneGameFrame extends MyFrame{
	
	Image bg=GameUtil.getImage("images/bg.jpg");
	
	Plane p = new Plane(50,50,GameUtil.getImage("images/plane.jpg"));
	
	Explode blast;
	
	ArrayList bulletList = new ArrayList();   //jdk的容器
	
	Date startdate;
	Date enddate;
	
	public void paint(Graphics g,String str,Color color,int x,int y,int size){
		
		        Color c=g.getColor();
		    	g.setColor(color);
		    	Font f = new Font("宋体",size,size);
		    	g.setFont(f);
		    	g.drawString(str, x, y);
		    	g.setColor(c);
	}
	
	  

	
	
	public void paint(Graphics g){
		
		g.drawImage(bg, 0, 0, null);
		p.draw(g);
		for(int i=0;i<bulletList.size();i++){   //遍历容器画出子弹
			Bullet b =(Bullet) bulletList.get(i);
		    b.paint(g);
		    boolean boom = b.getRect().intersects(p.getRect()); //碰撞检测
		    if(boom){
		    	p.setLive(false);   //死亡
		        if(blast==null){
		          enddate=new Date();
		          blast = new Explode(p.x,p.y);
		          
		        }
		    	blast.draw(g);
		    	break;
		    }
		} 
		if(!p.isLive()){
				
				paint(g,"GAME OVER",Color.white,100,300,30);
				System.out.println();
				
				long Time = (enddate.getTime()-startdate.getTime())/1000;
				

				switch ((int)Time*10){
				
				case 0:
				paint(g,Time+"新手等级",Color.red,100,400,20);
				break;
				
				case 10:
					paint(g,Time+"中手等级",Color.red,100,400,20);
					break;
					
				case 20:
					paint(g,Time+"高手等级",Color.red,100,400,20);
					break;
					
				case 30:
					paint(g,Time+"超手等级",Color.red,100,400,20);
					break;
				}
			}
	}
	
	
	/**
	 * 添加键盘事件，需要在launchframe中注册，与窗口事件一样
	 * @author user
	 *
	 */
	
	
	public void launchFrame(){   //注册，重写父类的launchframe;
		super.launchFrame();
		addKeyListener(new KeyMonitor());
		
		startdate= new Date();
		
		for(int i=0;i<20;i++){     //加载子弹
			
			Bullet b = new Bullet();
			bulletList.add(b);
		}
	}
	
	
	 class KeyMonitor extends KeyAdapter{
		 
		
		 public void keyPressed(KeyEvent e) {
			 p.Dircetion(e);
			 
		 }
		 
		 public void keyReleased(KeyEvent e) {
			  p.StopDircetion(e);
			 
			 
		 }

		 
	}
	 
	
	public static void main(String[] args){
		
		PlaneGameFrame fs = new PlaneGameFrame();
		fs.launchFrame();
		
		
	}
	
	
     
}
