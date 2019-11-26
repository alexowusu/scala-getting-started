package io.turntabl.students

class HOF {
 val word =(i: String)=> i.length


  val stringSpace =(S: String)=> S count(_ == ' ')


  val ApplyToString = (p: String, q: (String=>Int))=> q(p)



  val calculate = (r: String)=>r.toLowerCase match {
    case "add"=> (x:Int, y: Int)=> x+y
    case "sub"=> (x:Int, y: Int)=> x-y
    case "multiply"=> (x:Int, y: Int)=> x*y
  }




}
