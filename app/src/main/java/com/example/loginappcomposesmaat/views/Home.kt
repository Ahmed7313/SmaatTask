package com.example.loginappcomposesmaat.views

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginappcomposesmaat.R
import com.example.myapplication.ui.theme.LoginAppComposeSmaatTheme

@Preview(showBackground = true)
@Composable
fun HomeView() {
    LoginAppComposeSmaatTheme {
        ListItem(drawable = R.drawable.ksa,
            itemName = "Btates",
        itemPrice = "360")
    }
}

@Composable
fun ListItem(
    @DrawableRes drawable: Int,
     itemName: String,
     itemPrice: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Text(
            text = itemName,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            )
        )
        Text(
            text = itemPrice + "$",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.paddingFromBaseline(
                top = 8.dp, bottom = 8.dp
            ),
            fontSize = 18.sp
        )
    }
}

@Composable
fun listView(list: MutableList<String>){

}
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyElementPreview() {
    LoginAppComposeSmaatTheme() {
        ListItem(
            drawable = R.drawable.ksa,
            itemName = "Btates",
            itemPrice = "360")
    }


}