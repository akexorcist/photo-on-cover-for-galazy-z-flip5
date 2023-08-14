package com.akexorcist.photooncover.widget.theme

import android.app.Activity
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.glance.GlanceTheme
import androidx.glance.material3.ColorProviders
import com.akexorcist.photooncover.core.ui.theme.Pink40
import com.akexorcist.photooncover.core.ui.theme.Pink80
import com.akexorcist.photooncover.core.ui.theme.Purple40
import com.akexorcist.photooncover.core.ui.theme.Purple80
import com.akexorcist.photooncover.core.ui.theme.PurpleGrey40
import com.akexorcist.photooncover.core.ui.theme.PurpleGrey80

@Suppress("PrivatePropertyName")
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
)

@Suppress("PrivatePropertyName")
private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
)

@Composable
fun PhotoWidgetTheme(
    content: @Composable () -> Unit,
) {
    val colors = ColorProviders(
        light = LightColorScheme,
        dark = DarkColorScheme,
    )

    GlanceTheme(
        colors = colors,
        content = content
    )
}
