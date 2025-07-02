package emperorfin.android.movemate.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import emperorfin.android.movemate.R
import emperorfin.android.movemate.ui.theme.BlueFf4b3393
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
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    modifier = Modifier
                        .padding(all = dimensionResource(id = R.dimen.app_bar_text_padding_all_8))
                        .padding(end = dimensionResource(id = R.dimen.app_bar_text_padding_end_56))
                        .align(Alignment.TopCenter),
                    text = stringResource(id = title),
                    color = Color.White,
                    fontSize = dimensionResource(id = R.dimen.app_bar_text_font_size_18).value.sp,
                    fontWeight = FontWeight.Medium,
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
//                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            painter = painterResource(id = R.drawable.ic_arrow_back),
                            colorFilter = ColorFilter.tint(Color.White),
                            contentDescription = null,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .width(width = dimensionResource(id = R.dimen.app_bar_image_width_18))
                                .height(height = dimensionResource(id = R.dimen.app_bar_image_height_19))
                        )
                    }
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = BlueFf4b3393
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