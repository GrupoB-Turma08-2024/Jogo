
package telaInicial;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public final class EfeitoSonoro{
    
    private static boolean ligado = true;
    private static Clip clip;
    
    public static void Play(String filepath){
        if(ligado){
            try{
                File sound = new File("src/main/resources/sons/" + filepath);
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            }catch(Exception e){ 
                Logger.getLogger("EfeitoSonoro").log(Level.SEVERE, null, e);
            }
        }
    }
    
    public static void setLigado(boolean b){
        ligado = b;
    }
}
