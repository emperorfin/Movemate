package emperorfin.android.movemate.ui.component

import androidx.annotation.DimenRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CustomChipGroup(
    chipLabels: List<String>,
    @DimenRes height: Dp = dimensionResource(id = R.dimen.custom_chip_group_height_43),
    @DimenRes spaceWidth: Dp = dimensionResource(id = R.dimen.custom_chip_group_spacer_width_8)
) {
    var selectedChip by remember { mutableStateOf("") }

    FlowRow(
        modifier = Modifier.padding(all = dimensionResource(id = R.dimen.custom_chip_group_flow_row_padding_all_8)),
        horizontalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.custom_chip_group_flow_row_horizontal_arrangement_2)),
        verticalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.custom_chip_group_flow_row_vertical_arrangement_8))
    ) {
        chipLabels.forEach { label ->
            FilterChip(
                modifier = Modifier.height(height = height),
                onClick = { selectedChip = label },
                label = { Text(label) },
                selected = selectedChip == label,
                border = BorderStroke(
                    width = dimensionResource(id = R.dimen.custom_chip_group_filter_chip_border_stroke_width_2),
                    color = if (selectedChip == label) Color.Black else Color.Gray
                ),
                colors = FilterChipDefaults.filterChipColors(
//                    containerColor = if (selectedChip == label) Color.Black else Color.White,
                    containerColor = Color.White,
                    labelColor = Color.Black,
                    selectedContainerColor = Color.Black,
                    selectedLabelColor = Color.White,
                ),
                leadingIcon = if (selectedChip == label) {
                    { Icon(Icons.Filled.Done, contentDescription = "Selected", tint = Color.White) }
                } else null
            )

            Spacer(modifier = Modifier.width(width = spaceWidth))
        }
    }
}

@Preview
@Composable
private fun CustomChipGroupPreview() {
    MovemateTheme {
        CustomChipGroup(
            chipLabels = listOf("Documents", "Glass", "Liquid", "Foods", "Electronic", "Product", "Others")
        )
    }
}