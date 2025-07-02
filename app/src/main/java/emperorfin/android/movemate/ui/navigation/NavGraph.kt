package emperorfin.android.movemate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import emperorfin.android.movemate.ui.screen.home.HomeScreen
import emperorfin.android.movemate.ui.screen.calculate.CalculateScreen
import emperorfin.android.movemate.ui.screen.ordersummary.OrderSummaryScreen
import emperorfin.android.movemate.ui.screen.profile.ProfileScreen


@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Home.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Calculate.route) { CalculateScreen(navController = navController) }
        composable(Screen.Shipment.route) { OrderSummaryScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
    }
}