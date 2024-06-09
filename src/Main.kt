//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val line = "Занятие"
    line.forEach { element -> print("\'$element\' ") }
    println("\n==========================================")
//2
   /* val isCorrect: Boolean
    println("Введите номер телефона")
        val phoneNumber = readln()
        if (phoneNumber.substring(0, 2) != "+7") {
            isCorrect = false
            println("Номер должен начинаться с \'+7\'")
        } else if (phoneNumber.substring(2).length == 10) isCorrect = true
        else isCorrect = false
    println(isCorrect)*/
    println("=============================================")
//3
    val newLine = "Занятие"
    newLine.reversed().forEach { element -> print("\'$element\' ")  }
    println("=============================================")
//4
    val text = "kotlin2023course"
    val digit = text.filter { it.isDigit() }
    println("Количество цифр во фразе \"kotlin2023course\" равно ${digit.length}")
}