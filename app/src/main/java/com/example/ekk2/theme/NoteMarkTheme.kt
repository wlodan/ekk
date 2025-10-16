package com.example.ekk2.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.ekk2.ui.theme.Ekk2Theme

val LightColorTheme = lightColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurface,
    onSurfaceVariant = OnSurfaceVariant
)

val DarkColorTheme = darkColorScheme(
    primary = PrimaryDark
)
/*
val DarkColorTheme = darkColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurface,
    onSurfaceVariant = OnSurfaceVariant
)
*/

@Composable
fun NoteMarkTheme(
    content: @Composable () -> Unit
)
{
    /*
    val theme = if(isSystemInDarkTheme()) {
        DarkColorTheme
    }
    else{
        LightColorTheme
    }
    */
    Ekk2Theme(
        colorScheme = if(isSystemInDarkTheme()) DarkColorTheme else LightColorTheme,//LightColorTheme,
        content = content
    )
}