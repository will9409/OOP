import java.util.*

fun main(args: Array<String>){
    var arr1 : Array<Int> = arrayOf(1,3,5,7,9,11)
    var arr2 : Array<Int> = arrayOf(2,4,6,8,10)
    var arr3 : Array<Int>
    arr3 = concat(arr1, arr2)
    println(Arrays.toString(arr3))
}

fun concat (arr1: Array<Int>, arr2: Array<Int>) : Array<Int>{
    var arr3 = Array(arr1.size+arr2.size,{0})

    for(l : Int in 0 until arr1.size){
        arr3[l] = arr1[l]
    }
    for(i : Int in 0 until arr2.size){
        insert( arr2 ,arr3,i )
    }
    return arr3
}

fun insert(arr2: Array<Int>, arr3: Array<Int> ,i: Int) {
    for(j : Int in 0 until arr3.size){
        if(arr2[i] < arr3[j]){
           for(k : Int in arr3.size-2 downTo j){
               arr3[k+1] = arr3[k]
           }
            arr3[j] = arr2[i]
            break
        }
    }

}