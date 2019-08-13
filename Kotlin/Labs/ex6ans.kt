fun main(args : Array<String>){
    var arr : Array<Int> = arrayOf(20,42,55,62,78,92,112,132,140,145,150,170)
    var n : Int = arr.size

    var index: Int = binarySearch(arr, 0, n-1, 112)

    if(index <0)
        println("not Found")
    else
        println("arr[${index} = ${arr[index]}")
}

fun binarySearch(arr: Array<Int>, s : Int, e : Int , key : Int) : Int{
    if( s >= e ) { // degenerate case : 우리가 평소에 풀지 않는 방식, 나눌 수 없는 상태
        /*if( arr[s] == key)
            return s
        else
            return -1
           ==  */return if( arr[s] == key) s else -1
        val mid = (s+e)/2

        if(key == arr[mid])
            return mid
        if(key < arr[mid])
            return binarySearch(arr, s, mid-1, key) // mid의 왼쪽
        else
            return binarySearch(arr,mid+1, e, key) // mid의 오른쪽
    }
}