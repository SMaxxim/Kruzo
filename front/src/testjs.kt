
class test : Itest1 {

    override fun ff() {
        println("11")
    }
}

fun  main(args: Array<String>) {
    println("ss");
    val t = test();
    t.ff();
}

