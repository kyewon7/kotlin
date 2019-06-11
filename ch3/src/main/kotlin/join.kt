package strings
fun String.lastChar() : Char = get(length -1)
// 확장 함수 : java의 static method와 동일함
// String은 receiver type 을 나타낸다.

fun main() {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 52)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
    println(numbers)
    println(list.joinToString(numbers, separator = "/"))
    println(list.joinToString(numbers))

    println("Kotlin".lastChar())
}
// default parameter 값을 사용하면 overloading을 생략할 수 있다.
// 함수 호출 시에 이름 붙인 인자를 사용하는 경우, 순서와 상관 없이 지정 가능하다.
fun<T> Collection<T>.joinToString(
    collection: Collection<T>,
    separator : String = ",",
    prefix : String = "",
    postfix : String = ""
) :String {
    var result = StringBuilder(prefix)
    for((index, element) in withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
