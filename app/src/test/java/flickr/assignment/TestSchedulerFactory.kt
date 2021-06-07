package flickr.assignment

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import flickr.assignment.core.SchedulerFactory

class TestSchedulerFactory : SchedulerFactory {
  override val mainScheduler: Scheduler
    get() = Schedulers.trampoline()

  override val ioScheduler: Scheduler
    get() = Schedulers.trampoline()
}
