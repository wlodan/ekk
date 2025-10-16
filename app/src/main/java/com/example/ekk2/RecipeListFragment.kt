package com.example.ekk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.ekk2.theme.NoteMarkTheme
import javax.security.auth.callback.PasswordCallback

class RecipeListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmetn_recipe_list, container, false)
        val composeView = view.findViewById<ComposeView>(R.id.compose_view)
        //val composeView2 = view.findViewById<ComposeView>(R.id.compose_view2)

        composeView.apply {
            // Dispose of the Composition when the view's LifecycleOwner
            // is destroyed
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MessageCard("Daniel")
            }
        }
        return view
    }

    @Composable
    fun MessageCard(name: String) {
        NoteMarkTheme {
            var showContent by remember() { mutableStateOf(false) }
            Column {
                Row(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxHeight(0.05f)

                ) {
                }
                Row(
                    modifier = Modifier
                    .fillMaxHeight(0.9f)) {

                    Column(
                               // modifier = Modifier.fillMaxWidth(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, end = 20.dp),
                            text = "Login",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                lineHeight = 24.sp,
                                fontSize = 25.sp,

                                )
                        )
                        TextField(
                            state = rememberTextFieldState(initialText = ""),
                            label = { Text("") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)


                        )

                            Button(
                                //modifier = Modifier
                                    //.weight(1f),
                                onClick = { showContent = !showContent }) {
                                Text(
                                    "Click me"
                                )
                            }

                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard()
    {
MaterialTheme {
    Surface {
        MessageCard(
            "gfgf"
        )
    }
}
    }
}