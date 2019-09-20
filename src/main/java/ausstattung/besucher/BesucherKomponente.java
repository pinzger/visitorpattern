package ausstattung.besucher;

import ausstattung.hardware.Maus;
import ausstattung.hardware.Rechner;
import ausstattung.hardware.Tastatur;
import ausstattung.hardware.Monitor;

/**
 * Interface fuer Besucher, das von den konkreten Besuchern ausimplementiert werden muss.
 */
public interface BesucherKomponente {
    void besuche(Rechner rechner);

    void besuche(Maus maus);

    void besuche(Tastatur tastatur);

    void besuche(Monitor monitor);
}