import java.text.SimpleDateFormat
import java.time.ZoneId
import java.time.ZoneId.systemDefault
import java.util.*

fun main() {
    val timeStamp: String = SimpleDateFormat("EEEE, dd MMMM YYYY").format(Date())
    val time: String = SimpleDateFormat("HH:mm:ss").format(Date())
    val currentTimestamp = System.currentTimeMillis()
    val timeZone: ZoneId = systemDefault()

    println("Unix Timestamp Di Kotlin")
    println("Tanggal: $timeStamp")
    println("Jam: $time")
    println("Zona Waktu: $timeZone")
    println("Dalam Detik: $currentTimestamp")
}
