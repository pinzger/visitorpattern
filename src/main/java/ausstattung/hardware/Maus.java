package ausstattung.hardware;

import ausstattung.besucher.BesucherKomponente;

/**
 * Konkrete Hardware-Komponente Maus
 */
public class Maus extends Komponente {
    public Maus(String name, String kategorie, double preis) {
        super(name, kategorie, preis);
    }

    @Override
    public void nimmEntgegen(BesucherKomponente besucher) {
        besucher.besuche(this);
    }
}