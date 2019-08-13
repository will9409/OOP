import java.util.Scanner
import java.util.*

fun main(args : Array<String>){
    val s : Scanner = Scanner(System.`in`)

    print("입력받을 갯수는 몇개인가요?")
    val n = s.nextInt()
    var a = Array(n,{n})
    print("정수를 입력하세요 : ")
    for(i : Int in 0 until n ){
        a[i] = s.nextInt()
    }

    println(Arrays.toString(insertionSort(a, n)))

}

fun insertionSort(arr : Array<Int>,  n : Int) : Array<Int> {

    var q = 0
    var arr1 = Array(n, {99})
    arr1[0] = arr[0]
    println(arr1[0])
    println(arr[0])
    //arr의 원소 인덱스 1부터 n-1까지 n-1번 동작
        //i 1번 인덱스부터 어디에 들어갈지 비교 -> 모든 arr[i]에 대해서 사이값을 찾아보아야 한다.
        for (j: Int in 1 until n) { // arr에서 하나를 정해서
            print(arr[j])
            println("차례")
            while (true) {
                    //arr1[i]보다 작은 경우
                    if (arr[j] <= arr1[q]) {
                        println("작은 경우")
                        for (l: Int in n - 2 downTo q) { //q칸부터 n칸까지 한칸씩 뒤로
                            arr1[l + 1] = arr1[l]
                        }
                        arr1[q] = arr[j]
                        println(Arrays.toString(arr1))
                        q = 0
                        break
                    }
                        else{
                            q++
                        }
                if (arr[j] > arr1[q] && arr[j] <= arr1[q + 1]) {
                    println("크고 작은 경우")
                    for (l: Int in n - 2 downTo q + 1) { //k+1칸부터 n칸까지 한칸씩 뒤로
                        arr1[l + 1] = arr1[l]
                    }
                    arr1[q + 1] = arr[j]
                    println(Arrays.toString(arr1))
                    q = 0
                    break
                }
                else
                    q++
                if (arr[j] > arr1[q] && q  <= n-1) {
                    println("큰 경우")
                        arr1[q + 1] = arr[j]
                    println(Arrays.toString(arr1))
                        q = 0
                        break
                    }
                }
            }


    return arr1

}

