package com.example.exampleform

class FormState {
    var fieldData: String? = null
    var radioResult: Int? = null

    fun getFinalData(): String {
        ///  обработка данных, совершающая какие то действия с данными
        val finalString = "Ввела ${fieldData} и выбрали ${radioResult}"
        println(finalString)
        return finalString
    }
}