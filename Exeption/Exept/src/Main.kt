fun main() {
//    try {
//        val n1 = 2;
//        val n2 = 0;
//        val res = n1/n2;
//        println(res)
//    } catch (e:Exception) {
//        println("Error ${e.message}")
//    }
    //var message: String? = "Hello";
    //var len:Int? = message?.length;
    //try {
    //  val s: String = "Tom";
    //val d: Int = s.toInt();
    //println(d);
    //} catch (e: Exception) {
    //  println(e.message)
    //}

    val str:String? = null
    //println(isNull(str))

    println(any(str))
    println(any(1))
    println(any("str"))
    println(any(3.4))

    val anyes: List<Any?> = listOf(40, "40");
    println(convert(anyes));
}

fun convert(anyes: List<Any?>): Int? {
    for(i in 0 until anyes.size) {
        if (anyes[i] is String && anyes[i] == "42") {
            return (anyes[i] as? String)?.toInt()
        } else if(anyes[i] is Int && anyes[i] == 42) {
            return anyes[i] as? Int
        }
    }
    return null;
}

fun isNull(str: String?): Int? {
    return str?.length
}

fun any(a: Any?): Int {
    return when(a) {
        is String -> a.length
        is Int -> a * a
        null -> -1
        else -> 0
    }
}