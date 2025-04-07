package com.example.currencyconvertor

fun main() {
    val exchangeRates = mapOf(
        "USD" to 1.0, //base currency is USD
        "EUR" to 0.85, //1USD = 0.85EUR
        "GBP" to 0.75, //1USD = 0.75GBP
        "INR" to 74.50 //1USD = 74.50INR
    )

    var isRunning = true
    while (isRunning) {
        println("\nWelcome to the currency convertor....")
        println("Choose an option")
        println("1.Convert currency")
        println("2.Exit")
        println("Enter your choice: ")


        when (readln()!!.toInt()) {

            1 -> {
                println("Available currencies: USD, EUR, GBP, INR")
                println("Enter the amount to convert : ")
                val amount = readLine()?.toDouble() ?: 0.0

                println("Enter the source currency: (eg. USD, EUR, GBP, INR)")
                val sourceCurrency = readLine()?.uppercase()
                println("Enter the target currency: (eg. USD, EUR, GBP, INR")
                val targetCurrency = readLine()?.uppercase()

                if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(
                        targetCurrency
                    )
                ) {
                    val sourceRate = exchangeRates[sourceCurrency]!!
                    val targetRate = exchangeRates[targetCurrency]!!

                    val convertedAmount = amount * targetRate / sourceRate
                    println("$amount $sourceCurrency is equal to $convertedAmount $targetCurrency")

                } else {
                    println("Invalid currency , Please try again later")
                }

            }

            2 -> {
                println("Exit the currency convertor")
                isRunning = false
            }

            else -> {
                println("Invalid option, try again")
            }

        }
    }
}

