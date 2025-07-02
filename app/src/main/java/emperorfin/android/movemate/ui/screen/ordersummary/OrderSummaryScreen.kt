package emperorfin.android.movemate.ui.screen.ordersummary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.component.BigButton
import emperorfin.android.movemate.ui.component.HeadingWithIcon
import emperorfin.android.movemate.ui.component.TextTile
import emperorfin.android.movemate.ui.theme.BlackFf70737a
import emperorfin.android.movemate.ui.theme.GrayFfbcbcbc
import emperorfin.android.movemate.ui.theme.GreenFf8cd2b3
import emperorfin.android.movemate.ui.theme.MovemateTheme


@Composable
fun OrderSummaryScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = dimensionResource(id = R.dimen.order_summary_screen_padding_horizontal_16))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.order_summary_screen_spacer_height_101)))

            HeadingWithIcon(
                label = R.string.txt_movemate,
                trailingIcon = R.drawable.ic_speedy_lorry
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.order_summary_screen_spacer_height_80)))

            Image(
                modifier = Modifier
                    .width(width = dimensionResource(id = R.dimen.order_summary_screen_image_width_283))
                    .height(height = dimensionResource(id = R.dimen.order_summary_screen_image_height_190))
                    .padding(start = dimensionResource(id = R.dimen.order_summary_screen_padding_start_60)),
                painter = painterResource(id = R.drawable.img_big_box),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.order_summary_screen_spacer_height_40)))

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
                descriptionHorizontalPadding = dimensionResource(id = R.dimen.order_summary_screen_text_tile_description_horizontal_padding_45),
                titleFontSize = dimensionResource(id = R.dimen.order_summary_screen_text_tile_title_font_size_27p5).value.sp,
                subTitleFontSize = dimensionResource(id = R.dimen.order_summary_screen_text_tile_sub_title_font_size_26p8).value.sp,
                descriptionFontSize = dimensionResource(id = R.dimen.order_summary_screen_text_tile_description_font_size_12p8).value.sp,
                titleFontWeight = FontWeight.SemiBold,
                subTitleFontWeight = FontWeight.SemiBold,
                descriptionFontWeight = FontWeight.Medium,
                spaceBelowTitle = dimensionResource(id = R.dimen.order_summary_screen_text_tile_space_below_title_12),
                spaceBelowSubTitle = dimensionResource(id = R.dimen.order_summary_screen_text_tile_space_below_subtitle_7)
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.order_summary_screen_spacer_height_50)))

            BigButton(
                modifier = Modifier.fillMaxWidth(),
                textRes = R.string.btn_back_to_home,
                onClick = {}
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
private fun OrderSummaryScreenPreview() {
    MovemateTheme {
        OrderSummaryScreen()
    }
}