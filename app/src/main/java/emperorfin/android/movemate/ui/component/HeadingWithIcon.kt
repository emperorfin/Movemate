package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.OrangeFff77a26
import emperorfin.android.movemate.ui.theme.PurpleFf7161a0


@Composable
fun HeadingWithIcon(
    @StringRes label: Int,
    color: Color = PurpleFf7161a0,
    @DrawableRes trailingIcon: Int? = null
) {
    Row(
        modifier = Modifier.padding(
            start = dimensionResource(id = R.dimen.heading_with_icon_padding_start_27),
            end = dimensionResource(id = R.dimen.heading_with_icon_padding_end_12)
        ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = label),
            color = color,
            fontSize = dimensionResource(id = R.dimen.heading_with_icon_font_size_37p3).value.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Italic,
            overflow = TextOverflow.Ellipsis,
            maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_1)
        )

        trailingIcon?.let {
            Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.heading_with_icon_spacer_width_8)))

            Icon(
                modifier = Modifier
                    .height(height = dimensionResource(id = R.dimen.heading_with_icon_image_height_29))
                    .width(width = dimensionResource(id = R.dimen.heading_with_icon_image_width_58)),
                painter = painterResource(id = trailingIcon),
                contentDescription = null,
                tint = OrangeFff77a26
            )
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
private fun HeadingWithIconPreview() {
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

                HeadingWithIcon(
                    label = R.string.txt_movemate,
                    trailingIcon = R.drawable.ic_speedy_lorry
                )
            }
        }
    }
}