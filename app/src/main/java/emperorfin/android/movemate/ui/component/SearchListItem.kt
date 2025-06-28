package emperorfin.android.movemate.ui.component

import androidx.annotation.DrawableRes
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.BlackFf6f7178
import emperorfin.android.movemate.ui.theme.BlackFf94969a
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFff5f5f5
import emperorfin.android.movemate.ui.theme.WhiteFffefefe


@Composable
fun SearchListItem(
    modifier: Modifier = Modifier,
    title: String,
    trackingNumber: String,
    senderLocation: String,
    destination: String,
    @DrawableRes icon: Int = R.drawable.ic_box_blue_bg
) {
    Box(
        modifier = modifier
            .background(
                color = WhiteFffefefe,
            )
            .fillMaxWidth()
            .height(height = dimensionResource(id = R.dimen.search_list_item_height_135))
            .padding(all = dimensionResource(id = R.dimen.search_list_item_padding_all_8)),
        contentAlignment = Alignment.Center
    ) {

        Column {
            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    modifier = Modifier
                        .width(width = dimensionResource(id = R.dimen.search_list_item_image_width_64))
                        .height(height = dimensionResource(id = R.dimen.search_list_item_image_height_64)),
                    painter = painterResource(id = icon),
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.search_list_item_spacer_width_1)))

                Column {
                    Text(
                        text = title,
                        color = BlackFf6f7178,
                        fontSize = dimensionResource(id = R.dimen.search_list_item_text_font_size_24p2).value.sp,
                        fontWeight = FontWeight.Medium,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = integerResource(id = R.integer.search_list_item_text_max_lines_1)
                    )

                    Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.search_list_item_spacer_height_11)))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = trackingNumber,
                            color = BlackFf94969a,
                            fontSize = dimensionResource(id = R.dimen.search_list_item_text_font_size_15p8).value.sp,
                            fontWeight = FontWeight.Medium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.search_list_item_text_max_lines_1)
                        )

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.search_list_item_spacer_width_4)))

                        Icon(
                            modifier = Modifier.size(size = dimensionResource(id = R.dimen.search_list_item_icon_size_6)),
                            painter = painterResource(id = R.drawable.ic_dot),
                            contentDescription = null,
                            tint = BlackFf94969a
                        )

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.search_list_item_spacer_width_4)))

                        Text(
                            text = senderLocation,
                            color = BlackFf94969a,
                            fontSize = dimensionResource(id = R.dimen.search_list_item_text_font_size_15p8).value.sp,
                            fontWeight = FontWeight.Medium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.search_list_item_text_max_lines_1)
                        )

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.search_list_item_spacer_width_4)))

                        // To simulate bold effect on the arrow.
                        Box {
                            Icon(
                                modifier = Modifier.size(size = dimensionResource(id = R.dimen.search_list_item_icon_size_17)),
                                imageVector = Icons.Filled.ArrowForward,
                                contentDescription = null,
                                tint = BlackFf94969a
                            )
                            Icon(
                                modifier = Modifier.size(size = dimensionResource(id = R.dimen.search_list_item_icon_size_18)),
                                imageVector = Icons.Filled.ArrowForward,
                                contentDescription = null,
                                tint = BlackFf94969a
                            )
                        }

                        Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.search_list_item_spacer_width_4)))

                        Text(
                            text = destination,
                            color = BlackFf94969a,
                            fontSize = dimensionResource(id = R.dimen.search_list_item_text_font_size_15p8).value.sp,
                            fontWeight = FontWeight.Medium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = integerResource(id = R.integer.search_list_item_text_max_lines_1)
                        )
                    }
                }
            }

            Icon(
                modifier = Modifier
                    .height(height = dimensionResource(id = R.dimen.search_list_item_icon_size_3))
                    .width(width = dimensionResource(id = R.dimen.search_list_item_icon_size_524)),
                painter = painterResource(id = R.drawable.ic_separator_horizontal),
                contentDescription = null,
            tint = WhiteFff5f5f5
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
private fun SearchListItemPreview() {
    MovemateTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.Gray
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding).padding(horizontal = 8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(70.dp))

                SearchListItem(
                    title = "Macbook pro M2",
                    trackingNumber = "#NE43857340857904",
                    senderLocation = "Paris",
                    destination = "Morocco"
                )
            }
        }
    }
}