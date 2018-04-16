package com.nkouevda.future

import com.twitter.app.App
import com.twitter.util.{Await, Future, FuturePool}
import java.util.concurrent.Executors

object Main extends App {

  val threads = flag("threads", 4, "Number of threads to use")
  val items = flag("items", 4, "Number of items to process")

  def main(): Unit = {
    val executorService = Executors.newFixedThreadPool(threads())
    val futurePool = FuturePool.interruptible(executorService)

    val futures = (0 until items()).map { i =>
      log(s"scheduling $i")
      futurePool {
        log("sleeping")
        Thread.sleep(1000)
        log("finished sleeping")
      }
    }

    log("awaiting")
    Await.result(Future.collect(futures))
    log("finished awaiting")

    executorService.shutdown
  }

  def log(message: String): Unit = {
    val time = System.currentTimeMillis
    val threadName = Thread.currentThread.getName
    println(s"$time: $threadName: $message")
  }
}
