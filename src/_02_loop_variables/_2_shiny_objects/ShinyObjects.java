
package _02_loop_variables._2_shiny_objects;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



public class ShinyObjects {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = false;	
	
	public static void main(String[] args) {
		new ShinyObjects().manyShinyObjects();
	}
	
	void manyShinyObjects() {
		
		// 1. Call the method below to play Mister Zee
		playMisterZee();
		
		// 2. Ask the user how many shiny objects they want
		int num = Integer.parseInt(JOptionPane.showInputDialog("how many shiny objects would you like?"));
		
		// 3. Play the sound that many times
		for(int i = num; i>0; i--) {
			playMisterZee();
		}

	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public void playMisterZee() {
		String path = "src/_02_loop_variables/_2_shiny_objects/";
		if (canPlaySounds) {
			File sound = new File(path+"shiny-objects.wav");
			if (sound.exists()) {
				try {					
					Clip clip= AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}
		} else {
			System.out.println("Mister Zee requires shiny objects");
		}
	}


}
