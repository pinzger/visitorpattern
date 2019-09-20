package ausstattung.hardware;

import ausstattung.besucher.BesucherKomponente;

/**
 * Konkrete Hardware-Komponente Monitor
 */
public class Monitor extends Komponente {
    public Monitor(String name, String kategorie, double preis) {
        super(name, kategorie, preis);
    }

    @Override
    public void nimmEntgegen(BesucherKomponente besucher) {
        besucher.besuche(this);
    }
}