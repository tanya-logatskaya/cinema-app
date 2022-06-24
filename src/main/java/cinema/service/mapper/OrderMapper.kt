package cinema.service.mapper

import cinema.dto.OrderResponseDto
import cinema.model.Order
import cinema.model.Ticket
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class OrderMapper : ResponseDtoMapper<OrderResponseDto?, Order?> {
    override fun mapToDto(order: Order?): OrderResponseDto? {
        val responseDto = OrderResponseDto()
        responseDto.id = order?.id
        responseDto.userId = order?.user?.id
        responseDto.orderTime = order?.orderTime
        responseDto.ticketIds = order?.tickets
            ?.map { it.id }
            ?.toList()
        return responseDto
    }
}