import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val currentDateTime = LocalDateTime.now()
            val currentZone = ZoneId.systemDefault()
            val currentZoneName = currentZone.id

            val dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")
            val timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss zzz")
            val formattedDate = currentDateTime.atZone(currentZone).format(dateFormatter)
            val formattedTime = currentDateTime.atZone(currentZone).format(timeFormatter)
            val unixTimestamp = currentDateTime.atZone(currentZone).toEpochSecond()

            println("Unix Timestamp Di Kotlin")
            println("Tanggal: $formattedDate")
            println("Jam: $formattedTime")
            println("Zona Waktu: $currentZoneName")
            println("Dalam Detik: $unixTimestamp")
        }
    }
}
