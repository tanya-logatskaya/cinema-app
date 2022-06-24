package cinema.service.mapper

import cinema.dto.MovieRequestDto
import cinema.dto.MovieResponseDto
import cinema.model.Movie
import org.springframework.stereotype.Component

@Component
class MovieMapper : RequestDtoMapper<MovieRequestDto?, Movie?>, ResponseDtoMapper<MovieResponseDto?, Movie?> {
    override fun mapToModel(dto: MovieRequestDto?): Movie {
        val movie = Movie()
        movie.title = dto?.title
        movie.description = dto?.description
        return movie
    }

    override fun mapToDto(movie: Movie?): MovieResponseDto {
        val responseDto = MovieResponseDto()
        responseDto.id = movie?.id
        responseDto.title = movie?.title
        responseDto.description = movie?.description
        return responseDto
    }
}