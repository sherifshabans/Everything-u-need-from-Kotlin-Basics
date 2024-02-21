import java.util.*

/**Int*/
fun int (){

    val xInt:Int ?= null
    val xInt2 = 5
    var xInt3 :Int ?= null
    var xInt4=5

    var xInt5 = xInt4.minus(1)
    var xInt6 = xInt5.minus(8)

}


/**Float and  Double is  the same
 */

fun float(){
    val xFloat:Float ?= null
    val xFloat2 = 5.0F
    var xFloat3 :Float ?=40F
    var xFloat4 = 5.5F


}
/**
 * String
 */
fun string  ():Unit{
    val str :String ?
    val str1  ="sherif"
    var str2 :String ?=null
    var str3 ="sherif"
    val sherif   = "sherif"

    val multiString ="""
    FirstName : $sherif
    LastName : $sherif
    """
    val userAge=20
    val userInfo = "userAge = $userAge"


    val sum = " 2 + 2  ${2+2}"

    println(sherif)
    println(multiString)
    if(sherif is String){
        print(sherif.first())
    }
}
/**Char
 * */
fun char (){
    var letter ='s'
    var firstCharacterOfYourName:Char ='L'
    // Note : the name of variable is strated with lowercase letter and all names after it is upper


}


/** Boolean
 * */

fun boolean () {
    var isFollower:Boolean = false
    var isFollowing:Boolean = true

}

/**Casting*/

fun cast(){

    var num = 5
    var numToString = num.toString()

    var name: Any = "Sherif"

    var fakeName :Boolean =false
    var fakeNameText = fakeName.toString()


    var firstLetterInTheFakeName = fakeNameText.last().toInt()

}

/**NullSafety*/
// Note All data types is null safe
fun nullSaftey(){



    var name :String? = null

    println(name)

    var accountId :String? =null
    println(accountId)

    // to allow nulls
    var accountNameId : String?=null

    // we use "!!" to  say that we confirm that  is not null
    print(accountNameId?.length)




    // the same example
    if(accountNameId!=null){
        print(accountNameId.length)
    }
    // if we use "?"

    print(accountNameId?.length)
    // we say that is the variable is null set the value of the length to null


    var accountName  :String="Sherif"

    print(accountName.length)


    // we use "!!" to  say that we confirm that  is not null
    print(accountName!!.length)


    var accountName2   :String?="SHERIF"
    accountName2=null


    // the same example
    if(accountName!=null){

        print(accountNameId!!.length)
    }

    val safeCallEx=if(accountName!=null) accountName.length else 0


    // if we use "?"

    print(accountName2?.length)
    // we say that is the variable is null set the value of the length to null


    // Elvis operator  ?:

    val elvisOperator :Int = accountName2?.length  ?:15555555


}
/** Ranges*/
fun ranges(){
/*



     we can express Range by   1..n
      number..number,
       and we can put the value of range in variable
            ex : var myRange  = 1..20
            var myRange =0.rangeTo(20)
            var myRange =100.downTo(20)
            if we need to skip some Number
            we can express
            var myRange = 0..100 step(5)
            range is not for int variable only but for all data types

    */
}



/** Ranges..*/
var friendsCount=135

fun range(){




    // Conditional if
    if(friendsCount>=0 &&friendsCount<=20){
        println("lonely")
    }else if(friendsCount>=20 &&friendsCount<=100){
        println("family & friends")

    }else if(friendsCount>=100 &&friendsCount<=500){
        println("social person")

    }else if(friendsCount>=500 &&friendsCount<=5000)  {
        println("famous")
    }


//----------------------------------

    // range
    if(friendsCount in 0..20){
        println("lonely")
    }else if(friendsCount in 20..100 ){
        println("family & friends")

    }else if(friendsCount in 100..500){
        println("social person")

    }else if(friendsCount in 500..5000)  {
        println("famous")
    }


    //-------------------------
    val myRange= 0..100 step (5)
    val number = readLine()!!.toInt()

    val reader = Scanner(System.`in`)
    val num =reader.next()

    if(number in myRange){
        print("in range")
    }else {
        print(("not in range"))
    }

    /////--------------------------------




}

