package ausstattung;

import ausstattung.hardware.*;
import ausstattung.besucher.PrettyPrintKategorieUndName;
import ausstattung.besucher.PrettyPrintName;
import ausstattung.besucher.BerechneGesamtPreis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BesucherKomponenteTest {
   private Arbeitsplatz ausstattung;


   @BeforeEach
   public void initKonfiguration() {
      ausstattung = new Arbeitsplatz();
      ausstattung.add(new Rechner("MacBook Pro", "Laptop", 3000d));
      ausstattung.add(new Monitor("LG 27UD88-W", "Monitor", 488d));
      ausstattung.add(new Maus("Logitech Performance MX", "Maus", 89d));
      ausstattung.add(new Tastatur("Apple Magic Keyboard", "Tastatur", 120d));
   }

   @Test
   public void berechneGesamtpreis() {
      BerechneGesamtPreis besucher = new BerechneGesamtPreis();
      for (Komponente komponente : ausstattung.getKomponenten()) {
         komponente.nimmEntgegen(besucher);
      }

      assertEquals(3000d*0.9d + 488d + 89d + 120d, besucher.getGesamtPreis());
   }

   @Test
   public void prettyPrintNamen() {
      PrettyPrintName besucher = new PrettyPrintName();
      for (Komponente komponente : ausstattung.getKomponenten()) {
         komponente.nimmEntgegen(besucher);
      }
   }

   @Test
   public void prettyPrintKategorienUndNamen() {
      PrettyPrintKategorieUndName besucher = new PrettyPrintKategorieUndName();
      for (Komponente komponente : ausstattung.getKomponenten()) {
         komponente.nimmEntgegen(besucher);
      }
   }
}