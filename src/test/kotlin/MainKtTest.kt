package ru.netology
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun mirTest() {
        //arrange
        val typeCard = "Мир"
        val sumMonthTransfer = 0
        val transfer = 10_000
        val dailyLimit = 150_000
        val monthLimit = 600_000

        // act
        val result = commissionCard(
            typeCard = typeCard, sumMonthTransfer = sumMonthTransfer, transfer = transfer,
            dailyLimit = dailyLimit, monthLimit = monthLimit
        )

        // assert
        assertEquals(75, result)
    }
}