/**
 * @author Guillaume Schranz
 */

package ch.heigvd.res.lab00;

public class Clavier extends IInstrument {

    public Clavier() {
        this.setSound("dayyyn");	//aClavierShouldMakeDayyyn()
        this.setSoundVolume(1);		//aClavierShouldNotBeMute()
        this.setColor("ivory");		//aClavierShouldBeIvory()
    }

}