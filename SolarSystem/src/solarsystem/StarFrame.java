package solarsystem;

import java.awt.Graphics;
import java.awt.Image;
import util.GameUtil;
import util.MyFrame;

public class StarFrame extends MyFrame{
	
	Image bg = GameUtil.getImage("images/starr.jpg");
	
	Stare sun =new Stare(GameUtil.getImage("images/sun.jpg"),200,200,100,100);
	
	Planet earth = new Planet(250,250,50,sun, 1,GameUtil.getImage("images/earth.jpg"));
	
	public void paint(Graphics g){
		
		g.drawImage(bg, 0, 0, null);
		sun.paint(g);
		earth.paint(g);
	}
	
	public static void main(String[] args){
		
		StarFrame fs = new StarFrame();
		 fs.launchFrame();
		
	}
	
}
