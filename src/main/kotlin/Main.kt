import java.text.SimpleDateFormat
import java.time.ZoneId
import java.time.ZoneId.systemDefault
import java.util.*

fun main() {
    val date: String = SimpleDateFormat("EEEE, dd MMMM yyyy").format(Date())
    val time: String = SimpleDateFormat("HH:mm:ss z").format(Date())
    val timeZone: ZoneId = systemDefault().normalized()
    val currentTimestamp: Long = System.currentTimeMillis() / 1000

    println("Unix Timestamp Di Kotlin")
    println("Tanggal: $date")
    println("Jam: $time")
    println("Zona Waktu: $timeZone")
    println("Dalam Detik: $currentTimestamp")
}
