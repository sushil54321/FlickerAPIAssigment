package flickr.assignment

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import flickr.assignment.core.SchedulerFactoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AndroidSupportInjectionModule::class,
    AndroidBindingModule::class,
    AppModule::class,
    PhotoRepositoryModule::class,
    SchedulerFactoryModule::class
))
interface AppComponent : AndroidInjector<App> {
  @Component.Builder
  abstract class Builder : AndroidInjector.Builder<App>()
}
