package cinema.service.mapper

interface ResponseDtoMapper<D, T> {
    fun mapToDto(t: T): D
}
