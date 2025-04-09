package com.glory.scaffold.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.glory.scaffold.R
import com.glory.scaffold.navigation.ROUT_HOME
import com.glory.scaffold.ui.theme.newGreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    val coroutineScope = rememberCoroutineScope()
    coroutineScope.launch{
        delay(2000)
        navController.navigate(ROUT_HOME)


    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(newGreen),
        //    .paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "SokoMart",
            fontSize = 60.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Duka Bora Ni Sokomart",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold
        )

    }




}



@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}