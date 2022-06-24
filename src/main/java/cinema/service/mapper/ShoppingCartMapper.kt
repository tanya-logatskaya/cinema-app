package cinema.service.mapper

import cinema.dto.ShoppingCartResponseDto
import cinema.model.ShoppingCart
import cinema.model.Ticket
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class ShoppingCartMapper : ResponseDtoMapper<ShoppingCartResponseDto?, ShoppingCart?> {
    override fun mapToDto(shoppingCart: ShoppingCart?): ShoppingCartResponseDto {
        val responseDto = ShoppingCartResponseDto()
        responseDto.userId = shoppingCart?.user?.id
        responseDto.ticketIds = shoppingCart?.tickets
            ?.map { it.id }
            ?.toList()
        return responseDto
    }
}
