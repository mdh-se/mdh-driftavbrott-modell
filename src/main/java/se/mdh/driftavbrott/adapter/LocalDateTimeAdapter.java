package se.mdh.driftavbrott.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
  // @todo For Java 8 use java.time.format.DateTimeFormatter.ISO_DATE_TIME
  static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");

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
