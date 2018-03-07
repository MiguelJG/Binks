import javax.swing.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Binks{
	JFrame frame;
	Timer timer;
	
	final int MINPOS = 00;
	final int MAXPOS = 1000;
	public static boolean AUDIO = true;
	Binks(){
        this.timer = new Timer();
		this.frame = new JFrame("Jar Jar");
        ImageIcon icon = new ImageIcon("resources/jarjar.jpg");
        JLabel label = new JLabel(icon);
        frame.setSize(200,285);
        frame.setLocation(
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOS + 1),
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOS + 1));
        frame.setVisible(true);
        frame.add(label);
		timer.start();
	}
	
	
	public static void main(String[] args){
        ArrayList<Binks> jarjars = new ArrayList<Binks>();
        for(int i = 0; i < 10; i++) {
        	jarjars.add(new Binks());
        }
        try {
    	TimeUnit.SECONDS.sleep(10);
        }catch(Exception e) {
        	;
        }
    	Binks.AUDIO = false;
	}   
        
	}
