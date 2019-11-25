package io.turntabl.scalagettingstarted

object MyApp extends App {
    val firstName = "alex"
    val HomeTown = "Effiduase"
    print (s"$firstName   comes from  $HomeTown \n")

//    print("Hello, World!")
    val i ="Hello"
    print(i*3)
 def threeTimes(greetings: String)= greetings*3
    threeTimes("GoodDay")


    //EvenNumbers
    def Even(num: Int)=if(num %2==0) true else false

//    OddNumbers
    def Odd(num: Int)= if(num %2==0)true else false

//    EvenNumbers2
    def Even2(num:Int)= num %2 match {
        case 0 =>true
        case 1 => false
    }
//    ToLower
    def toLower(word: String*)=
        word map(_.toLowerCase)
     toLower("KOFI","AMA")
//     isWeekDay
    def isWeekday(day: String)= day match {
        case "Saturday" | "Sunday" => true
        case _ => false
    }
    def areWeekendDays(days: String*)= days map(w =>isWeekday(w))

    areWeekendDays("monday","Sunday","saturday","Saturday") foreach println

    def number(a: Int, b:String)= b*a
    number(5,"sam ") foreach(print)

   def nTimes(c: Int,d:String)=
    for(f<-1 to c) print("$d ")
nTimes(8,"Dawud")




}
