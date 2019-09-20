package ausstattung.hardware;

import ausstattung.besucher.BesucherKomponente;

/**
 * Konkrete Hardware-Komponente Tastatur
 */
public class Tastatur extends Komponente {
    public Tastatur(String name, String kategorie, double preis) {
        super(name, kategorie, preis);
    }

    @Override
    public void nimmEntgegen(BesucherKomponente besucher) {
        besucher.besuche(this);
    }
}