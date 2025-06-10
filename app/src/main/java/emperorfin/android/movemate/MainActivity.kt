package emperorfin.android.movemate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.ui.component.BigButton
import emperorfin.android.movemate.ui.component.CustomChipGroup
import emperorfin.android.movemate.ui.component.DropdownWithIcon
import emperorfin.android.movemate.ui.component.RoundedOutlinedTextFieldWithIcons
import emperorfin.android.movemate.ui.component.ShipmentsListItem
import emperorfin.android.movemate.ui.component.TextFieldWithIcon
import emperorfin.android.movemate.ui.component.TextTile
import emperorfin.android.movemate.ui.component.TrackingItem
import emperorfin.android.movemate.ui.component.VehiclesListItem
import emperorfin.android.movemate.ui.theme.BlackFf70737a
import emperorfin.android.movemate.ui.theme.GrayFfbcbcbc
import emperorfin.android.movemate.ui.theme.GreenFf3dbc89
import emperorfin.android.movemate.ui.theme.GreenFf8cd2b3
import emperorfin.android.movemate.ui.theme.MovemateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovemateTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color.Gray) { innerPadding ->

                    var search by rememberSaveable { mutableStateOf("") }
                    var location by rememberSaveable { mutableStateOf("") }

                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp)
                    ) {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        BigButton(
                            modifier = Modifier.fillMaxWidth(),
                            textRes = R.string.btn_back_to_home,
                            onClick = {}
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        CustomChipGroup(
                            chipLabels = listOf("Documents", "Glass", "Liquid", "Foods", "Electronic", "Product", "Others")
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .fillMaxWidth()
                                .height(80.dp)
                        ) {
                            RoundedOutlinedTextFieldWithIcons(
                                labelRes = R.string.txt_enter_the_receipt_number,
                                value = search,
                                onValueChanged = {
                                    search = it
                                },
                                leadingIconRes = R.drawable.ic_search,
                                trailingIconRes = R.drawable.ic_scan,
                            )
                        }

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        VehiclesListItem(
                            vehicleType = "Cargo freight",
                            coverage = "Reliable",
                            image = R.drawable.img_truck
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        TrackingItem(
                            shipmentNumber = "NEJ20089934122231",
                            senderLocation = "Atlanta,5243",
                            receiverLocation = "Chicago,6342",
                            time = "2 day - 3 days",
                            status = R.string.txt_waiting_to_collect
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        TextFieldWithIcon(
                            value = location,
                            onValueChange = {
                                location = it
                            },
                            hint = "Sender location",
                            icon = R.drawable.ic_upload
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        DropdownWithIcon(
                            icon = R.drawable.ic_box,
                            menuItems = listOf("Box", "Box2", "Box3"),
                            onItemClick = {}
                        )

                        Spacer(modifier = Modifier.height(height = 20.dp))

                        ShipmentsListItem(
                            trailingImageRes = R.drawable.img_box_119_by_91,
                            title = stringResource(id = R.string.txt_arriving_today),
                            status = R.string.txt_in_progress,
                            trackingNumber = "#NEJ20089934122231",
                            location = "Atlanta",
                            amount = "1400",
                            date = "Sep 20,2023",
                            statusIconRes = R.drawable.ic_sync,
                            statusIconTint = GreenFf3dbc89
                        )

                        Spacer(modifier = Modifier.height(height = 40.dp))

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

                        Spacer(modifier = Modifier.height(height = 40.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovemateTheme {
        Greeting("Android")
    }
}