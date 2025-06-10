package emperorfin.android.movemate.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.BlackFf70737a
import emperorfin.android.movemate.ui.theme.GrayFfbcbcbc
import emperorfin.android.movemate.ui.theme.GreenFf8cd2b3
import emperorfin.android.movemate.ui.theme.MovemateTheme
import kotlin.concurrent.thread


@Composable
fun TextTile(
    modifier: Modifier = Modifier,
    @StringRes title: Int? = null,
    @StringRes subTitle: Int? = null,
    @StringRes description: Int? = null,
    titleHorizontalAlignment: Alignment.Horizontal = Alignment.Start,
    subTitleHorizontalAlignment: Alignment.Horizontal = Alignment.Start,
    descriptionHorizontalAlignment: Alignment.Horizontal = Alignment.Start,
    descriptionTextAlignment: TextAlign = TextAlign.Unspecified,
    descriptionHorizontalPadding: Dp = dimensionResource(id = R.dimen.text_title_padding_horizontal_8),
    titleColor: Color = Color.Black,
    subTitleColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    titleFontSize: TextUnit = dimensionResource(id = R.dimen.text_title_font_size_27p5).value.sp,
    subTitleFontSize: TextUnit = dimensionResource(id = R.dimen.text_title_font_size_26p8).value.sp,
    descriptionFontSize: TextUnit = dimensionResource(id = R.dimen.text_title_font_size_12p8).value.sp,
    titleFontWeight: FontWeight? = null,
    subTitleFontWeight: FontWeight? = null,
    descriptionFontWeight: FontWeight? = null,
    spaceBelowTitle: Dp = dimensionResource(id = R.dimen.text_title_space_height_0),
    spaceBelowSubTitle: Dp = dimensionResource(id = R.dimen.text_title_space_height_0),
) {
    Column(
        modifier = modifier
            .padding(all = dimensionResource(id = R.dimen.text_title_padding_all_8))
            .fillMaxWidth(),

    ) {
        if (title == null && subTitle == null && description == null) {
            thread(name = "TextTileThread") {
                throw IllegalArgumentException("\'title\', \'subTitle\' and \'description\' parameters must not be null at the same time. At least one must be non-null.")
            }
        }

        title?.let {
            Text(
                modifier = Modifier.align(alignment = titleHorizontalAlignment),
                text = stringResource(id = title),
                color = titleColor,
                fontSize = titleFontSize,
                fontWeight = titleFontWeight,
                overflow = TextOverflow.Ellipsis,
                maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_1)
            )

            Spacer(modifier = Modifier.height(height = spaceBelowTitle))
        }

        subTitle?.let {
            Text(
                modifier = Modifier.align(alignment = subTitleHorizontalAlignment),
                text = stringResource(id = subTitle),
                color = subTitleColor,
                fontSize = subTitleFontSize,
                fontWeight = subTitleFontWeight,
                overflow = TextOverflow.Ellipsis,
                maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_2)
            )

            Spacer(modifier = Modifier.height(height = spaceBelowSubTitle))
        }

        description?.let {
            Text(
                modifier = Modifier
                    .align(alignment = descriptionHorizontalAlignment)
                    .padding(horizontal = descriptionHorizontalPadding),
                text = stringResource(id = description),
                color = descriptionColor,
                fontSize = descriptionFontSize,
                fontWeight = descriptionFontWeight,
                overflow = TextOverflow.Ellipsis,
                maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_3),
                style = TextStyle(
                    textAlign = descriptionTextAlignment
                )
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
private fun TextTilePreview() {
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

                TextTile(
                    title = R.string.txt_total_estimated_amount,
                    subTitle = R.string.txt_145_usd,
                    description = R.string.txt_this_amount_is_estimated_this_will_vary_if,
                    titleColor = BlackFf70737a,
                    subTitleColor = GreenFf8cd2b3,
                    descriptionColor = GrayFfbcbcbc,
                    titleHorizontalAlignment = Alignment.CenterHorizontally,
                    subTitleHorizontalAlignment = Alignment.CenterHorizontally,
                    descriptionHorizontalAlignment = Alignment.CenterHorizontally,
                    descriptionTextAlignment = TextAlign.Center,
                    descriptionHorizontalPadding = 45.dp,
                    titleFontSize = 27.5.sp,
                    subTitleFontSize = 26.8.sp,
                    descriptionFontSize = 12.8.sp,
                    titleFontWeight = FontWeight.SemiBold,
                    subTitleFontWeight = FontWeight.SemiBold,
                    descriptionFontWeight = FontWeight.Medium,
                    spaceBelowTitle = 12.dp,
                    spaceBelowSubTitle = 7.dp
                )
            }
        }
    }
}