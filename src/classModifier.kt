open class Foo {
    private fun privateMethod() {println("private")}
    protected fun protectedMethod() { println("protected")}
}

class Bar: Foo() {
    fun execute() {
//        privateMethod() // error
        protectedMethod() // ok
    }
}

class Baz {
    fun execute(foo: Foo) {
//        foo.protectedMethod() // error
    }
}

open class Hoge private constructor()

// class Fuga: Hoge() //error