package io.turntabl.circular

import com.sun.net.httpserver.Authenticator.Success

import scala.util.{Failure, Success}

abstract class CircuScala {

  var front: Unit = 0
  var rear: Int = 0
  var bufferLength: Int = 0
  var buffer: Array[Char]
  var maxsize: Int

  def CircuScala(maxSize: Int): Unit = {
    this.maxsize = maxsize
    front = rear = 0
    bufferLength = 0
    buffer: Array[Char]

  }

  def getSize: Int = buffer.length

  def isEmpty: Boolean = bufferLength == 0

  def isFull: Boolean = bufferLength == maxsize

  def insert(i: Char): Unit = {
    //    case Success (!isFull())=>{
    if (!isFull) {
      bufferLength += 1
      rear = (rear + 1) % maxsize
      buffer(rear) = i
      //      /lock.notifyAll()
      if (!isFull) {
        bufferLength += 1
        rear = (rear + 1) % maxsize
        buffer(front) = i

      }
    }
    else println("Error: Underflow Exception")
  }

  def clear {
    front = rear = 0
    rear = 0
    bufferLength = 0
    buffer = maxsize[Char]

  }

  def display: Unit ={
    println(s" Buffer: ")
    var i = 0
    for(i <-1 to maxsize) {
      println(buffer(i) + " ")
    }


  }


  }
