package ausstattung.besucher;

import ausstattung.hardware.Maus;
import ausstattung.hardware.Monitor;
import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;

/**
 * Konkreter Besucher, der den Namen der Bestandteile ausgibt.
 */
public class PrettyPrintName implements BesucherKomponente {
    public void besuche(Rechner rechner) {
        System.out.println(rechner.getName());
    }

    public void besuche(Maus maus) {
        System.out.println(maus.getName());
    }

    public void besuche(Tastatur tastatur) {
        System.out.println(tastatur.getName());
    }

    public void besuche(Monitor monitor) {
        System.out.println(monitor.getName() + "*");
    }
}
