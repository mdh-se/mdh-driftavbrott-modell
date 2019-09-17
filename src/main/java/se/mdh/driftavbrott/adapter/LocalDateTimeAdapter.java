package se.mdh.driftavbrott.adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A class that is used by JAXB when it converts an XML date into a Java type.
 * This implementation converts to a <code>java.time.LocalDate</code>.
 * <p>
 * Read more here:
 * <a href="https://jaxb.java.net/guide/Using_different_datatypes.html">https://jaxb.java.net/guide/Using_different_datatypes.html</a>
 *
 * @author Dennis Lundberg
 */
public class LocalDateTimeAdapter {
  private static final Log log = LogFactory.getLog(LocalDateTimeAdapter.class);
  static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

  public static LocalDateTime parseLocalDateTime(final String date) {
    if(log.isDebugEnabled()) {
      log.debug("ParseLocalDateTime: " + date);
    }
    return LocalDateTime.parse(date, DATE_TIME_FORMATTER);
  }

  public static String printLocalDateTime(final LocalDateTime date) {
    if(log.isDebugEnabled()) {
      log.debug("PrintLocalDateTime: " + date.toString());
    }
    return date.toString();
  }
}
