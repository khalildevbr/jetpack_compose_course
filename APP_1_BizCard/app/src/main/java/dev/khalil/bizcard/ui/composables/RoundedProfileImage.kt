package dev.khalil.bizcard.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.khalil.bizcard.R

@Composable
fun RoundedProfileImage() {
    Surface(
        modifier = Modifier.size(150.dp),
        border = BorderStroke(0.5.dp, Color.LightGray),
        shape = CircleShape,
        color = Color.Red
//        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Foto de perfil do usuário",
            contentScale = ContentScale.Inside
        )
    }
}

@Preview
@Composable
fun RoundedProfileImagePreview() {
    MaterialTheme {
        RoundedProfileImage()
    }
}