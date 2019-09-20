package ausstattung;

import ausstattung.hardware.Komponente;

import java.util.ArrayList;
import java.util.List;

/**
 * Objektstrukture, welche die Hardwarausstattung fuer einen Arbeitsplatz beinhaltet
 */
public class Arbeitsplatz {
    private List<Komponente> komponenten;

    public Arbeitsplatz() {
        komponenten = new ArrayList<Komponente>();
    }

    public List<Komponente> getKomponenten() {
        return komponenten;
    }

    public boolean add(Komponente komponente) {
        return komponenten.add(komponente);
    }
}