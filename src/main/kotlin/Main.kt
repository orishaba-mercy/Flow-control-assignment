fun main() {
    println( numbers())
     var r=  listnames(arrayOf("faith","dorothy","absolom","hope","glorious","orishaba"))
    println(r)
    multiply()
    partyDrinks(10)



}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers(){
    for (num in 1..100){
        if (num %2 !=0){
            println(num)
        }
    }
}



//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun listnames(names:Array<String>):Int {
    var add=0
    for (x in names){
        if (x.length>5){
            add++
                    }

    }

    return add

}



//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun partyDrinks(age:Int){
    if (age in 0..5){
        println("milk")
    }
    else if (age in 7..14){
        println("Fanta orange")
    }
    else println("cocacola")
}

//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun multiply() {
    for (num in 1..100) {
        when {
            num % 3 == 0 && num % 5 == 0 -> println("FizzBuzz")
                num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
            else -> println("num")

        }
    }
}
