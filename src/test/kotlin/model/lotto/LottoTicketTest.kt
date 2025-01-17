package model.lotto

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class LottoTicketTest : FreeSpec(
    {
        "LottoTicket 생성" - {
            "주어진 LottoNumbers 와 TicketType 을 가진 LottoTicket 을 반환" {
                val numbers = LottoNumbers.from(listOf(1, 2, 3, 4, 5, 6))
                val ticketType = TicketType.Manual
                val ticket = LottoTicket.of(numbers, ticketType)

                ticket.numbers shouldBe numbers
                ticket.type shouldBe ticketType
            }
        }

        "LottoTicket 출력" - {
            "LottoTicket 의 numbers 필드를 문자열화 하여 반환" {
                val numbers = LottoNumbers.from(listOf(1, 2, 3, 4, 5, 6))
                val ticket = LottoTicket.of(numbers, TicketType.Manual)

                ticket.toString() shouldBe numbers.toString()
            }
        }
    },
)
