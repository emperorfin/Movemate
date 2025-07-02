package emperorfin.android.movemate.ui.screen.calculate

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.component.AppBar
import emperorfin.android.movemate.ui.component.BigButton
import emperorfin.android.movemate.ui.component.CustomChipGroup
import emperorfin.android.movemate.ui.component.DropdownWithIcon
import emperorfin.android.movemate.ui.component.TextFieldWithIcon
import emperorfin.android.movemate.ui.component.TextTile
import emperorfin.android.movemate.ui.theme.BlackFf70737a
import emperorfin.android.movemate.ui.theme.BlueFf4b3393
import emperorfin.android.movemate.ui.theme.GrayFfb4b3b5
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.WhiteFff9f9f9
import emperorfin.android.movemate.ui.theme.WhiteFffefefe


@Composable
fun CalculateScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
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
        topBar = {
            AppBar(
                title = R.string.screen_title_calculate,
                onBackPress = { navController.navigateUp() }
            )
        },
        containerColor = WhiteFff9f9f9
    ) { paddingValues ->

        var locationSender by rememberSaveable { mutableStateOf("") }
        var locationReceiver by rememberSaveable { mutableStateOf("") }
        var approximateWeight by rememberSaveable { mutableStateOf("") }

        Column(
            modifier = Modifier.padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = dimensionResource(id = R.dimen.calculate_screen_padding_horizontal_8))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {
                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_10)))

                TextTile(
                    title = R.string.label_destination,
                    titleColor = BlackFf70737a,
                    titleFontSize = dimensionResource(id = R.dimen.calculate_screen_text_tile_title_font_size_23).value.sp,
                    titleFontWeight = FontWeight.SemiBold,
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_8)))

                Box(
                    modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.calculate_screen_box_padding_horizontal_8))
                ) {
                    Box(
                        modifier = modifier
                            .background(color = WhiteFffefefe, RoundedCornerShape(size = dimensionResource(id = R.dimen.calculate_screen_box_rounded_corner_shape_size_15)))
                            .fillMaxWidth()
                            .height(height = dimensionResource(id = R.dimen.calculate_screen_box_height_284))
                            .padding(
                                horizontal = dimensionResource(id = R.dimen.calculate_screen_box_padding_horizontal_4),
                                vertical = dimensionResource(id = R.dimen.calculate_screen_box_padding_vertical_8)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Column {
                            TextFieldWithIcon(
                                value = locationSender,
                                onValueChange = {
                                    locationSender = it
                                },
                                hint = stringResource(id = R.string.label_sender_location),
                                icon = R.drawable.ic_upload
                            )

                            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_16)))

                            TextFieldWithIcon(
                                value = locationReceiver,
                                onValueChange = {
                                    locationReceiver = it
                                },
                                hint = stringResource(id = R.string.label_receiver_location),
                                icon = R.drawable.ic_download
                            )

                            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_16)))

                            TextFieldWithIcon(
                                value = approximateWeight,
                                onValueChange = {
                                    approximateWeight = it
                                },
                                hint = stringResource(id = R.string.label_approx_weight),
                                icon = R.drawable.ic_scale
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_26)))

                TextTile(
                    title = R.string.label_packaging,
                    subTitle = R.string.label_what_are_you_sending,
                    titleColor = BlackFf70737a,
                    subTitleColor = GrayFfb4b3b5,
                    titleFontSize = 23.sp,
                    subTitleFontSize = 22.sp,
                    titleFontWeight = FontWeight.SemiBold,
                    subTitleFontWeight = FontWeight.Medium,
                    spaceBelowTitle = 8.dp,
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_8)))

                DropdownWithIcon(
                    icon = R.drawable.ic_box,
                    menuItems = listOf("Box", "Box2", "Box3"),
                    onItemClick = {}
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_26)))

                TextTile(
                    title = R.string.label_categories,
                    subTitle = R.string.label_what_are_you_sending,
                    titleColor = BlackFf70737a,
                    subTitleColor = GrayFfb4b3b5,
                    titleFontSize = dimensionResource(id = R.dimen.calculate_screen_text_tile_title_font_size_23).value.sp,
                    subTitleFontSize = dimensionResource(id = R.dimen.calculate_screen_text_tile_subtitle_font_size_22).value.sp,
                    titleFontWeight = FontWeight.SemiBold,
                    subTitleFontWeight = FontWeight.Medium,
                    spaceBelowTitle = dimensionResource(id = R.dimen.calculate_screen_text_tile_space_below_title_8),
                )

                Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_8)))

                CustomChipGroup(
                    chipLabels = listOf("Documents", "Glass", "Liquid", "Foods", "Electronic", "Product", "Others")
                )
            }

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_58)))

            Box(
                modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.calculate_screen_box_padding_horizontal_8))
            ) {
                BigButton(
                    modifier = Modifier.fillMaxWidth(),
                    textRes = R.string.btn_calculate,
                    onClick = {}
                )
            }

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.calculate_screen_spacer_height_48)))
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
private fun CalculateScreenPreview() {
    MovemateTheme {
        CalculateScreen(
            navController = rememberNavController()
        )
    }
}