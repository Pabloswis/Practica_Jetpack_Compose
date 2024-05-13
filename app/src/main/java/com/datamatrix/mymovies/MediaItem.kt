package com.datamatrix.mymovies

import com.datamatrix.mymovies.MediaItem.*
import com.datamatrix.mymovies.MediaItem.Type.PHOTO

data class MediaItem(
    val id: String,
    val title: String,
    val thumb: String,
    val type: Type
) {
    enum class Type { PHOTO, VIDEO }
}

fun getMedia() = (1..10).map {
    MediaItem(
        id = it.toString(),
        title = "Title $it",
        thumb = "https://tse3.mm.bing.net/th?id=OIP.QDpVRRwPwd4wimMJ1EGTMQHaJQ&pid=Api&P=0&h=180",
        type = if (it % 3 == 0) Type.VIDEO else PHOTO
    )
}
