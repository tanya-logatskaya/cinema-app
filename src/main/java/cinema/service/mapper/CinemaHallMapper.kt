package cinema.service.mapper

import cinema.dto.CinemaHallRequestDto
import cinema.dto.CinemaHallResponseDto
import cinema.model.CinemaHall
import org.springframework.stereotype.Component

@Component
class CinemaHallMapper : RequestDtoMapper<CinemaHallRequestDto?, CinemaHall?>,
    ResponseDtoMapper<CinemaHallResponseDto?, CinemaHall?> {
    override fun mapToModel(dto: CinemaHallRequestDto?): CinemaHall {
        val cinemaHall = CinemaHall()
        cinemaHall.description = dto?.description
        cinemaHall.capacity = dto?.capacity
        return cinemaHall
    }

    override fun mapToDto(cinemaHall: CinemaHall?): CinemaHallResponseDto {
        val responseDto = CinemaHallResponseDto()
        responseDto.id = cinemaHall?.id
        responseDto.capacity = cinemaHall?.capacity
        responseDto.description = cinemaHall?.description
        return responseDto
    }
}
