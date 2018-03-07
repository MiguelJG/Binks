import javax.swing.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Binks{
	JFrame frame;
	Timer timer;
	
	final int MINPOS = 250;
	final int MAXPOS = 750;
	
	Binks(){
        this.timer = new Timer();
		this.frame = new JFrame("Jar Jar");
        ImageIcon icon = new ImageIcon("resources/jarjar.jpg");
        JLabel label = new JLabel(icon);
        frame.setSize(200, 285);
        frame.setLocation(
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOS + 1),
        		ThreadLocalRandom.current().nextInt(MINPOS, MAXPOS + 1));
        frame.setVisible(true);
        frame.add(label);
		timer.start();
	}
	
	
	public static void main(String[] args){
        ArrayList<Binks> jarjars = new ArrayList<Binks>();
        for(int i = 0; i < 5; i++) {
        	jarjars.add(new Binks());
        }
        
        


	}
}

