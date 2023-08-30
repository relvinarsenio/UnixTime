import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

fun main() {
    val timestamp = Instant.now().epochSecond
    val zoneId = ZoneId.systemDefault()
    val dateTime = Instant.ofEpochSecond(timestamp).atZone(zoneId)
    
    val dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        .withLocale(Locale.getDefault())
    val timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)
        .withLocale(Locale.getDefault())
    
    val date = dateTime.format(dateFormatter)
    val time = dateTime.format(timeFormatter)
    val timeZone = dateTime.zone
    val inSeconds = timestamp.toString()
    
    println("Displaying time in Kotlin based on system format")
    println("Date: $date")
    println("Time: $time")
    println("Time Zone: $timeZone")
    println("In Seconds: $inSeconds")
}
