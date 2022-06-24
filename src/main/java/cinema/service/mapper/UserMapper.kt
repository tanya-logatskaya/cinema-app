package cinema.service.mapper

import cinema.dto.UserResponseDto
import cinema.model.User
import org.springframework.stereotype.Component

@Component
class UserMapper : ResponseDtoMapper<UserResponseDto?, User?> {
    override fun mapToDto(user: User?): UserResponseDto {
        val responseDto = UserResponseDto()
        responseDto.id = user?.id
        responseDto.email = user?.email
        return responseDto
    }
}