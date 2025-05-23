package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.White
import emperorfin.android.movemate.ui.theme.WhiteFfdfdfdf


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownWithIcon(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = dimensionResource(id = R.dimen.text_field_with_icon_padding_horizontal_8)),
    @DrawableRes icon: Int,
    menuItems: List<String>,
    onItemClick: (String) -> Unit
) {
    val options = menuItems
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(options[0]) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            readOnly = true,
            value = selectedOption,
            onValueChange = {},
            leadingIcon = {
                Row(
                    modifier = Modifier.padding(
                        start = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_row_padding_start_27),
                        end = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_row_padding_end_12)
                    ),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .width(width = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_generic_width_31))
                            .height(height = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_generic_height_30)),
                        painter = painterResource(id = icon),
                        contentDescription = null,
                    )

                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_spacer_width_10)))

                    Icon(
                        modifier = Modifier
                            .height(height = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_separator_height_44))
                            .width(width = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_separator_width_4)),
                        painter = painterResource(id = R.drawable.ic_separator),
                        contentDescription = null,
                        tint = WhiteFfdfdfdf
                    )

                }
            },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
            },
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = White,
                unfocusedContainerColor = White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(size = dimensionResource(id = R.dimen.text_field_with_icon_shape_size_10)),
            textStyle = TextStyle(
                fontSize = dimensionResource(id = R.dimen.text_field_with_icon_text_font_size_25p1).value.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = modifier
                .menuAnchor()
                .height(height = dimensionResource(id = R.dimen.text_field_with_icon_height_75))
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        selectedOption = option
                        expanded = false

                        onItemClick(selectedOption)
                    }
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp",
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun DropdownWithIconPreview() {
    MovemateTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.Gray
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(70.dp))

                DropdownWithIcon(
                    icon = R.drawable.ic_box,
                    menuItems = listOf("Box", "Box2", "Box3"),
                    onItemClick = {}
                )
            }
        }
    }
}