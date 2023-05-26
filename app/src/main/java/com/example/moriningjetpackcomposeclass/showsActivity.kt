package com.example.moriningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moriningjetpackcomposeclass.ui.theme.MoriningJetpackComposeClassTheme

class showsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            shows()

        }
    }
}

@Composable
fun shows(){
    var scrollstate= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollstate)) {
        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.rick), contentDescription = "Rick",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Rick and Morty", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Morty", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }
                
            }
            
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.bratz), contentDescription = "Bratz",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Bratz show 2010", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Yasmine", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.draia), contentDescription = "",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Daria Mtv", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Daria and friends", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.cutie), contentDescription = "Rick", modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Morty's", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Morty's gf", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.show), contentDescription = "",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "The Girl", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Bored", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.notorious), contentDescription = " ",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "The Notorious show", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "In the car", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.boondocks), contentDescription = "Rick",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "The Boondocks", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Together", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.delulu), contentDescription = "Rick",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Delusional girls", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "After one text", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card() {
            Column() {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.edandeddy), contentDescription = "Rick",modifier = Modifier.size(width = 150.dp, height = 150.dp))
                    Column() {
                        Text(text = "Ed and Eddy", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(10.dp))
                        Text(text = "Love it", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp))
                    }



                }

            }

        }



                }

            }



@Preview(showBackground = true)
@Composable
fun showsPreview(){
    shows()
}
