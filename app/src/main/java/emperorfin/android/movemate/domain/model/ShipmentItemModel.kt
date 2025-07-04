package emperorfin.android.movemate.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color


data class ShipmentItemModel(
    val title: String,
    @StringRes val status: Int,
    val trackingNumber: String,
    val location: String,
    val amount: String,
    val date: String,
    @DrawableRes val imageRes: Int,
    @DrawableRes val statusIconRes: Int,
    val statusColor: Color,
    val statusIconTint: Color,
)
