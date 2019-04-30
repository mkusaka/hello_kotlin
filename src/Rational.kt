package sample

class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, {"denominator must not be nill"})
    }
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    override fun toString(): String  = "${numerator}/${denominator}"

    tailrec private fun gcd(a: Int, b: Int): Int =
        if (b == 0) a
        else gcd(b, a % b)
}

fun main(args: Array<String>) {
    println(Rational(17,17))
    println(Rational(55,100))
}