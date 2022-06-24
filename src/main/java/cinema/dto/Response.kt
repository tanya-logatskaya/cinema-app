package cinema.dto

import java.time.LocalDateTime

class CinemaHallResponseDto {
    var id: Long? = null
    var capacity: Int? = 0
    var description: String? = null
}

class MovieResponseDto {
    var id: Long? = null
    var title: String? = null
    var description: String? = null
}

class MovieSessionResponseDto {
    var movieSessionId: Long? = null
    var movieId: Long? = null
    var movieTitle: String? = null
    var cinemaHallId: Long? = null
    var showTime: LocalDateTime? = null
}

class OrderResponseDto {
    var id: Long? = null
    var ticketIds: List<Long>? = null
    var userId: Long? = null
    var orderTime: LocalDateTime? = null
}

class ShoppingCartResponseDto {
    var userId: Long? = null
    var ticketIds: List<Long>? = null
}

class UserResponseDto {
    var id: Long? = null
    var email: String? = null
}