import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

fun main() {
    val dateTime = Instant.now().atZone(ZoneId.systemDefault())

    val dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        .withLocale(Locale.getDefault())
    val timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)
        .withLocale(Locale.getDefault())

    val isoFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME

    println("Displaying time in Kotlin based on system format")
    println("Date       : ${dateTime.format(dateFormatter)}")
    println("Time       : ${dateTime.format(timeFormatter)}")
    println("Time Zone  : ${dateTime.zone}")
    println("Epoch Sec  : ${dateTime.toEpochSecond()}")
    println("ISO 8601   : ${dateTime.format(isoFormatter)}")

    // Convert ke UTC
    val utcDateTime = dateTime.withZoneSameInstant(ZoneId.of("UTC"))
    println("UTC Time   : ${utcDateTime.format(isoFormatter)}")
}
