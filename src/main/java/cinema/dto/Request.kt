package cinema.dto

import cinema.lib.FieldsValueMatch
import cinema.lib.ValidEmail
import java.time.LocalDateTime
import javax.validation.constraints.NotNull
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

class CinemaHallRequestDto {
    val capacity: Int? = 0
    val description: @Size(max = 200) String? = null
}

class MovieRequestDto {
    val title: @NotNull String? = null
    val description: @Size(max = 200) String? = null
}

class MovieSessionRequestDto {
    val movieId: @Positive Long? = null
    val cinemaHallId: @Positive Long? = null
    val showTime: @NotNull LocalDateTime? = null
}

@FieldsValueMatch(field = "password", fieldMatch = "repeatPassword", message = "Passwords do not match!")
class UserRequestDto {
    @ValidEmail
    val email: String? = null
    val password: @Size(min = 8, max = 40) String? = null
    val repeatPassword: String? = null
}
