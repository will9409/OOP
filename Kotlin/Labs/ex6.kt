fun main(args: Array<String>){
    var a = arrayOf(1,2,3,4,5,6,7,8,9,10,11,13)
    var index = a.size/2
    binarySearch(a,10,index)

}

fun binarySearch(arr : Array<Int>, n : Int, i : Int) : Unit{
    if( (i >= 0 || i <= arr.size-1) && arr[i] == n){
        return println("Exist")
    }
    else if( (i > 0 && i <= arr.size-1) && arr[i] > n ) {
        binarySearch(arr, 10, i - 1)
    }
    else if( (i > 0 && i <= arr.size-1) && arr[i] < n ) {
        binarySearch(arr, n, i + 1)
    }
    else if((i == 0 ||  i == arr.size-1) && arr[i] != n){
        return println("Not Exist")
    }
}