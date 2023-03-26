// Ekrandan girilen sayının mükemmel sayı olup olmadığını
// bulan programın kotlin kodunu yazınız.
// (Mükemmel sayı, kendisini tam bölen sayıların toplamı,
// kendine eşit olan sayılardır.
// Örnek 28’dir. 1+2+4+7+14 = 28)

fun main() {
    println("Sayı giriniz.")
    var numStr = readLine()

    if (numStr == null || numStr == "") {
        println("Sayı girmediniz.")
        return
    }

    var num = numStr.toInt()
    var sum = 0

    for (i in 1 until num) {
        if (num % i == 0) {
            sum += i
        }
    }

    if (sum == num) {
        println("$num mükemmel sayı.")
    } else {
        println("$num mükemmel sayı değil.")
    }
}