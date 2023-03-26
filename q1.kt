// 1 den 350 ye kadar olan tek sayıların toplamı ve çarpımı,
// çift sayıların ise karelerinin toplamını bulan
// programın kotlin kodunu yazınız

fun main() {
    var from = 1
    var to = 350
	var oddSum = 0
	var oddMultiply = 1
	var evenSqSum = 0
    
	for(i in from..to){
        if(i % 2 == 0)
        {
            evenSqSum += i*i
        }
        else
        {
            oddSum += i
            oddMultiply *= i
        }
	}

    println("$from - $to arasındaki tek sayıların toplamı: $oddSum")
    println("$from - $to arasındaki tek sayıların çarpımı: $oddMultiply")
    println("$from - $to arasındaki çift sayıların karelerinin toplamı: $evenSqSum")
}