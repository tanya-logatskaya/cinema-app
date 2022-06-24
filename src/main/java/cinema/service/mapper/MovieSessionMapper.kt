package cinema.service.mapper

import cinema.dto.MovieSessionRequestDto
import cinema.dto.MovieSessionResponseDto
import cinema.model.MovieSession
import cinema.service.CinemaHallService
import cinema.service.MovieService
import org.springframework.stereotype.Component

@Component
class MovieSessionMapper(private val cinemaHallService: CinemaHallService, private val movieService: MovieService) :
    RequestDtoMapper<MovieSessionRequestDto?, MovieSession?>,
    ResponseDtoMapper<MovieSessionResponseDto?, MovieSession?> {
    override fun mapToModel(dto: MovieSessionRequestDto?): MovieSession {
        val movieSession = MovieSession()
        movieSession.movie = movieService[dto?.movieId]
        movieSession.cinemaHall = cinemaHallService[dto?.cinemaHallId]
        movieSession.showTime = dto?.showTime
        return movieSession
    }

    override fun mapToDto(movieSession: MovieSession?): MovieSessionResponseDto {
        val responseDto = MovieSessionResponseDto()
        responseDto.movieSessionId = movieSession?.id
        responseDto.cinemaHallId = movieSession?.cinemaHall?.id
        responseDto.movieId = movieSession?.movie?.id
        responseDto.movieTitle = movieSession?.movie?.title
        responseDto.showTime = movieSession?.showTime
        return responseDto
    }
}
