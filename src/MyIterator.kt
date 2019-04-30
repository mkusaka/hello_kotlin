package sample

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}

fun main(args: Array<String>) {
    println("start")
    val itr = MyIterable()
    println(itr)
    for (item in itr) {
        println(item)
    }
    println("end")
}