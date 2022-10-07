package com.lannstark.lec01

fun Lec01Main_2 (){

    /**
     * 코틀린은 primit type과 레퍼런스 타입이 나눠져있지 않고 레퍼런스처럼 쓰지만
     * 내부에서 알아서 처리해준다고 함.
     *
     * 프로그래머가 boxing/unboxing을 고려하지 않아도 되도록 알아서 처리
     */
    var number1: Long = 10L

    /**
     * 기본적으로 모든 변수는 null을 넣지 못하도록 설계해놓음
     *
     * 대신 타입? 을 넣으면 null을 넣을 수 있음.
     */

    var number2 : Long? = 1000L
    number2 = null
}