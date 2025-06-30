package emperorfin.android.movemate.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.MovemateTheme
import emperorfin.android.movemate.ui.theme.Purple40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    @StringRes title: Int,
    onBackPress: (() -> Unit)? = null,
    actions: @Composable (RowScope.() -> Unit) = {}
) {
    TopAppBar(
        modifier = Modifier.height(height = dimensionResource(id = R.dimen.app_bar_top_app_bar_height_70)),
        title = {
            Box {
                Text(
                    modifier = Modifier
                        .padding(all = dimensionResource(id = R.dimen.app_bar_text_padding_all_8))
                        .align(Alignment.TopCenter),
                    text = stringResource(id = title),
                    color = Color.White,
                    fontSize = dimensionResource(id = R.dimen.app_bar_text_font_size_18).value.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = integerResource(id = R.integer.app_bar_text_max_lines_1),
                    overflow = TextOverflow.Ellipsis,
                )
            }
        },
        navigationIcon = {
            onBackPress?.let {
                IconButton(onClick = { it() }) {
                    Box {
                        Image(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            colorFilter = ColorFilter.tint(Color.White),
                            contentDescription = null,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                        )
                    }
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Purple40
        ),
        actions = {
            actions()
        }
    )
}

@Preview
@Composable
private fun AppBarPreview() {
    MovemateTheme {
        AppBar(
            title = R.string.app_name
        )
    }
}