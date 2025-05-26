package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.BlackFf73757c
import emperorfin.android.movemate.ui.theme.BlueFf9e95b7
import emperorfin.android.movemate.ui.theme.GrayFfa6a7ae
import emperorfin.android.movemate.ui.theme.GrayFfc3c3c4
import emperorfin.android.movemate.ui.theme.GrayFfd3d1d2
import emperorfin.android.movemate.ui.theme.GrayFff3f4f4
import emperorfin.android.movemate.ui.theme.GreenFf3dbc89
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFffefefe


@Composable
fun ShipmentsListItem(
    modifier: Modifier = Modifier,
    @DrawableRes trailingImageRes: Int,
    @DrawableRes statusIconRes: Int,
    title: String,
    @StringRes status: Int,
    trackingNumber: String,
    location: String,
    currencySymbol: String = "$",
    currencyIso: String = "USD",
    amount: String,
    date: String,
    statusIconTint: Color
) {
    Box(
        modifier = modifier
            .background(color = WhiteFffefefe, RoundedCornerShape(size = dimensionResource(id = R.dimen.shipments_list_item_box_rounded_corner_shape_size_15)))
            .fillMaxWidth()
            .height(height = dimensionResource(id = R.dimen.shipments_list_item_box_height_256)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimensionResource(id = R.dimen.shipments_list_item_box_row_padding_16),
                    vertical = dimensionResource(id = R.dimen.shipments_list_item_box_row_padding_16)
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier = Modifier.weight(3f)
            ) {
                Box(
                    modifier = modifier
                        .background(color = GrayFff3f4f4, RoundedCornerShape(size = dimensionResource(id = R.dimen.shipments_list_item_box_row_column_box_rounded_corner_shape_size_20)))
                        .width(width = dimensionResource(id = R.dimen.shipments_list_item_status_box_width_179))
                        .height(height = dimensionResource(id = R.dimen.shipments_list_item_status_box_height_42)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = dimensionResource(id = R.dimen.shipments_list_item_status_box_row_padding_horizontal_8)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(width = dimensionResource(id = R.dimen.shipments_list_item_status_icon_width_23))
                                .height(height = dimensionResource(id = R.dimen.shipments_list_item_status_icon_height_18)),
                            painter = painterResource(id = statusIconRes),
                            contentDescription = null,
                            tint = statusIconTint
                        )

                        Text(
                            text = stringResource(id = status),
                            color = GreenFf3dbc89,
                            fontSize = dimensionResource(id = R.dimen.shipments_list_item_status_text_font_size_20p3).value.sp,
                            fontWeight = FontWeight.Medium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_1)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.shipments_list_item_spacer_height_11)))

                Text(
                    text = title,
                    color = BlackFf73757c,
                    fontSize = dimensionResource(id = R.dimen.shipments_list_item_title_font_size_25p3).value.sp,
                    fontWeight = FontWeight.SemiBold,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_1)
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.shipments_list_item_spacer_height_3)))

                Text(
                    text = stringResource(id = R.string.txt_your_delivery_from_your_location_is_arriving_today, trackingNumber, location),
                    color = GrayFfc3c3c4,
                    fontSize = dimensionResource(id = R.dimen.shipments_list_item_description_font_size_18p9).value.sp,
                    fontWeight = FontWeight.Medium,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_3)
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.shipments_list_item_spacer_height_20)))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "$currencySymbol$amount $currencyIso",
                        color = BlueFf9e95b7,
                        fontSize = dimensionResource(id = R.dimen.shipments_list_item_font_size_19p1).value.sp,
                        fontWeight = FontWeight.Medium,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_2)
                    )

                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.shipments_list_item_spacer_width_7)))

                    Icon(
                        modifier = Modifier.size(size = dimensionResource(id = R.dimen.shipments_list_item_icon_size_7)),
                        painter = painterResource(id = R.drawable.ic_dot),
                        contentDescription = null,
                        tint = GrayFfd3d1d2
                    )

                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.shipments_list_item_spacer_width_8)))

                    Text(
                        text = date,
                        color = GrayFfa6a7ae,
                        fontSize = dimensionResource(id = R.dimen.shipments_list_item_font_size_17p7).value.sp,
                        fontWeight = FontWeight.Medium,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_2)
                    )
                }
            }

            Box(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    modifier = Modifier
                        .width(width = dimensionResource(id = R.dimen.shipments_list_item_trailing_icon_width_119))
                        .height(height = dimensionResource(id = R.dimen.shipments_list_item_trailing_icon_height_91)),
                    painter = painterResource(id = trailingImageRes),
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

                ShipmentsListItem(
                    trailingImageRes = R.drawable.img_box_119_by_91,
                    title = stringResource(id = R.string.txt_arriving_today),
                    status = R.string.txt_in_progress,
                    trackingNumber = "#NEJ20089934122231",
                    location = "Atlanta",
                    amount = "1400",
                    date = "Sep 20,2023",
                    statusIconRes = R.drawable.ic_sync,
                    statusIconTint = GreenFf3dbc89,
                )
            }
        }
    }
}