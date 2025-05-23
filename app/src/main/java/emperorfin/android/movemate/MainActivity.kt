package emperorfin.android.movemate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import emperorfin.android.movemate.ui.component.DropdownWithIcon
import emperorfin.android.movemate.ui.component.TextFieldWithIcon
import emperorfin.android.movemate.ui.theme.MovemateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovemateTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color.Gray) { innerPadding ->
                    Column {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )

                        TextFieldWithIcon(
//                            value = "2972 Westheimer",
                            value = "",
                            onValueChange = {},
                            hint = "Sender location",
                            icon = R.drawable.ic_upload
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        DropdownWithIcon(
                            icon = R.drawable.ic_box,
                            menuItems = listOf("Box", "Box2", "Box3"),
                            onItemClick = {}
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovemateTheme {
        Greeting("Android")
    }
}