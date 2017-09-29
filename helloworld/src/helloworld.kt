package helloworld

fun main(args: Array<String>) {
    println("Hello World")
    sum(1, 15)

}

fun sum(a:Int = 30, b:Int = 15) {
    a+b
    println(a+b)
}
