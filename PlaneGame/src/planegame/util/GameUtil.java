package planegame.util;

import java.awt.Image;
import java.awt.Toolkit;
public class GameUtil {
	
	public static Image getImage(String path){
		
return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));

}

}