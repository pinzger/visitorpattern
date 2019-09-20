package ausstattung.besucher;

import ausstattung.hardware.Maus;
import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;
import ausstattung.hardware.Monitor;

/**
 * Konkreter Besucher, der die Kategorie und den Namen der Bestandteile ausgibt.
 */
public class PrettyPrintKategorieUndName implements BesucherKomponente {
    public void besuche(Rechner rechner) {
        System.out.println(rechner.getKategorie() + ": " + rechner.getName());
    }

    public void besuche(Maus maus) {
        System.out.println(maus.getKategorie() + ": " + maus.getName());
    }

    public void besuche(Tastatur tastatur) {
        System.out.println(tastatur.getKategorie() + ": " + tastatur.getName());
    }

    public void besuche(Monitor monitor) {
        System.out.println(monitor.getKategorie() + ": " + monitor.getName() + "*");
    }
}