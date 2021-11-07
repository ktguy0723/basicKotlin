fun main() {
    // 数値型
    val d: Double = 123.45
    val f: Float = 123.45F
    val l: Long = 123456
    val i: Int = 123
    val short: Short = 123
    val b: Byte = 123

    // 真偽値
    val bool: Boolean = true

    // 文字、文字列
    val ch: Char = 'c'
    val str: String = "string"

    // 定数と変数
    val const = "定数"
    // const = "変更不可"
    var variable = "変数"
    variable = "変更可能"

    // 様々なオブジェクト
    val msg = "This is message."
    println(msg.length) // 文字列の長さ
    println(msg.capitalize()) // 先頭文字が大文字
    println(msg.isBlank()) // 空文字化、空白の時 = true
    // 文字列の連結
    println("メッセージ: $msg") // println("メッセージ: ${msg}")でも可

    val rawMsg = """
        | My name is kohei.
        | I'm 13 years old.
    """.trimMargin() // 「|」を取り除いて「|」の後から始まる文字列に変える
    println(rawMsg)

    // 配列
    val arr = arrayOfNulls<Int>(5) // 配列の初期化
    println(arr.size) // 配列のサイズ
    println(arr[0]) // => null
    arr[0] = 123 // 代入
    println(arr[0]) // => 123

    val strs = arrayOf("I", "my", "me", "mine") // 配列の初期化代入
    println(strs[0]) // => I

    // リスト
    val ints: List<Int> = listOf<Int>(1,2,3) // immutable(変更不可)リスト
    println(ints) // => [1, 2, 3]
    println(ints.size) // => 3
    println(ints[0]) // => 1

    val chars: MutableList<Char> = mutableListOf('a') // mutable(変更可能)リスト
    chars[0] = 'c'
    println(chars[0]) // => c
    chars += 'd' // 追加
    println(chars[1]) // => d
    chars -= 'c' // 削除
    println(chars) // => [d]
    chars.removeAt(0) // index指定削除
    println(chars) // => []

    // セット（重複がない集合）
    val iSet: Set<Int> = setOf(1,2,1,4) // immutable セット
    println(iSet) // => [1, 2, 4]
    var mutSet: Set<Int> = mutableSetOf(1,2,1,4) // mutable セット
    println(mutSet) // => [1, 2, 4]
    mutSet -= 1
    println(mutSet) // => [2, 4]

    // マップ（key-value型のコレクション）
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2)
    println(map) // => {one: 1, two: 2}
    val mutMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    println(mutMap.size) // => 2
    println(mutMap["one"]) // => 1
    println(mutMap["three"])  // => null
    mutMap += "three" to 3
    println(mutMap) // => {one: 1, two: 2, three: 3}

    // レンジ（1 ~ 10 みたいなもの）
    println(5 in 1..10) // 5が1~10の範囲内か? => true
    val range: IntRange = 12..15
    println(5 in range) // => false
    println(5 !in range) // => true
    println((1..4).toList()) // => [1, 2, 3, 4]
    println((1..3).reversed().toList()) // => [3, 2, 1]
    println((5 downTo 1).toList()) // => [5, 4, 3, 2, 1]
    println((1..5 step 2).toList()) // => [1, 3, 5]

    // 条件式
    var num = 5
    if(num < 3) {
        println("error")
    } else if ( num < 6) {
        println("yes!")
    } else {
        println("error")
    }
    // => yes!

    var x = if (num == 5) {
        1
        2 // 最後の値が代入される
    } else {
        3
    }
    println(x) // => 2

    // when式
    x = 4
    val xStr = when(x) {
        1 -> "one"
        2, 3 -> "two or three"
        else -> {
            "unknown"
        }
    }
    println(xStr) // unknown

    // 型チェック
    val intType: Int = 123
    if(intType is Int) {
        println("this is int type")
    }

    // while
    var number = 0
    while(number < 3) {
        print(number)
        number++
    } // => 012

    // for(1)
    for(x in arrayOf(1, 2, 3)) {
        print(x)
    } // => 123

    // for(2)
    for(x in 1..3) {
        print(x)
    } // => 123

    for(x in 1..10) {
        if(x == 3) continue
        if(x >= 5) break
        print(x)
    } // => 124
}

