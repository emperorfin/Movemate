package emperorfin.android.movemate.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import emperorfin.android.movemate.R
import emperorfin.android.movemate.data.datasource.FakeDataSource
import emperorfin.android.movemate.ui.component.RoundedOutlinedTextFieldWithIcons
import emperorfin.android.movemate.ui.component.TextTile
import emperorfin.android.movemate.ui.component.TrackingItem
import emperorfin.android.movemate.ui.component.VehiclesListItem
import emperorfin.android.movemate.ui.theme.BlackFf70737a
import emperorfin.android.movemate.ui.theme.BlueFf4b3393
import emperorfin.android.movemate.ui.theme.GrayFfc3c3c4
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFff9f9f9


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    SideEffect {
        systemUiController.setStatusBarColor(
            color = BlueFf4b3393,
            darkIcons = useDarkIcons
        )
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = WhiteFff9f9f9
    ) { paddingValues ->

        var search by rememberSaveable { mutableStateOf("") }

        val vehicles = FakeDataSource.getVehicles()

        Column(
            modifier = Modifier//.padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = modifier
                    .background(color = BlueFf4b3393)
                    .fillMaxWidth()
                    .height(height = dimensionResource(id = R.dimen.home_screen_box_height_165))
                    .padding(horizontal = dimensionResource(id = R.dimen.home_screen_box_padding_horizontal_16)),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Row {
                        Image(
                            modifier = Modifier.size(size = dimensionResource(id = R.dimen.home_screen_image_size_47)),
                            painter = painterResource(id = R.drawable.ic_avatar),
                            contentDescription = null,
                        )

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = dimensionResource(id = R.dimen.home_screen_box_padding_start_8))
                        ) {
                            Column {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(height = dimensionResource(id = R.dimen.home_screen_image_height_13))
                                            .width(width = dimensionResource(id = R.dimen.home_screen_image_width_12)),
                                        painter = painterResource(id = R.drawable.ic_compass),
                                        contentDescription = null
                                    )

                                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.home_screen_spacer_width_4)))

                                    Text(
                                        text = stringResource(id = R.string.txt_your_location),
                                        color = GrayFfc3c3c4,
                                        fontSize = dimensionResource(id = R.dimen.home_screen_text_font_size_12).value.sp,
                                        fontWeight = FontWeight.Medium,
                                        overflow = TextOverflow.Ellipsis,
                                        maxLines = integerResource(id = R.integer.home_screen_text_max_lines_1)
                                    )
                                }

                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.txt_wertheimer_illinois),
                                        color = GrayFfc3c3c4,
                                        fontSize = dimensionResource(id = R.dimen.home_screen_text_font_size_15).value.sp,
                                        fontWeight = FontWeight.Medium,
                                        overflow = TextOverflow.Ellipsis,
                                        maxLines = integerResource(id = R.integer.shipments_list_item_text_max_lines_3)
                                    )

                                    Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.home_screen_spacer_width_4)))

                                    Image(
                                        modifier = Modifier
                                            .height(height = dimensionResource(id = R.dimen.home_screen_image_height_10))
                                            .width(width = dimensionResource(id = R.dimen.home_screen_image_width_9)),
                                        painter = painterResource(id = R.drawable.ic_arrow_down),
                                        contentDescription = null
                                    )
                                }
                            }
                        }

                        Image(
                            modifier = Modifier.size(size = dimensionResource(id = R.dimen.home_screen_image_size_51)),
                            painter = painterResource(id = R.drawable.ic_notification),
                            contentDescription = null,
                        )
                    }

                    Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_16)))

                    RoundedOutlinedTextFieldWithIcons(
                        labelRes = R.string.txt_enter_the_receipt_number,
                        value = search,
                        onValueChanged = {
                            search = it
                        },
                        leadingIconRes = R.drawable.ic_search,
                        trailingIconRes = R.drawable.ic_scan,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    )
                }
            }

            Column(
                modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.home_screen_column_padding_horizontal_16))
            ) {
                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.home_screen_spacer_height_10)))

                TextTile(
                    title = R.string.label_tracking,
                    titleColor = BlackFf70737a,
                    titleFontSize = dimensionResource(id = R.dimen.home_screen_text_tile_title_font_size_23).value.sp,
                    titleFontWeight = FontWeight.SemiBold,
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.home_screen_spacer_height_8)))

                TrackingItem(
                    shipmentNumber = "NEJ20089934122231",
                    senderLocation = "Atlanta,5243",
                    receiverLocation = "Chicago,6342",
                    time = "2 day - 3 days",
                    status = R.string.txt_waiting_to_collect
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.home_screen_spacer_height_10)))

                TextTile(
                    title = R.string.label_available_vehicles,
                    titleColor = BlackFf70737a,
                    titleFontSize = dimensionResource(id = R.dimen.home_screen_text_tile_title_font_size_23).value.sp,
                    titleFontWeight = FontWeight.SemiBold,
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.home_screen_spacer_height_8)))

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = dimensionResource(id = R.dimen.home_screen_lazy_row_padding_all_8)),
                    horizontalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.home_screen_lazy_row_horizontal_arrangement_space_12))
                ) {
                    items(vehicles) { vehicle ->
                        VehiclesListItem(
                            vehicleType = vehicle.name,
                            coverage = vehicle.reliability,
                            image = vehicle.imageRes
                        )
                    }
                }
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
private fun HomeScreenPreview() {
    MovemateTheme {
        HomeScreen()
    }
}