package ausstattung.besucher;

import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;
import ausstattung.hardware.Monitor;
import ausstattung.hardware.Maus;

/**
 * Konkreter Besucher, der die Kategorie der Bestandteile ausgibt.
 */
public class PrettyPrintKategorie implements BesucherKomponente {
    public void besuche(Rechner rechner) {
        System.out.println(rechner.getKategorie());
    }

    public void besuche(Maus maus) {
        System.out.println(maus.getKategorie());
    }

    public void besuche(Tastatur tastatur) {
        System.out.println(tastatur.getKategorie());
    }

    public void besuche(Monitor monitor) {
        System.out.println(monitor.getKategorie());
    }
}