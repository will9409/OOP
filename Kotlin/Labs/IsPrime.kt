fun main(args: Array<String> ){

    val number = 2047
    var q = 1

    for(i : Int in 2..number/2){
        if(number%i == 0){
            println("this number is not Prime")
            q++
            return
        }
    }
    if (q == 1){
        println("this is Prime number")
    }
}