// 7 değerinin faktoriyelini bulan kotlin 
// kodunu fonksiyon kullanarak yazınız

fun main() {
    println(factorial(7))
}

fun factorial(num:Int):Int{
    var res = 1
    for (i in num downTo 1) {
        res *= i
    }
    return res;
}