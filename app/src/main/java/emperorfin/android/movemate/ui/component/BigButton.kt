package emperorfin.android.movemate.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.Orange
import emperorfin.android.movemate.ui.theme.OrangeLight
import emperorfin.android.movemate.ui.theme.White


@Composable
fun BigButton(
    modifier: Modifier = Modifier,
    @StringRes textRes: Int,
    onClick: () -> Unit = {},
    textColor: Color = White,
    backgroundColor: Color = Orange,
    borderStrokeColor: Color = OrangeLight,
) {
    val text: String = stringResource(id = textRes)
    Button(
        onClick = { onClick() },
        modifier = modifier
            .background(color = backgroundColor, RoundedCornerShape(size = dimensionResource(id = R.dimen.big_button_round_corner_shape_size_25)))
            .height(height = dimensionResource(id = R.dimen.big_button_height_57)),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = textColor
        ),
        border = BorderStroke(width = dimensionResource(id = R.dimen.big_button_border_stroke_width_1), borderStrokeColor),
    ) {
        val rowHorizontalArrangement: Arrangement.Horizontal = Arrangement.Center

        Row(
//            modifier = Modifier.fillMaxWidth(),
            modifier = modifier,
            horizontalArrangement = rowHorizontalArrangement,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val textModifier: Modifier = Modifier.padding(start = dimensionResource(id = R.dimen.big_button_text_padding_start_10))
            val _textColor: Color = textColor
            val textFontSize: TextUnit = dimensionResource(id = R.dimen.big_button_text_font_size_18).value.sp
            val textFontWeight: FontWeight = FontWeight.Normal
            val textOverflow: TextOverflow = TextOverflow.Ellipsis

            Text(
                modifier = textModifier,
                text = text,
                color = _textColor,
                fontSize = textFontSize,
                fontWeight = textFontWeight,
                overflow = textOverflow,
            )
        }
    }
}

@Preview
@Composable
fun BigButtonPreview() {
    MovemateTheme {
        BigButton(
            textRes = R.string.btn_back_to_home,
            onClick = {}
        )
    }
}