package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme


@Composable
fun RoundedOutlinedTextFieldWithIcons(
    modifier: Modifier = Modifier,
    @StringRes labelRes: Int? = null,
    value: String,
    onValueChanged: (String) -> Unit,
    @DrawableRes leadingIconRes: Int? = null,
    @DrawableRes trailingIconRes: Int? = null,
    leadingIconTint: Color = LocalContentColor.current,
    readOnly: Boolean = false,
    keyboardType: KeyboardType = KeyboardType.Text,
    focusedBorderColor: Color = Color.Unspecified,
    unfocusedBorderColor: Color = Color.Unspecified,
    focusedContainerColor: Color = Color.Unspecified,
    unfocusedContainerColor: Color = Color.Unspecified,
    focusedLabelColor: Color = Color.Unspecified,
    unfocusedLabelColor: Color = Color.Unspecified,
) {

    var label = ""

    if (labelRes != null) {
        label = stringResource(id = labelRes)
    }

    val labelComponent: @Composable () -> Unit = {
        Text(text = label)
    }

    var leadingIcon: (@Composable () -> Unit)? = null
    var trailingIcon: (@Composable () -> Unit)? = null

    if (leadingIconRes != null)
        leadingIcon = {
            Icon(
                modifier = Modifier.size(size = dimensionResource(id = R.dimen.rounded_outlined_text_field_with_icons_leading_icon_size_16)),
                painter = painterResource(id = leadingIconRes),
                contentDescription = null,
                tint = leadingIconTint
            )
        }

    if (trailingIconRes != null)
        trailingIcon = {
            Image(
                modifier = Modifier.size(size = dimensionResource(id = R.dimen.rounded_outlined_text_field_with_icons_trailing_icon_size_40)),
                painter = painterResource(id = trailingIconRes),
                contentDescription = null,
            )
        }

    Column {
        OutlinedTextField(
            modifier = modifier.fillMaxWidth(),
            label = labelComponent,
            value = value,
            readOnly = readOnly,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            onValueChange = {
                onValueChanged(it)
            },
            shape = RoundedCornerShape(size = dimensionResource(id = R.dimen.rounded_outlined_text_field_with_icons_rounded_corner_shape_size_25)),
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = focusedBorderColor,
                unfocusedBorderColor = unfocusedBorderColor,
                focusedContainerColor = focusedContainerColor,
                unfocusedContainerColor = unfocusedContainerColor,
                focusedLabelColor = focusedLabelColor,
                unfocusedLabelColor = unfocusedLabelColor
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RoundedOutlinedTextFieldWithIconsPreview() {
    MovemateTheme {
        RoundedOutlinedTextFieldWithIcons(
            labelRes = R.string.txt_enter_the_receipt_number,
            value = "",
            onValueChanged = { },
            leadingIconRes = R.drawable.ic_search,
            trailingIconRes = R.drawable.ic_scan,
        )
    }
}