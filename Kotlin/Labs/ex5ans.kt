import java.util.*

fun main(args : Array<String>){
    var arr: Array<Int> = arrayOf(5,1,3,2,6,4,8,9)

    insertionSort(arr)

    println(Arrays.toString(arr))


}

fun insertionSort(arr: Array<Int>){
    var i : Int
    var n : Int = arr.size

    for(i in 1 until n)
        insert(arr,0,i-1,arr[i])
}

fun insert(arr: Array<Int>, left: Int, right: Int, curr: Int): Unit{
    var i : Int
    var j : Int

    for ( i in left..right){
        if(arr[i] > curr){
            for(j in right downTo i){
                arr[j+1] = arr[j]
            }

            arr[i] = curr
            break
        }
    }

}