fun main() {
//    val numbers = listOf(1, 2, 3, 2, 4, 3)
//
//    val mNum = numbers.distinct().toMutableList()
//
//    mNum.add(10)
//
//    val result = mNum.toList()
//
//    println(result)
//
    val words = listOf(
        "apple", "banana", "apple",
        "orange", "banana", "apple"
    )

    val set = count(words)
    println(set)
}

fun count(words: List<String>): Set<String> {
    val map = mutableMapOf<String, Int>()

    for (word in words)
    {
        val current = map[word] ?: 0
        map[word] = current + 1
    }

    return map.keys
}