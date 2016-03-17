package convertRGB;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

public BufferedImage image;

public ImagePanel(String path) {
   try {                
      image = ImageIO.read(new File(path));
   } catch (IOException ex) {
        // handle exception...
   }
}

public void setImage(String path){
	 try {                
	      image = ImageIO.read(new File(path));
	   } catch (IOException ex) {
	        // handle exception...
	   }
}

public ImagePanel(){
	
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
}

}