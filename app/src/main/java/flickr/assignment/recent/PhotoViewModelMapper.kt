package flickr.assignment.recent

import android.net.Uri
import flickr.assignment.Photo
import javax.inject.Inject

open class PhotoViewModelMapper @Inject internal constructor() {
  open operator fun invoke(photo: Photo) = PhotoViewModel(
      id = photo.id,
      link = Uri.parse(photo.link),
      title = photo.title
  )
}
