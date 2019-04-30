package sample

fun objectSquare(i: Int): Int = i + 1

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                predicate(str.first()) -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

fun main(args: Array<String>) {
    // read function object from objectSquare fun
    println(::objectSquare)

    // substitute function object
    val functionObject = ::objectSquare
    println(functionObject)

    // function has type
    val typedFunctionObject: (Int) -> Int = ::objectSquare
}

