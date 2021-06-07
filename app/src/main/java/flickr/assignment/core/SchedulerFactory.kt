package flickr.assignment.core

import io.reactivex.Scheduler

interface SchedulerFactory {
  val mainScheduler: Scheduler
  val ioScheduler: Scheduler
}
