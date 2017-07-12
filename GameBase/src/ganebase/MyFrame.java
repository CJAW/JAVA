package ganebase;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyFrame extends Frame {
	
	private static final int GameWidth = 1000;

	private static final int GameHeigh = 800;
	
	/**
	 * 加载窗口
	 */
	
	public void launchFrame(){
		setSize(GameWidth ,GameHeigh);
	    setLocation(400,400);
	    setVisible(true);
	    new PaintThread().start();//启动动画
	    
	    addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent e){	
	    		System.exit(0);
	    	}
	    	
	    });
		
	    
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
	
}
