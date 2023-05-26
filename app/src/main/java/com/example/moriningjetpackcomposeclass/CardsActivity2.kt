package com.example.moriningjetpackcomposeclass

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class CardsActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()

        }
    }
}

@Composable
fun mycard() {
    var scrollstate= rememberScrollState()
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(scrollstate),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            modifier = Modifier
                .padding(30.dp)
        ) {
            Column() {
                Text(text = "Pizza", fontSize = 20.sp)
                Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "car")
            }
        }

            Spacer(modifier = Modifier.height(30.dp))

            Card(
                modifier = Modifier.padding(30.dp)
            ) {
                Column() {
                    Text(text = "Pot", fontSize = 20.sp)
                    Image(
                        painter = painterResource(id = R.drawable.pottery),
                        contentDescription = "car"
                    )
                }
            }

                Spacer(modifier = Modifier.height(45.dp))

                Card(
                    modifier = Modifier

                        .padding(30.dp)
                ) {
                    Column() {
                        Text(text = "Pizza", fontSize = 20.sp)
                        Image(
                            painter = painterResource(id = R.drawable.car),
                            contentDescription = "car"
                        )
                    }

                }

            }
        }




@Preview(showBackground = true)
@Composable
fun mycardPreview(){
    mycard()
}