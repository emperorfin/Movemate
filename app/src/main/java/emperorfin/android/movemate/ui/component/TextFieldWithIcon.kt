package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
import emperorfin.android.movemate.ui.theme.Gray8a8a8a
import emperorfin.android.movemate.ui.theme.GrayFfb4b3b5
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFfdfdfdf
import emperorfin.android.movemate.ui.theme.WhiteFff8f8f8

@Composable
fun TextFieldWithIcon(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = dimensionResource(id = R.dimen.text_field_with_icon_padding_horizontal_8)),
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    @DrawableRes icon: Int
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        leadingIcon = {
            Row(
                modifier = Modifier.padding(
                    start = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_row_padding_start_27),
                    end = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_row_padding_end_12)
                ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .width(width = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_generic_width_31))
                        .height(height = dimensionResource(id = R.dimen.text_field_with_icon_leading_icon_generic_height_30)),
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    tint = Gray8a8a8a
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
        placeholder = {
            Text(
                text = hint,
                color = GrayFfb4b3b5,
                style = TextStyle(
                    fontSize = dimensionResource(id = R.dimen.text_field_with_icon_text_font_size_25p1).value.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        },
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = WhiteFff8f8f8,
            unfocusedContainerColor = WhiteFff8f8f8,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(size = dimensionResource(id = R.dimen.text_field_with_icon_shape_size_10)),
        textStyle = TextStyle(
            fontSize = dimensionResource(id = R.dimen.text_field_with_icon_text_font_size_25p1).value.sp,
            fontWeight = FontWeight.Medium
        ),
        modifier = modifier.height(height = dimensionResource(id = R.dimen.text_field_with_icon_height_75))
//            .requiredWidth(width = 526.dp)
//            .requiredHeight(height = 99.dp)
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp",
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun TextFieldWithIconPreview() {
    MovemateTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.White
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(70.dp))

                TextFieldWithIcon(
                    value = "",
                    onValueChange = {},
                    hint = "Sender location",
                    icon = R.drawable.ic_upload
                )
            }
        }
    }
}