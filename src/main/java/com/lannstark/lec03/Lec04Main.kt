package com.lannstark.lec03

fun main() {

    val person = Person("최태현",100)

    // 자바 버전일때 위와 같이 쓴다
    System.out.println(String.format("이름: %s",person.name))

    //코틀린일떄 이런식으로 출략이 가능
    println("이름: ${person.name}")

    //접근연산자가 없을떄 중괄호 생략도 가능
    val name = "승헌"
    println("이름 : $name");

    //중괄호는 가독성측면, 일괄 변환, 정규식 표현 등에 좋으므로 괄호는 쓰는게 좋다.
    //"""를 통해 여러 라인의 문자열을 변수와 같이 표현도 가능하다. tip
    val name2 = "이제동"
    val strs = """
     저그
     폭군
     ${name2}
    """.trimIndent()
    println(strs)

    //문자열을 바로 인덱스를 통해 특정 char만 불러올수가 잇음.
    val str="ABC"
    println(str[0])
    println(str[2])
}

fun printAgeIfPerson(obj: Any) {
    // obj가 Person 타입이라면. 자바의 instance of 와 같음

    if (obj is Person) {
        // obj 를 person 으로 간주. 자바의 (Person) obj 와 같은 의미
        val person = obj as Person
        println(person.age)
        println(person.age)
    }

    if (obj is Person) {
        // 상단 if문에서 타입을 체크하면 object를 person으로 캐스팅 하지 않아도 컴파일러가 알아서 해주기때문에 obj.age가 가능함. 이것을 스마트 캐스팅이라고 한다.
        println(obj.age)
    }

    // not is 는 !is 즉 person이 아니라면
    if (obj !is Person) {
        println("obj is not person")
    }
}

fun printAgeIfPerson2(obj: Any?) {
    // obj가 null이 아니라면 Person으로 타입을 변경한다. null이라면 타입 캐스팅 하지 않고 null을 반환
    val person = obj as? Person
}

/** Kotlin의 특이한 타입 3가지
 * Any : java의 Object 역할 ,모든 객체의 최상위 타입
 * 모든 Primitive type의 최상위 타입도 Any이다
 *
 * Unit:
 * Java의 void와 동일한 역할. 자바와 다르게 타입 추론이 되면 생략 가능
 * Unit은 그자체로 타입 인자로 사용 가능하다.
 *
 * Nothing : Nothing은 함수가 정상적으로 끝나지 않았따는 사실을 표현. //무조건 예외를 발생하는 함수,무한루프등
 *
 */


