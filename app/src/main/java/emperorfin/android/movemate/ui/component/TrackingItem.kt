package emperorfin.android.movemate.ui.component

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
import androidx.compose.material3.TextButton
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
import emperorfin.android.movemate.ui.theme.BlackFf74777e
import emperorfin.android.movemate.ui.theme.BlackFf94969a
import emperorfin.android.movemate.ui.theme.GrayFfc4c4c4
import emperorfin.android.movemate.ui.theme.GreenFf3dbc89
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.OrangeFff77a26
import emperorfin.android.movemate.ui.theme.WhiteFfcccccc
import emperorfin.android.movemate.ui.theme.WhiteFff5f5f5
import emperorfin.android.movemate.ui.theme.WhiteFffefefe


@Composable
fun TrackingItem(
    modifier: Modifier = Modifier,
    shipmentNumber: String,
    senderLocation: String,
    receiverLocation: String,
    time: String,
    @StringRes status: Int,
) {
    Box(
        modifier = modifier
            .background(color = WhiteFffefefe, RoundedCornerShape(size = dimensionResource(id = R.dimen.shipments_list_item_box_rounded_corner_shape_size_15)))
            .fillMaxWidth()
            .height(height = dimensionResource(id = R.dimen.tracking_item_height_400)),
        contentAlignment = Alignment.TopStart
    ) {
        Column {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = dimensionResource(id = R.dimen.tracking_item_padding_horizontal_16),
                        vertical = dimensionResource(id = R.dimen.tracking_item_padding_vertical_16)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Row {
                    Column(
                        modifier = Modifier.weight(4.5f)
                    ) {
                        Text(
                            text = stringResource(id = R.string.txt_shipment_number),
                            color = GrayFfc4c4c4,
                            fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_13p8).value.sp,
                            fontWeight = FontWeight.Medium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                        )

                        Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_12)))

                        Text(
                            text = shipmentNumber,
                            color = BlackFf74777e,
                            fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_17p6).value.sp,
                            fontWeight = FontWeight.SemiBold,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                        )
                    }

                    Box(
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            modifier = Modifier
                                .width(width = dimensionResource(id = R.dimen.tracking_item_image_width_60))
                                .height(height = dimensionResource(id = R.dimen.tracking_item_image_height_64)),
                            painter = painterResource(id = R.drawable.ic_truck),
                            contentDescription = null,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_23)))

                Icon(
                    modifier = Modifier
                        .height(height = dimensionResource(id = R.dimen.tracking_item_image_height_3))
                        .width(width = dimensionResource(id = R.dimen.tracking_item_image_width_524)),
                    painter = painterResource(id = R.drawable.ic_separator_horizontal),
                    contentDescription = null,
                    tint = WhiteFff5f5f5
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_20)))

                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = dimensionResource(id = R.dimen.tracking_item_padding_end_8)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(width = dimensionResource(id = R.dimen.tracking_item_image_width_54))
                                    .height(height = dimensionResource(id = R.dimen.tracking_item_image_height_54)),
                                painter = painterResource(id = R.drawable.ic_upload_colored),
                                contentDescription = null,
                            )
                        }

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.tracking_item_spacer_width_13)))

                        Column(
                            modifier = Modifier.weight(2f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.txt_sender),
                                color = WhiteFfcccccc,
                                fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_14p5).value.sp,
                                fontWeight = FontWeight.Medium,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                            )

                            Text(
                                text = senderLocation,
                                color = BlackFf94969a,
                                fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_16p8).value.sp,
                                fontWeight = FontWeight.Medium,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                            )
                        }
                    }

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Box(
                            modifier = Modifier.align(alignment = Alignment.End).padding(end = dimensionResource(id = R.dimen.tracking_item_padding_end_12)),
                        ) {
                            Column {
                                Text(
                                    text = stringResource(id = R.string.txt_time),
                                    color = WhiteFfcccccc,
                                    fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_14p5).value.sp,
                                    fontWeight = FontWeight.Medium,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                                )

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Icon(
                                        modifier = Modifier.size(size = dimensionResource(id = R.dimen.tracking_item_icon_size_8)),
                                        painter = painterResource(id = R.drawable.ic_dot),
                                        contentDescription = null,
                                        tint = GreenFf3dbc89
                                    )

                                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.tracking_item_spacer_width_8)))

                                    Text(
                                        text = time,
                                        color = BlackFf94969a,
                                        fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_15p8).value.sp,
                                        fontWeight = FontWeight.Medium,
                                        overflow = TextOverflow.Ellipsis,
                                        maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_50)))

                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = dimensionResource(id = R.dimen.tracking_item_padding_end_8)),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(width = dimensionResource(id = R.dimen.tracking_item_image_width_54))
                                    .height(height = dimensionResource(id = R.dimen.tracking_item_image_height_54)),
                                painter = painterResource(id = R.drawable.ic_download_colored),
                                contentDescription = null,
                            )
                        }

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.tracking_item_spacer_width_13)))

                        Column(
                            modifier = Modifier.weight(2f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.txt_receiver),
                                color = WhiteFfcccccc,
                                fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_14p5).value.sp,
                                fontWeight = FontWeight.Medium,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                            )

                            Text(
                                text = receiverLocation,
                                color = BlackFf94969a,
                                fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_15p8).value.sp,
                                fontWeight = FontWeight.Medium,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                            )
                        }
                    }

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Box(
                            modifier = Modifier.align(alignment = Alignment.End),
                        ) {
                            Column {
                                Text(
                                    text = stringResource(id = R.string.txt_status),
                                    color = WhiteFfcccccc,
                                    fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_14p5).value.sp,
                                    fontWeight = FontWeight.Medium,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                                )

                                Text(
                                    text = stringResource(id = status),
                                    color = BlackFf94969a,
                                    fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_15p8).value.sp,
                                    fontWeight = FontWeight.Medium,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_25)))
            }

            Icon(
                modifier = Modifier
                    .height(height = dimensionResource(id = R.dimen.tracking_item_icon_height_3))
                    .fillMaxWidth()
                ,
                painter = painterResource(id = R.drawable.ic_separator_horizontal),
                contentDescription = null,
                tint = WhiteFff5f5f5
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.tracking_item_spacer_height_10)))

            TextButton(
                onClick = {},
                modifier = Modifier
                    .height(height = dimensionResource(id = R.dimen.tracking_item_text_button_height_50))
                    .fillMaxWidth()
            ) {
                Icon(
                    modifier = Modifier
                        .height(height = dimensionResource(id = R.dimen.tracking_item_icon_height_20))
                        .width(width = dimensionResource(id = R.dimen.tracking_item_icon_width_20))
                    ,
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = null,
                    tint = OrangeFff77a26
                )

                Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.tracking_item_spacer_width_5)))

                Text(
                    text = stringResource(id = R.string.btn_add_stop),
                    color = OrangeFff77a26,
                    fontSize = dimensionResource(id = R.dimen.tracking_item_text_font_size_18p3).value.sp,
                    fontWeight = FontWeight.Medium,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = integerResource(id = R.integer.tracking_item_text_max_lines_1)
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

                TrackingItem(
                    shipmentNumber = "NEJ20089934122231",
                    senderLocation = "Atlanta,5243",
                    receiverLocation = "Chicago,6342",
                    time = "2 day - 3 days",
                    status = R.string.txt_waiting_to_collect
                )
            }
        }
    }
}