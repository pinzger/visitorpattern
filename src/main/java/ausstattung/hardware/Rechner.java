package ausstattung.hardware;

import ausstattung.besucher.BesucherKomponente;

/**
 * Konkrete Hardware-Komponente Rechner
 */
public class Rechner extends Komponente {
    public Rechner(String name, String kategorie, double preis) {
        super(name, kategorie, preis);
    }

    @Override
    public void nimmEntgegen(BesucherKomponente besucher) {
        besucher.besuche(this);
    }
}