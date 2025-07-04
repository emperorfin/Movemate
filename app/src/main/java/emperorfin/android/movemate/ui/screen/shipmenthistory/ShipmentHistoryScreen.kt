package emperorfin.android.movemate.ui.screen.shipmenthistory

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavHostController
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.component.AppBar
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.AllTabContent
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.CancelledTabContent
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.CompletedTabContent
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.InProgressTabContent
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.NotificationIndicator
import emperorfin.android.movemate.ui.screen.shipmenthistory.component.PendingOrdersTabContent
import emperorfin.android.movemate.ui.theme.BlueFf4b3393
import emperorfin.android.movemate.ui.theme.BlueFf694fba
import emperorfin.android.movemate.ui.theme.BlueFfbda9f0
import emperorfin.android.movemate.ui.theme.BlueFfc2baf6
import emperorfin.android.movemate.ui.theme.OrangeFff17923
import emperorfin.android.movemate.ui.theme.White
import emperorfin.android.movemate.ui.theme.WhiteFff9f9f9



private const val TAB_TITLE_ALL: String = "All"
private const val TAB_TITLE_COMPLETED: String = "Completed"
private const val TAB_TITLE_IN_PROGRESS: String = "In progress"
private const val TAB_TITLE_PENDING_ORDERS: String = "Pending orders"
private const val TAB_TITLE_CANCELLED: String = "Cancelled"

@Composable
fun ShipmentHistoryScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {

    val tabs = listOf(
        TAB_TITLE_ALL,
        TAB_TITLE_COMPLETED,
        TAB_TITLE_IN_PROGRESS,
        TAB_TITLE_PENDING_ORDERS,
        TAB_TITLE_CANCELLED
    )

    var selectedTabIndex by remember { mutableStateOf(0) }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            AppBar(
                title = R.string.screen_title_shipment_history,
                onBackPress = { navController.navigateUp() }
            )
        },
        containerColor = WhiteFff9f9f9
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ScrollableTabRow(
                modifier = Modifier.fillMaxWidth(),
                selectedTabIndex = selectedTabIndex,
                edgePadding = dimensionResource(id = R.dimen.shipment_history_screen_scrollable_tab_row_edge_padding_16),
                containerColor = BlueFf4b3393,
                contentColor = White,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = OrangeFff17923
                    )
                }
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(title)

                                Spacer(modifier = Modifier.width(width = dimensionResource(id = R.dimen.shipment_history_screen_spacer_width_8)))

                                when(title) {
                                    TAB_TITLE_ALL -> {
                                        if(selectedTabIndex == index) {
                                            NotificationIndicator(
                                                counter = 12,
                                                contentColor = White,
                                                backgroundColor = OrangeFff17923
                                            )
                                        } else {
                                            NotificationIndicator(
                                                counter = 12,
                                                contentColor = BlueFfc2baf6,
                                                backgroundColor = BlueFf694fba
                                            )
                                        }
                                    }
                                    TAB_TITLE_COMPLETED -> {
                                        if(selectedTabIndex == index) {
                                            NotificationIndicator(
                                                counter = 5,
                                                contentColor = White,
                                                backgroundColor = OrangeFff17923
                                            )
                                        } else {
                                            NotificationIndicator(
                                                counter = 5,
                                                contentColor = BlueFfc2baf6,
                                                backgroundColor = BlueFf694fba
                                            )
                                        }
                                    }
                                    TAB_TITLE_IN_PROGRESS -> {
                                        if(selectedTabIndex == index) {
                                            NotificationIndicator(
                                                counter = 3,
                                                contentColor = White,
                                                backgroundColor = OrangeFff17923
                                            )
                                        } else {
                                            NotificationIndicator(
                                                counter = 3,
                                                contentColor = BlueFfc2baf6,
                                                backgroundColor = BlueFf694fba
                                            )
                                        }
                                    }
                                    TAB_TITLE_PENDING_ORDERS -> {
                                        if(selectedTabIndex == index) {
                                            NotificationIndicator(
                                                counter = 4,
                                                contentColor = White,
                                                backgroundColor = OrangeFff17923
                                            )
                                        } else {
                                            NotificationIndicator(
                                                counter = 4,
                                                contentColor = BlueFfc2baf6,
                                                backgroundColor = BlueFf694fba
                                            )
                                        }
                                    }
                                    TAB_TITLE_CANCELLED -> {}
                                }
                            }
                        },
//                        icon = {
//                            NotificationIndicator(counter = 12, contentColor = White, backgroundColor = OrangeFff17923)
//                        },
                        selectedContentColor = White,
                        unselectedContentColor = BlueFfbda9f0
                    )
                }
            }

            when(selectedTabIndex) {
                0 -> AllTabContent()
                1 -> CompletedTabContent()
                2 -> InProgressTabContent()
                3 -> PendingOrdersTabContent()
                4 -> CancelledTabContent()
            }
        }
    }
}