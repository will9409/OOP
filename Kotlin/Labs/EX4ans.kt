import java.util.*

fun main(args: Array<String>){
    var arr:Array<Int> = arrayOf(5,1,3,2,6,4,8,9)

    selectionSort(arr)

    println(Arrays.toString(arr))
}

fun selectionSort(arr:Array<Int>):Unit{
    var i : Int
    var temp : Int // 스왑을 위한 임시저장공간
    var n: Int = arr.size // 배열의 사이즈
    var minIndex : Int // 현재 가장 작은 값의 인덱스

    for (i in 0..(n-1)) { // until == n-1
        // i부터 n-1중 가장 작은 값의 index
        minIndex = selectMin(arr, i, n - 1)
        // arr[i]와 arr[minIndex]를 swap
        temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
}

fun selectMin(arr: Array<Int>, left: Int, right: Int) : Int{ // 처음 index 0을 left로 결정했다
    var i : Int
    var minValue : Int = arr[left]
    var minIndex : Int = left

    for(i in (left + 1)..right){
        if(arr[i] < minValue ){
            minValue = arr[i]
            minIndex = i
        }
    }


}