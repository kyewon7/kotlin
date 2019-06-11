
open class View {
    open fun click() = println("View clicked")
}
class Button: View() {
    override fun click() = println("Button clicked")
}

fun main() {
    val view : View = Button()
    view.click()
    view.showOff()
    // 확장 함수는 호출할 때 변수의 정적 타입으로 어떤 함수를 호출할지 결정함
    // 즉, 여기선 View.showOff가 호출된다

    // 스마트 캐스트의 예
    if(view is Button) {
        val button: Button = view
        button.showOff()
    }

    // 명시적 type casting의 예
    val button : Button = view as Button
    button.showOff()
}

fun View.showOff() = println("I am a view")
fun Button.showOff() = println("I am a button")