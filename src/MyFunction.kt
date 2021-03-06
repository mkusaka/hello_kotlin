package sample

import java.util.concurrent.atomic.DoubleAccumulator

//fun succ(i: Int): Int = i + 1

fun succ(i: Int) = i + 1

fun pow(base: Int, itr: Int): Int {
    if(itr > 0) {
        return base * pow(base, itr - 1)
    }
    return 1
}

fun square(i: Int) = pow(i, 2)

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun argsum(vararg ints: Int): Int {
    var out = 0
    for (i in ints) {
        out += i
    }
    return out
}

//tailrec fun tocsum(numbers: List<Long>, accumulator: Long = 0): Long =
//        if (numbers.isEmpty()) accumulator
//        else tocsum(numbers.drop(), accumulator + numbers.first())

class Counter {
    private var cnt = 0

    fun countup():  Unit {
        cnt++
    }

    fun getCount(): Int = cnt
}



fun main(args: Array<String>) {
    val result = succ(succ(succ(3)))
    println(result)
    println(succ(pow(2,3)))
    println(square(5))
    println(sum(arrayOf(1,2,3)))
    println(argsum(*intArrayOf(1,2,3)))
//    println(tocsum((1L..123456).toList()))
}
