package Main;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
	//Main Function
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //Get input from user
		Scanner scanner =new Scanner(System.in);
		//Access the Audio File
        File file=new File("Jay Walking - Everet Almond.wav");
		
        AudioInputStream audio=AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		//Open the clip
        clip.open(audio);
		
		
		String userInput="";
		
		while(!userInput.equals("Q")) {
			System.out.println("P=play,S=Stop,R=Reset,Q=Quit");
			System.out.print("Now it's your Turn Choose What do you Want?");
			
			userInput=scanner.next();
			//Convert User Input into uppercase
            userInput=userInput.toUpperCase();
			
            //use Switch case statement  To handle Multiple Options
			switch(userInput) {
			case ("P"):clip.start();
			break;
			case ("S"):clip.stop();
			break;
			case ("R"):clip.setMicrosecondPosition(0);
			break;
			case ("Q"):clip.close();
			break;
			default:System.out.println(" I think you better to check your Input");
			}
		}
        //final words
		System.out.println("Thanks for Using this!!");
	}
}

	