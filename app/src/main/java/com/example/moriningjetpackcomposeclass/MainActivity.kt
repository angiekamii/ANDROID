package com.example.moriningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

                }
            }
        }


@Composable
fun text(){
    var mContext= LocalContext.current
   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = Color.Black)
       .padding(50.dp),
       horizontalAlignment = Alignment.CenterHorizontally) {
       Text(text = "WELCOME TO ANDROID !",
           color = Color.Magenta,
           fontSize = 50.sp,
           fontStyle = FontStyle.Italic,
           fontWeight = FontWeight.ExtraBold,
           fontFamily = FontFamily.Cursive,)

        //buttons to help you navigate
       Button(onClick = {
           mContext.startActivity(Intent(mContext,LayoutActivity2::class.java))

       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)){
           Text(text = "Layout")
           
       }

       Spacer(modifier = Modifier.height(15.dp))

       Button(onClick = {
           mContext.startActivity(Intent(mContext,ImagesActivity2::class.java))

       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray), shape = RectangleShape)
           {
           Text(text = "Images", color = Color.White)

       }

       Spacer(modifier = Modifier.height(15.dp))
       
       Button(onClick = {
           mContext.startActivity(Intent(mContext,PracticeActivity2::class.java))

       }, shape = CircleShape) {
           Text(text = "Pizza")

       }

       Spacer(modifier = Modifier.height(15.dp))

       Button(onClick = {
           mContext.startActivity(Intent(mContext,TextFieldActivity::class.java))

       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Green)) {
           Text(text = "form")

       }

       Spacer(modifier = Modifier.height(15.dp))

       Button(onClick = {
           mContext.startActivity(Intent(mContext,ListActivity2::class.java))

       }, colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)) {
          Icon(imageVector =Icons.Default.Menu, contentDescription = "Icons")
           Text(text = "List")

       }
       Spacer(modifier = Modifier.height(15.dp))


       Button(onClick = {
           mContext.startActivity(Intent(mContext,CardsActivity2::class.java))

       }, colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)) {
           Text(text = "Card")

       }

       Button(onClick = {
           mContext.startActivity(Intent(mContext,CardPracticeActivity::class.java))

       }) {
           Text(text = "Practice")

       }

       Button(onClick = {
           mContext.startActivity(Intent(mContext,showsActivity::class.java))

       }) {
           Text(text = "Shows")

       }






   }
}

@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()

}