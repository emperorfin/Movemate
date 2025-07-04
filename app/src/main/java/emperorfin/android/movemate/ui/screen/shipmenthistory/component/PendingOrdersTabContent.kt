package emperorfin.android.movemate.ui.screen.shipmenthistory.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.data.datasource.FakeDataSource
import emperorfin.android.movemate.ui.component.ShipmentsListItem
import emperorfin.android.movemate.ui.component.TextTile
import emperorfin.android.movemate.ui.theme.BlackFf70737a


@Composable
fun PendingOrdersTabContent() {
    val shipmentItems = FakeDataSource.getPendingShipmentItems()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = dimensionResource(id = R.dimen.pending_orders_tab_content_lazy_column_padding_horizontal_16))
    ) {
        item {
            TextTile(
                title = R.string.label_shipments,
                titleColor = BlackFf70737a,
                titleFontSize = dimensionResource(id = R.dimen.pending_orders_tab_content_text_tile_title_font_size_23).value.sp,
                titleFontWeight = FontWeight.SemiBold,
            )

            Spacer(modifier = Modifier.height(height = dimensionResource(id = R.dimen.pending_orders_tab_content_space_height_8)))
        }

        items(shipmentItems) { shipmentItem ->
            ShipmentsListItem(
                trailingImageRes = shipmentItem.imageRes,
                title = shipmentItem.title,
                status = shipmentItem.status,
                trackingNumber = shipmentItem.trackingNumber,
                location = shipmentItem.location,
                amount = shipmentItem.amount,
                date = shipmentItem.date,
                statusIconRes = shipmentItem.statusIconRes,
                statusColor = shipmentItem.statusColor,
                statusIconTint = shipmentItem.statusIconTint,
            )
        }
    }
}