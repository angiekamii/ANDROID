package com.example.moriningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class CardPracticeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            practice()

        }
    }
}

@Composable
fun practice(){
    var button= LocalContext.current
Column(modifier = Modifier
    .fillMaxSize()
    .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
    Card() {
        Column() {
            Image(painter = painterResource(id = R.drawable.ghostface), contentDescription = "Scream")
            
        }

        
    }

    Spacer(modifier = Modifier.height(15.dp))

    Card() {
        Column() {
            Image(painter = painterResource(id = R.drawable.moonand), contentDescription = "Scream")

        }


    }

    Spacer(modifier = Modifier.height(15.dp))

    Card() {
        Column() {
            Image(painter = painterResource(id = R.drawable.bunny), contentDescription = "Scream")

        }


    }
    
}
    Button(onClick = { button.startActivity(Intent(button,MainActivity::class.java))}) {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Icons")
        Text(text = "HOME")
        
    }
}

@Preview(showBackground = true)
@Composable
fun parcticePreview(){
    practice()

}