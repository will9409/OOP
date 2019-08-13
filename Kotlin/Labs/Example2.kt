import java.util.Scanner

fun main(args : Array<String>){
    print("n 입력: ")

    val s : Scanner = Scanner(System.`in`)
    val n = s.nextInt()
    var q = n/2
    if(n%2 == 1) {
        for (i: Int in 1..n step 2){
           for(k : Int in 1..q){
               print(" ")
           }
            for(j:Int in 1..i){
                if(i == j){
                    println("*")
                    q--
                }
                else
                print("*")
            }
        }
    }
    if(n%2 == 0) {
        for (i: Int in 2..n step 2){
            for(k : Int in 1..q){
                print(" ")
            }
            for(j:Int in 1..i){
                if(i == j){
                    println("*")
                    q--
                }
                else
                    print("*")
            }
        }
    }
}

/*
fun draw_triangle ( num: Int): Unit{
    val steps: Int = if(num%2 == 0) num/2 else num/2 + 1 // 줄 수
    val s : Int // 각 줄을 시작하는 위치
    val t : Int // 각 줄에 찍히는 *의 수
    val tri : String // 각 줄에 찍히는 문자열

    //전체 줄 수 만큼 반복
    for(k in 1..steps){
        //tri를 초기화
        tri = ""
        //공백찍는부분
     // 시작하는 위치 : s
        s = steps - k
        for( i in 1..s)
            tri += " "
            //별찍는부분
        // *의 수 : t
        t = if (num %2 == 0) 2 else 1 // 초기값 : num이 even이면 0개, odd면 1개
        t += 2*(k-1) // 줄이 증가할 때마다 2개씩 증가

        for( i in s+1..)
            tri += "*"

        println(tri)
}

 */