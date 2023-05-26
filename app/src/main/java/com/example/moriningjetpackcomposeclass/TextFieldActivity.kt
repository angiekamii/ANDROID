package com.example.moriningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)) {
       Text(text = "PERSONAL DETAILS", fontSize = 40.sp, color = Color.Black, fontWeight = FontWeight.Bold)

        //FIRSTNAME
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = {text=it},
            label = { Text(text = "Firstname:")},
            placeholder = { Text(text = "Enter Firstname")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon", modifier = Modifier.background(color = Color.Magenta))},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //SECOND NAME
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname,
            onValueChange = {mname=it},
            label = { Text(text = "Middle name:")},
            placeholder = { Text(text = "Enter Middle name")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //LAST NAME
        var lname by remember { mutableStateOf("") }
        TextField(
            value = lname,
            onValueChange = {lname=it},
            label = { Text(text = "Last name:")},
            placeholder = { Text(text = "Enter Last name")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //EMAIL
        var myemail by remember { mutableStateOf("") }
        TextField(
            value = myemail,
            onValueChange = {myemail=it},
            label = { Text(text = "Email:")},
            placeholder = { Text(text = "Enter Email")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //PASSWORD
        var password by remember { mutableStateOf("") }
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Password:")},
            placeholder = { Text(text = "Enter Password")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //CONTACT
        var mycontact by remember { mutableStateOf("") }
        TextField(
            value = mycontact,
            onValueChange = {mycontact=it},
            label = { Text(text = "Contact:")},
            placeholder = { Text(text = "Enter Phone number")},
            modifier = Modifier.padding(40.dp),
            textStyle = TextStyle(color = Color.Black, fontFamily = FontFamily.Serif, fontSize = 15.sp),
            leadingIcon = {Icon(imageVector = Icons.Default.Phone, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        )
    }


}
@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}