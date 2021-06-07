package flickr.assignment

import dagger.Module
import dagger.android.ContributesAndroidInjector
import flickr.assignment.photodetails.PhotoDetailsFragment
import flickr.assignment.recent.RecentPhotosFragment

@Module
abstract class AndroidBindingModule {
  @ContributesAndroidInjector
  abstract fun getRecentPhotosFragment(): RecentPhotosFragment

  @ContributesAndroidInjector
  abstract fun getPhotoDetailsFragment(): PhotoDetailsFragment
}
