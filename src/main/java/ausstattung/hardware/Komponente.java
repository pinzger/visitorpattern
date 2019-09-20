package ausstattung.hardware;

import ausstattung.besucher.BesucherKomponente;

/**
 * Abstrakte Hardware-Komponente eines Arbeitsplatzes, welche vom Visitor besucht wird.
 */
public abstract class Komponente {
    private String name = "";
    private String kategorie = "";
    private double preis = 0.0;

    public Komponente(String name, String kategorie, double preis) {
        this.name = name;
        this.kategorie = kategorie;
        this.preis = preis;
    }

    public String getName() {
        return this.name;
    }

    public String getKategorie() {
        return this.kategorie;
    }

    public double getPreis() {
        return this.preis;
    }

    public abstract void nimmEntgegen(BesucherKomponente besucher);
}
