package ausstattung.besucher;

import ausstattung.hardware.Maus;
import ausstattung.hardware.Monitor;
import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;

/**
 * Konkreter Besucher, der den speziellen Gesamtpreis ueber alle Bestandteile berechnet
 */
public class BerechneGesamtPreisSpezial extends BerechneGesamtPreis {
    @Override
    public void besuche(Rechner rechner) {
        gesamtPreis += rechner.getPreis() * 0.5d;
    }
}
