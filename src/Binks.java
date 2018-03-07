import javax.swing.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.math.*;
public class Binks{
	JFrame frame;
	Timer timer;
	public Boolean audio;
	
	final int jarjarHEIGHT = 285;
	final int jarjarWIDTH = 200;
	
	
	Binks(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int MINPOS = 0;
		int MAXPOSW = (int)Math.round(screenSize.getWidth()) - jarjarWIDTH;
		int MAXPOSH = (int)Math.round(screenSize.getHeight()) - jarjarHEIGHT;
		this.audio = new Boolean(true);
        this.timer = new Timer(this.audio);
		this.frame = new JFrame("Jar Jar");
        ImageIcon icon = new ImageIcon("resources/jarjar.jpg");
        JLabel label = new JLabel(icon);
        frame.setSize(jarjarWIDTH,jarjarHEIGHT);
        frame.setLocation(
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOSW + 1),
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOSH + 1));
        frame.setVisible(true);
        frame.add(label);
		timer.start();
	}
	
	
	public static void main(String[] args){
        ArrayList<Binks> jarjars = new ArrayList<Binks>();
        for(int i = 0; i < 30; i++) {
        	jarjars.add(new Binks());
        }
        try {
    	TimeUnit.SECONDS.sleep(10);
        }catch(Exception e) {
        	;
        }
        for(int i = 0; i < 10; i++) {
        	jarjars.get(i).audio = false;
        }
	}   
        
	}
