package com.example.moriningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class PracticeActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            pizza()

        }
    }
}

@Composable
fun pizza(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Gray)) {
        Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "Pizza")
        Column() {
            Text(text = "Homemade Veg pizza", fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif)
            Text(text = "Besides tomato sauce, the most common vegetables to put on pizza are: fresh tomatoes, peppers, zucchini, zucchini flowers, eggplants, mushrooms, artichokes, onion, broccoli rabe, potatoes and radicchio. Rocket salad is often added raw at the end.", fontStyle = FontStyle.Italic)

        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun pizzaPreview(){
    pizza()
}
