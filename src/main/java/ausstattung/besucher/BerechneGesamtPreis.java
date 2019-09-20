package ausstattung.besucher;

import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;
import ausstattung.hardware.Monitor;
import ausstattung.hardware.Maus;

/**
 * Konkreter Besucher, der den Gesamtpreis ueber alle Bestandteile berechnet
 */
public class BerechneGesamtPreis implements BesucherKomponente {
    double gesamtPreis = 0.0;

    public void besuche(Rechner rechner) {
        gesamtPreis += rechner.getPreis() * 0.9d;
    }

    public void besuche(Maus maus) {
        gesamtPreis += maus.getPreis();
    }

    public void besuche(Tastatur tastatur) {
        gesamtPreis += tastatur.getPreis();
    }

    public void besuche(Monitor monitor) {
        gesamtPreis += monitor.getPreis();
    }

    public double getGesamtPreis() {
        return gesamtPreis;
    }
}
