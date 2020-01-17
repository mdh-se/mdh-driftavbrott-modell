package se.mdh.driftavbrott.modell;

import java.time.LocalDateTime;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * Tester för <code>Driftavbrott</code>.
 *
 * @author Dennis Lundberg
 * @version $Id: DriftavbrottTestCase.java 49037 2018-02-01 13:37:29Z dlg01 $
 */
public class DriftavbrottTestCase {
  private static final Log log = LogFactory.getLog(DriftavbrottTestCase.class);

  @Test
  public void testToString() {
    Driftavbrott driftavbrott = new Driftavbrott();
    driftavbrott.setKanal("ladok.uppgradering");
    driftavbrott.setMeddelandeEn("Ladok is being upgraded");
    driftavbrott.setMeddelandeSv("Ladok uppgraderas");
    driftavbrott.setNiva(NivaType.ERROR);
    driftavbrott.setSlut(LocalDateTime.now().plusHours(2));
    driftavbrott.setStart(LocalDateTime.now().plusHours(1));

    log.info(driftavbrott);
  }
}
