package com.example.moriningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class LayoutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mytext()

            }
        }
    }


@Composable
fun mytext(){
   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = Color.Black)) {
       Text(text = "Hello There Angela!", fontSize = 40.sp, fontStyle = FontStyle.Italic, color = Color.Gray)
       Text(text = "Welcome to Android",fontSize = 40.sp, fontFamily = FontFamily.Cursive, color = Color.Magenta)

       Row(modifier=Modifier.fillMaxWidth(),
           horizontalArrangement = Arrangement.SpaceEvenly) {
           Text(text = "Yes",color = Color.Gray)
           Text(text = "No",color = Color.Gray)

       }

   }


}


@Preview(showBackground = true)
@Composable
fun mytextPreview(){
    mytext()
}