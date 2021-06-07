package flickr.assignment.recent

import android.net.Uri
import flickr.assignment.core.TapAction
import java.util.*

typealias PhotoId = String

data class PhotoViewModel(
    val id: PhotoId = UUID.randomUUID().toString(),
    val link: Uri,
    val title: String? = null
) {
  val tapAction: TapAction<PhotoViewModel> = TapAction.create { this }
}
