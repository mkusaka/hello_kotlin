package sample

class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, {"denominator must not be nill"})
    }
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    operator fun plus(that: Rational): Rational =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )
    override fun toString(): String  = "${numerator}/${denominator}"

    tailrec private fun gcd(a: Int, b: Int): Int =
        if (b == 0) a
        else gcd(b, a % b)
}

fun main(args: Array<String>) {
    println(Rational(1,4) + (Rational(1,2)))
    println(Rational(1,3) + (Rational(4,7)))
    println(Rational(1,6) + Rational(1,3 ) + Rational(1,2))
}
