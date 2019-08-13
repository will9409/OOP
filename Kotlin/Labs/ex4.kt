import java.util.Scanner
import java.util.*

fun main(args : Array<String>){
    val s : Scanner = Scanner(System.`in`)
    var temp = 0
    var temp2 = 0


    print("입력받을 갯수는 몇개인가요?")
    val n = s.nextInt()
    var a = Array(n,{n})
    print("정수를 입력하세요 : ")
    for(i : Int in 0 until n ){
        a[i] = s.nextInt()
    }
    for(i : Int in 0 until n){
        for (j: Int in i until n){
                if (a[i] > a[j] && a[i] != a[j]){
                        temp = j
                    break
                    }
        }
        if(temp != 0) {
            temp2 = a[i]
            a[i] = a[temp]
            a[temp] = temp2
        }
        println(Arrays.toString(a))
        temp2 = 0
        temp = 0
    }

    for(l : Int in 0 until n){
        print(a[l])
        print(" ")
    }
}

