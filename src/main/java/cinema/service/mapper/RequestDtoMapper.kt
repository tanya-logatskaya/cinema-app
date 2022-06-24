package cinema.service.mapper

interface RequestDtoMapper<D, T> {
    fun mapToModel(dto: D): T
}