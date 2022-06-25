package com.agdevs.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agdevs.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2a7b19))
            .padding(top = 180.dp)


    ) {
        Column(
            modifier = Modifier.padding(16.dp),
//            Alignment.Horizontal(Alignment.Center)
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
                
        ) {

            Column(
                modifier = Modifier.padding(16.dp),
//            Alignment.Horizontal(Alignment.Center)
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val image = painterResource(id = R.drawable.android_logo)

                Image(
                    painter = image,
                    contentDescription = null,

                    )

                Text(
                    text = stringResource(R.string.dev_name),
                    fontWeight = FontWeight.Bold,
                    fontSize = 36.sp,
//                textAlign = Alignment.Center
                    color = Color.White

                )

                Text(
                    text = stringResource(R.string.dev_title),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFd55819)
                )

            }


            Column(
                modifier = Modifier
                    .padding(top = 32.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                var icon = painterResource(id = R.drawable.ic_baseline_local_phone_24)
                Icon(painter = icon, contentDescription = null)

                    Text(
                        text = stringResource(R.string.dev_phone),
                        modifier = Modifier
                            .padding(start = 8.dp),
                        fontSize = 20.sp,
                        color = Color.White

                    )

                }

                Row(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                var icon = painterResource(id = R.drawable.ic_baseline_email_24)
                Icon(painter = icon, contentDescription = null)

                    Text(
                        text = stringResource(R.string.dev_email),
                        modifier = Modifier
                            .padding(start = 8.dp),
                        fontSize = 20.sp,
                        color = Color.White

                    )

                }

                Row(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                var icon = painterResource(id = R.drawable.ic_baseline_share_24)
                Icon(painter = icon, contentDescription = null)

                    Text(
                        text = stringResource(R.string.dev_share),
                        modifier = Modifier
                            .padding(start = 8.dp),
                        fontSize = 20.sp,
                        color = Color.White


                    )

                }

            }

            
        }


    }
}



@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
//        Greeting("Android")
        BusinessCardApp()



    }
}