package learning_fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class HandlingAudiofiles {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		File audio1=new File("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\sample-file-1.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio1);
		Clip clip1=AudioSystem.getClip();
		clip1.open(audioStream);
		
		String userInput = "";
		while(userInput!="Q") {
			System.out.println("P=play,S=stop,R=restart,Q=quit");
			System.out.println("type your input");
			userInput=scanner.next();
			userInput=userInput.toLowerCase();
			
			switch(userInput) {
			case("p"): clip1.start();
			break;
			case("s"):clip1.stop();
			break;
			case("r"):clip1.setMicrosecondPosition(0);
			break;
			case("q"):clip1.close();
			default: System.out.println("Invalid input");
			}
		}
	}

}
