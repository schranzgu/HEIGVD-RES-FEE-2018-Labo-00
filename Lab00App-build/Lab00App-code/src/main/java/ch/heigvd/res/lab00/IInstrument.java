/**
 * @author Guillaume Schranz
 */

package ch.heigvd.res.lab00;

//Superclass des divers instruments
public class IInstrument {
	
    private String sound;
    private String color;
    private int soundVolume;

    //GETTERS
    public String play() {
        return sound;
    }
	
    public String getColor() {
        return color;
    }	
	
    public int getSoundVolume() {
        return soundVolume;
    }
	
    //SETTERS
    public void setSound(String sound){
            this.sound = sound;
    }

    public void setColor(String color){
            this.color = color;
    }

    public void setSoundVolume(int soundVolume){
            this.soundVolume = soundVolume;
    }
}