// 7 değerinin faktoriyelini bulan kotlin 
// kodunu fonksiyon kullanarak yazınız

fun main() {
    var num = 7
    var res = 1

    for (i in num downTo 1) {
        res *= i
    }

    println(res)
}