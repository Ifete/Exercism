import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(val enteredDate: LocalDateTime) {
    val date: LocalDateTime? = enteredDate.plusSeconds(1000000000)

    // TODO: Implement proper constructor
    constructor(enteredLocalDate: LocalDate) : this(enteredLocalDate.atStartOfDay()) {
    };





}
