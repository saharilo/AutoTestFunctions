package ru.netology

fun main () {
    val result = commissionCard("VK Pay", 2000, 12000)

    when (result){
        -1 -> println("Операция заблокирована. Превышен дневной лимит!")
        -2 -> println("Операция заблокирована. Превышен месячный лимит!")
        -3 -> println("Неизвестная операция!")
        else -> println("Комиссия за перевод составит $result рублей.")
    }


}

fun commissionCard(typeCard: String = "Мир", sumMonthTransfer: Int = 0, transfer: Int,
                   dailyLimit: Int = 150_000, monthLimit: Int = 600_000): Int {
    if (transfer > dailyLimit) return -1
    if (transfer + sumMonthTransfer > monthLimit) return -2
    if (typeCard == "VK Pay" && transfer > 15_000) return -1
    if (typeCard == "VK Pay" && transfer + sumMonthTransfer > 40_000) return -2

    return when (typeCard) {
        "VK Pay" -> 0
        "Visa", "Мир" -> {
            val result = (transfer * 0.0075).toInt()
            if (result < 35) 35 else result
        }
        "Mastercard", "Maestro" -> {
            val upLimit = if (sumMonthTransfer > 75000 || transfer < 300) transfer else sumMonthTransfer + transfer - 75000
            if (upLimit <= 0 && transfer > 300) 0 else (upLimit * 0.006 + 20).toInt()
        }
        else -> -3
    }
}