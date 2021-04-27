package se.mdh.driftavbrott.modell;

import java.time.LocalDateTime;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tester för <code>Driftavbrott</code>.
 *
 * @author Dennis Lundberg
 * @version $Id: DriftavbrottTestCase.java 49037 2018-02-01 13:37:29Z dlg01 $
 */
public class DriftavbrottTestCase {
  private static final Log log = LogFactory.getLog(DriftavbrottTestCase.class);
  private static final String MEDDELANDE_EN = "Ladok is being upgraded";
  private static final String MEDDELANDE_SV = "Ladok uppgraderas";

  /**
   * Säkerställ att vår convenience-metod finns med och fungerar
   */
  @Test
  public void testGetMeddelande() {
    Driftavbrott driftavbrott = new Driftavbrott();
    driftavbrott.setMeddelandeEn(MEDDELANDE_EN);
    driftavbrott.setMeddelandeSv(MEDDELANDE_SV);

    assertEquals(MEDDELANDE_EN, driftavbrott.getMeddelande("en"));
    assertEquals(MEDDELANDE_SV, driftavbrott.getMeddelande("sv"));
  }

  @Test
  public void testToString() {
    Driftavbrott driftavbrott = new Driftavbrott();
    driftavbrott.setKanal("ladok.uppgradering");
    driftavbrott.setMeddelandeEn(MEDDELANDE_EN);
    driftavbrott.setMeddelandeSv(MEDDELANDE_SV);
    driftavbrott.setNiva(NivaType.ERROR);
    driftavbrott.setSlut(LocalDateTime.now().plusHours(2));
    driftavbrott.setStart(LocalDateTime.now().plusHours(1));

    log.info(driftavbrott);
  }
}
