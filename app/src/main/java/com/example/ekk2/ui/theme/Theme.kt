package com.example.ekk2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme1 = darkColorScheme(
    primary = PrimaryDark,
    secondary = Secendary,
    tertiary = Tertiary,
    background = Background,
    onSurface = OnSurface,
)

private val LightColorScheme1 = lightColorScheme(
    primary = Primary,
    secondary = Secendary,
    tertiary = Tertiary,
    background = Background,
    onSurface = OnSurface,
    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun Ekk2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
    colorScheme: ColorScheme
) {
    //val colorScheme = DarkColorScheme
    val colorScheme1 = if(darkTheme) {
        DarkColorScheme1
    }else
    {
        LightColorScheme1
    }
    /*
    = when {
        //isSystemInDarkTheme() -> {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme1
        else -> LightColorScheme1
    }
*/
    MaterialTheme(
        colorScheme = if(isSystemInDarkTheme()) DarkColorScheme1 else LightColorScheme1,
        typography = Typography,
        content = content
    )
}