//--------------------------------------------------------

/** when expression*/

fun whenn (){
    // range
    if(friendsCount in 1..20){
        println("lonely")
    }else if(friendsCount in 20..100 ){
        println("family & friends")

    }else if(friendsCount in 100..500){
        println("social person")

    }else if(friendsCount in 500..5000)  {
        println("famous")
    }

    //  if we want to replace if by when
    when (friendsCount) {
        in 1..20 -> {
            println("lonely")
        }
        in 20..100 -> {
            println("family & friends")
        }
        in 100..500 -> {
            println("social person")
        }
        in 500..5000 -> {
            println("famous")
        }
        else  -> {
            println("not found")
        }
    }

    // when is similar to switch() case  in many programming language, but It contains various other features

    // when structure is write by this way  we write when and between the () we put the value that we need to compare

    val myNumber=5
    val myAns= if( myNumber in 1..10) { 4}else 5

    val myReturn=  when(myNumber){
        1-> print("one")
        // we can execute many operation in one step
        2-> {
            2
        }
        // we can put many condition in one step and the ',' is equal to "||"(or) operator
        3,33,333-> print("three")
        // we can use range
        in 4..15 step (2)  -> print("four")
        !in 4..88 step (5)  -> print(" not four")
        else -> print("five")
    }


    // we can use when and if to return value by write    val || var x = if ()...   when()






}


/** list we will use it in loops
 */
fun listt(){

    val myList :List<String> =  listOf("Ali","Ahmed","Amr")
    // list is Immutable read only
    //myList[0]="Sherif"            // this code is will give me error because list is immutable so......
    // we will convert the type of list to mutableList

    myList=listOf("aaa","Aa")


    print (myList)
    val myList2 :MutableList<String> =  mutableListOf("Ali","Ahmed","Amr")
    myList2.add(1,"sherif")
    myList2.add(2,"Mohamed")

    // note here we use val not var ...... you can ask ..how ???
    // val is don't take any different  list , but we can do operation of the list
    var myListVar = mutableListOf<Int>(1,2,3)
    myListVar = mutableListOf(5,6,3)
    // here we switch list by another list  because we use var not val







    println(myList)

}

/**Loops*/

fun loops(){

    // for
    // we use range in for loop Ex:
    for(i in 1 until 10){
        println(i)
    }
    for(i in 1.rangeTo(10)){
        println(i)
    }

    for(i in 10.downTo(1) step(2) ){
        println(i)
    }


    // when we say 1..10 we have all  numbers between 1 and 10 and 1 and 10
    // when we say 1 until 10 we have all numbers between 1 and 10  and 1 only


    val myList = listOf<String>("Ali","Ahmed", "Adel")
    for(i in  0 .. myList.size -1){
        print(myList[i])
    }
    for(element in myList){
        print(element)
    }
    for(i in 0 until myList.size){
        print(myList[i])
    }
    myList.forEach {
        print(it)

    }
    // breaking loops
    for(i in 1..5){
        for(j  in 1 until  11){
            if(i==3)break
            print("${i*j}\t")
        }
        //if(i==4)break
        print("\n")
    }

    // we can do something else   by call every loop by loop1..2.3.4.5@ or for or ........

    loop1@for(i in 1..5){
        for2@for(j  in 1 until  11){
            if(i==3)break@loop1
            print("${i*j}\t")
        }
        //if(i==4)break
        print("\n")
    }
    //-------------
    // while

    var myNumber=100
    while (myNumber>2){
        println(myNumber)
        myNumber/=2

    }
    do {
        println(myNumber)
        myNumber/=2

    }while (myNumber>2)

}

fun  main(){

}

