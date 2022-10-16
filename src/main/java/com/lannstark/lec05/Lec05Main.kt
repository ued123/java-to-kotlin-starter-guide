package com.lannstark.lec05

fun main() {

}


fun validateScoreIsNotNegative(score : Int) {

    if(score < 0) {
        throw java.lang.IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }

    /**
     * in 연산자를 통해서 0..100  0과 100사이에 있는지 확인 가능
     * !를 붙이면 not
     */
    if(score !in 0..100) {
        throw java.lang.IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

/**
 * 코틀린에서 새로 생긴 when 문 ,
 * case를 사용하지 않고 화살표로 분기를 치고 default대신 else를 사용
 * 또한 in 을 사용하여 케이스마다 범위를 지정도 가능한 장점이 있다.
 */
fun getGradeWithSwitch(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/**
 * when에 값이 없어도 가능하다
 * 값이 없으면 조건문만을 봐서 판단한다.
 */
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}


/**
 * expression의 장점
 *
 * 스마트 캐스팅이 자동으로 이루어짐으로 비교가 true이면 string관련 문법을 쓸수 있음
 * 따라서 이러한 방법으로 여러가지 타입의 값을 리턴 가능.
 */
fun startsWithA(obj: Any) : Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number : Int) {
    when(number) {
        1,0,-1 -> print("어디서 많이 본 숫자입니다.")
        else -> print("1,0,-1이 아닙니다.")
    }
}


/**
 *
 * StateMent: 프로그램의 문장, 하나의 값으로 도출되지 않는다.
      Expression : 하나의 값으로 도출되는 문장.

      코틀린은 if문이 Expression
 */
fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

