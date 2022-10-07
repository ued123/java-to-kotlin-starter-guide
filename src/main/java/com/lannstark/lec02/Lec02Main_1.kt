package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {

    /**
     * safe call 연산자
     * - ?. 해당 변수의 값이 null이 아니면 뒤에것을 실행하고 null이면 전체값이 Null이 된다.
     */
    val str: String? = "ABC"
    println(str?.length)

    /**
     * Elvis 연산자
     * - ?: 앞의 연산 결과가 null이면 뒤의 값을 사용
     */
    val str2: String? = null
    println(str2?.length ?: 0)

    //startWithA1Kotlin(null);
    println(startsWithA2Kotlin(null));

    startsWitha3Kotlin(null);
}

fun startWithA1Kotlin(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2Kotlin(str: String?): Boolean? {
    return str?.startsWith("A")
}

/**
 * 컴파일러가 nullable인 상황일때 safe call같은 작업이 없으면 컴파일러 단계에서 에러를 뿜는데
 * 개발자가 논리적으로 null이 절대 아니라고 생각하면 !!. 해당 연산자로 컴파일러 에러를 제거 할 수 있다.
 * 이럴떄는 런타임에서 null일떄 null에러가 나게된다.
 */
fun startsWitha3Kotlin(str: String?): Boolean {
    return str!!.startsWith("A")
}

// 자바스타일로 null체크 할떄
/**
 * @return Boolean
 */
fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

/**
 * 코틀린 자체에서 null이 들어올수 있으면 컴파일러 단계에서 차단을 해버림. 마치 null을 다른 타입인 것처럼 처리한다.
 * 앞단에서 null처리 로직이 들어가면 컴파일러 단계에서 허락을 해준다.
 */
fun startWithA3(str: String?): Boolean {
    if(str == null) {
        return false;
    }
    return str.startsWith("A")
}