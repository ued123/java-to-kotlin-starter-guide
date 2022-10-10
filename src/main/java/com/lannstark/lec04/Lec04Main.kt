package com.lannstark.lec04

fun main() {

    two();
}


fun one() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if(money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }
}

fun two() {
    /**
     * 코틀린의 == 은 간접적으로 equals를 비교한다.(값을 비교하기떄문)
     * 코틀린의 === 가 바로 메모리 주소를 비교하는것임.
     */
    val money1 = JavaMoney(1000L)
    val money2 = money1
    val money3 = JavaMoney(1000L)

    println(money1 == money3)
}