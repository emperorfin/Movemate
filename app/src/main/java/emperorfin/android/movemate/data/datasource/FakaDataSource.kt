package emperorfin.android.movemate.data.datasource

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import emperorfin.android.movemate.R
import emperorfin.android.movemate.domain.model.ShipmentItemModel
import emperorfin.android.movemate.domain.model.VehicleModel
import emperorfin.android.movemate.ui.theme.GreenFf3dbc89
import emperorfin.android.movemate.ui.theme.OrangeFff17923

object FakeDataSource {

    fun getVehicles(): List<VehicleModel> {
        val vehicles = listOf(
            VehicleModel(
                name = "Ocean freight",
                reliability = "International",
                imageRes = R.drawable.img_boat
            ),
            VehicleModel(
                name = "Cargo freight",
                reliability = "Reliable",
                imageRes = R.drawable.img_truck
            ),
            VehicleModel(
                name = "Air freight",
                reliability = "International",
                imageRes = R.drawable.img_truck
            ),
            VehicleModel(
                name = "Ocean freight",
                reliability = "International",
                imageRes = R.drawable.img_boat
            ),
            VehicleModel(
                name = "Cargo freight",
                reliability = "Reliable",
                imageRes = R.drawable.img_truck
            ),
            VehicleModel(
                name = "Air freight",
                reliability = "International",
                imageRes = R.drawable.img_truck
            ),
        )

        return vehicles
    }

    @Composable
    fun getAllShipmentItems(): List<ShipmentItemModel> {
        val shipmentItems = listOf(
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "650",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "350",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "200",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "600",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
        )

        return shipmentItems
    }

    @Composable
    fun getInProgressShipmentItems(): List<ShipmentItemModel> {
        val shipmentItems = listOf(
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1400",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "370",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_in_progress,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "3570",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_sync,
                statusColor = GreenFf3dbc89,
                statusIconTint = GreenFf3dbc89,
            ),
        )

        return shipmentItems
    }

    @Composable
    fun getPendingShipmentItems(): List<ShipmentItemModel> {
        val shipmentItems = listOf(
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "1050",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "650",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "6050",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
            ShipmentItemModel(
                title = stringResource(id = R.string.txt_arriving_today),
                status = R.string.txt_pending,
                trackingNumber = "#NEJ20089934122231",
                location = "Atlanta",
                amount = "750",
                date = "Sep 20,2023",
                imageRes = R.drawable.img_box_119_by_91,
                statusIconRes = R.drawable.ic_history,
                statusColor = OrangeFff17923,
                statusIconTint = OrangeFff17923,
            ),
        )

        return shipmentItems
    }

}