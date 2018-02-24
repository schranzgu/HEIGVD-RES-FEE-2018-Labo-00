/**
 * @author Guillaume Schranz
 */

package ch.heigvd.res.lab00;

public class Trumpet extends IInstrument {

    public Trumpet() {
		
        this.setSound("pouet");		//aTrumpetShouldMakePouet()
	this.setSoundVolume(2);		//aTrumpetShouldBeLouderThanAFlute() & volume flute = 1
	this.setColor("golden");	//aTrumpetShouldBeGolden()
		
    }
}