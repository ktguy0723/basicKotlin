fun main() {
    var result = plusOne(31)
    println(result) // => 32

    result = sum(ints = arrayOf(1, 2, 3)) // 渡す引数に名前を指定できる
    println(result) // => 6

    println(hello()) // => hello world
    println(hello("kohei")) // => hello kohei

    println(makeList("my", "name", "is", "kohei")) // => [my, name, is, kohei]

    println(sum(listOf(1, 2, 3, 4))) // => 10
}

// 1行関数
fun plusOne(i: Int): Int = i + 1

// 複数行関数
fun sum(ints: Array<Int>): Int {
    var sum = 0
    for(i in ints) {
        sum += i
    }
    return sum
}

// デフォルト値を設定できる
fun hello(name: String = "world"): String = "hello $name"

// 可変長引数
fun makeList(vararg str: String): MutableList<String> {
    var list = mutableListOf<String>()
    for(s in str) {
        list += s
    }
    return list
}

// 再起呼び出し tailrec (末尾呼び出し最適化：関数の最後の計算が再起呼び出しの時、スタック消費を抑える修飾子)
tailrec fun sum(numbers: List<Long>, accumulator: Long = 0): Long =
    if(numbers.isEmpty()) accumulator
    else sum(numbers.drop(1), accumulator + numbers.first())