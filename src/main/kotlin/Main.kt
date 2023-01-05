fun main() {
    print(solution(103))
}

fun solution(a0: Int): Int {
    val sequenceList = mutableListOf<Int>()
    var number = a0
    sequenceList.add(number)
    var count = 1
    var tempString = number.toString()
    while (number > 1) {
        val sum = tempString.toCharArray().sumOf { it.digitToInt() * it.digitToInt() }
        if (sequenceList.contains(sum))
            return count + 1
        else {
            sequenceList.add(sum)
            count++
        }
        tempString = sum.toString()
        number = sum
    }
    return count + 1
}
