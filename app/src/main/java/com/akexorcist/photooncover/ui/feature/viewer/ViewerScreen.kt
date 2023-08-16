package com.akexorcist.photooncover.ui.feature.viewer

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import coil.request.ImageRequest
import com.akexorcist.photooncover.R
import com.akexorcist.photooncover.core.utility.FileUtility
import me.saket.telephoto.zoomable.coil.ZoomableAsyncImage
import java.io.File

@Composable
fun ViewerRoute(fileName: String) {
    ViewerScreen(
        fileName = fileName,
    )
}

@Composable
private fun ViewerScreen(fileName: String) {
    val context = LocalContext.current
    val photoFile = File(FileUtility.getPhotoDirectory(context), fileName)

    ZoomableAsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(photoFile)
            .crossfade(300)
            .build(),
        contentDescription = stringResource(R.string.content_description_full_size),
    )
}
