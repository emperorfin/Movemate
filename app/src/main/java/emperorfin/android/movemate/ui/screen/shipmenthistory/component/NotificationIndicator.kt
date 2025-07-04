package emperorfin.android.movemate.ui.screen.shipmenthistory.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.OrangeFff17923
import emperorfin.android.movemate.ui.theme.White


@Composable
fun NotificationIndicator(
    counter: Int,
    contentColor: Color,
    backgroundColor: Color
) {
    Box(
        modifier = Modifier
            .width(width = dimensionResource(id = R.dimen.notification_indicator_box_width_37))
            .height(height = dimensionResource(id = R.dimen.notification_indicator_box_height_29))
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(size = dimensionResource(id = R.dimen.notification_indicator_box_rounded_corner_shape_size_20))
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "$counter",
            color = contentColor
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp",
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun NotificationIndicatorPreview() {
    MovemateTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            NotificationIndicator(
                counter = 3,
                contentColor = White,
                backgroundColor = OrangeFff17923
                )
        }
    }
}