
import java.io.File;
import java.net.URL;
import javax.sound.sampled.*;

public class Sound {

   private String soundFolder = "res"+ File.separator;
   private String loopPath = soundFolder+"loop.wav";
    private String gameOverPath = soundFolder+"gameOver.wav";


    private Clip loopSound, gameOver;



    public Sound(){

        try{

            loopSound = AudioSystem.getClip();
            gameOver =  AudioSystem.getClip();


           loopSound.open(AudioSystem.getAudioInputStream(new File(loopPath).getAbsoluteFile()));


        }
        catch (Exception e){

        }
    }

    public void loop(){
       loopSound.start();
    }
    public void stop(){
        gameOver.start();
    }
}
