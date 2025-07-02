package emperorfin.android.movemate.ui.navigation

import androidx.annotation.DrawableRes
import emperorfin.android.movemate.R



sealed class Screen(val route: String, val label: String, @DrawableRes val iconRes: Int) {
    object Home : Screen(route = "home", label = "Home", iconRes = R.drawable.ic_house)
    object Calculate : Screen(route = "calculate", label = "Calculate", iconRes = R.drawable.ic_calculator)
    object Shipment : Screen(route = "shipment", label = "Shipment", iconRes = R.drawable.ic_history)
    object Profile : Screen(route = "profile", label = "Profile", iconRes = R.drawable.ic_profile)
}

val bottomNavItems = listOf(Screen.Home, Screen.Calculate, Screen.Shipment, Screen.Profile)
