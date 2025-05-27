package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.BlackFf8a8b91
import emperorfin.android.movemate.ui.theme.BlackFfcacaca
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFffefefe


@Composable
fun VehiclesListItem(
    modifier: Modifier = Modifier,
    vehicleType: String,
    coverage: String,
    @DrawableRes image: Int
) {
    Box(
        modifier = modifier
            .background(color = WhiteFffefefe, RoundedCornerShape(size = dimensionResource(id = R.dimen.shipments_list_item_box_rounded_corner_shape_size_15)))
            .width(width = dimensionResource(id = R.dimen.vehicles_list_item_width_235))
            .height(height = dimensionResource(id = R.dimen.vehicles_list_item_height_288)),
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            modifier = Modifier.padding(
                top = dimensionResource(id = R.dimen.vehicles_list_item_padding_top_26),
                start = dimensionResource(id = R.dimen.vehicles_list_item_padding_start_24),
                bottom = dimensionResource(id = R.dimen.vehicles_list_item_padding_bottom_4)
            )
        ) {
            Text(
                text = vehicleType,
                color = BlackFf8a8b91,
                fontSize = dimensionResource(id = R.dimen.vehicles_list_item_text_font_size_23p3).value.sp,
                fontWeight = FontWeight.Medium,
                overflow = TextOverflow.Ellipsis,
                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.vehicles_list_item_space_height_6)))

            Text(
                text = coverage,
                color = BlackFfcacaca,
                fontSize = dimensionResource(id = R.dimen.vehicles_list_item_text_font_size_18p4).value.sp,
                fontWeight = FontWeight.Medium,
                overflow = TextOverflow.Ellipsis,
                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.vehicles_list_item_space_height_7)))

            Box(
                modifier = Modifier.align(alignment = Alignment.End),
                contentAlignment = Alignment.CenterEnd
            ) {
                Image(
                    modifier = Modifier
                        .width(width = dimensionResource(id = R.dimen.vehicles_list_item_image_width_210))
                        .height(height = dimensionResource(id = R.dimen.vehicles_list_item_image_height_210)),
                    painter = painterResource(id = image),
                    contentDescription = null,
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
private fun ShipmentsListItemPreview() {
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

                VehiclesListItem(
                    vehicleType = "Cargo freight",
                    coverage = "Reliable",
                    image = R.drawable.img_truck
                )
            }
        }
    }
}