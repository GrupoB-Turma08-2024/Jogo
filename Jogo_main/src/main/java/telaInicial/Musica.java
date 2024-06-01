package telaInicial;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;

public final class Musica {

    public static Clip clip;
   
    public static void Play(String filepath) {
        try{
            Stop();
            File musicPath = new File("src/main/resources/musicas/" + filepath);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("Arquivo de áudio não encontrado");
            }
        }
        catch(Exception e){
            Logger.getLogger(TelaCover.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void Stop(){
        if (clip != null){
            clip.stop();
        }
    }
}

