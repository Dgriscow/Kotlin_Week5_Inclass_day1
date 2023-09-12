import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar

fun main() {
    var year:Int = Calendar.getInstance().get(Calendar.YEAR)

    val formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss.SSS")
    println(year)

    var today = LocalDateTime.now()

    var formattedToday = today.format(formatter)
    println(formattedToday)
}