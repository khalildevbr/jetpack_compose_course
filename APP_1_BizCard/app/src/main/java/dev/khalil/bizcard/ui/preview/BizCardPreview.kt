package dev.khalil.bizcard.ui.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.khalil.bizcard.ui.composables.BizCardComposable

@Preview
@Composable
fun BizCardPreview() {
    MaterialTheme {
        BizCardComposable()
    }
}