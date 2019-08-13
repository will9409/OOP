import java.util.Scanner

fun main(args : Array<String>){
    val s : Scanner = Scanner(System.`in`)
    var temp = 0

    print("입력받을 갯수는 몇개인가요?")
    val n = s.nextInt()
    var a = Array(n,{n})
    print("정수를 입력하세요 : ")
    for(i : Int in 0 until n ){
        a[i] = s.nextInt()
    }

    for(j : Int in 0 until n){
        for(k : Int in 0 until n-1){
            if(a[k] > a[k+1]) {
                temp = a[k + 1]
                a[k + 1] = a[k]
                a[k] = temp
            }
        }
        println(Array.toString(a))
    }

    for(l : Int in 0 until n){
        print(a[l])
        print(" ")
    }
}

/*
import java.util.*

fun main (args: Array<String>){
    var arr: Array<Int> = arrayOf(5, 1, 3, 2, 6, 4, 8, 9)

    bubbleSort(arr)

    println(Arrays.toString(arr))
}

fun bubbleSort(arr: Array<Int>): Unit {
    var i : Int // 바깥쪽 반복 제어 변수
    var j : Int // 안쪽 반복 제어 변수
    var temp : Int // swap용 변수
    var n : Int = arr.size

    i = 0
    while( i < n-1 ){
        j = n - 2
        while (j >= i ) {
            if( arr[j ] > arr[j+1]){ // swap
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                }
            j--
        }
        println(Arrays.toString(arr))
        i++
    }
}
 */