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
    @Test
    fun masterCardTest() {
        //arrange
        val typeCard = "Mastercard"
        val sumMonthTransfer = 0
        val transfer = 100_000
        val dailyLimit = 150_000
        val monthLimit = 600_000

        // act
        val result = commissionCard(
            typeCard = typeCard, sumMonthTransfer = sumMonthTransfer, transfer = transfer,
            dailyLimit = dailyLimit, monthLimit = monthLimit
        )

        // assert
        assertEquals(170, result)
    }

    @Test
    fun dailyLimitTest() {
        //arrange
        val typeCard = "Mastercard"
        val sumMonthTransfer = 0
        val transfer = 200_000
        val dailyLimit = 150_000
        val monthLimit = 600_000

        // act
        val result = commissionCard(
            typeCard = typeCard, sumMonthTransfer = sumMonthTransfer, transfer = transfer,
            dailyLimit = dailyLimit, monthLimit = monthLimit
        )

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun monthLimitTest() {
        //arrange
        val typeCard = "Mastercard"
        val sumMonthTransfer = 550_000
        val transfer = 100_000
        val dailyLimit = 150_000
        val monthLimit = 600_000

        // act
        val result = commissionCard(
            typeCard = typeCard, sumMonthTransfer = sumMonthTransfer, transfer = transfer,
            dailyLimit = dailyLimit, monthLimit = monthLimit
        )

        // assert
        assertEquals(-2, result)
    }
    @Test
    fun VKPayTest() {
        //arrange
        val typeCard = "VK Pay"
        val sumMonthTransfer = 0
        val transfer = 10_000
        val dailyLimit = 15_000
        val monthLimit = 40_000

        // act
        val result = commissionCard(
            typeCard = typeCard, sumMonthTransfer = sumMonthTransfer, transfer = transfer,
            dailyLimit = dailyLimit, monthLimit = monthLimit
        )

        // assert
        assertEquals(0, result)
    }

}