package emperorfin.android.movemate.domain.model

import androidx.annotation.DrawableRes


data class VehicleModel(
    val name: String,
    val reliability: String,
    @DrawableRes val imageRes: Int
)
