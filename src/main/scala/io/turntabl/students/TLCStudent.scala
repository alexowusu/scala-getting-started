package io.turntabl.students

import java.time.Year

import io.turntabl.grades.Grade

class TLCStudent(
                val fName: String,
                val lName: String,
                val ID: Int,
                val role: String,
                year: Int=Year.now.getValue,
                val url: String ="https://github/turntabl"

                ){
  printf(s"creating Student $fName $lName $ID $role $url")
//   def this(fName: String, lName: String) = this(fName,lName,ID,role,"https://github/turntabl")

  override def toString = s"$fName, $lName"

  val currentYear:Int= Year.now.getValue
  def StudentsTermsService(year:Int)=currentYear-year

  def isEqual(sts: TLCStudent) = sts.StudentsTermsService(year) == StudentsTermsService(year)
   object TLCStudent{
     def apply(fName: String,lName:String): TLCStudent = new TLCStudent(fName,lName,ID,role,"https://github/turntabl")
   }
//   import io.turntabl.grades._
  def topGrade()= Grade("Scala",89)


}


