package com.example.sanket.activities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R
import androidx.compose.material3.Text as Text1
import androidx.compose.ui.res.stringResource as stringResource1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About(navController: NavHostController) {
    var about_us by remember { mutableStateOf(TextFieldValue()) }
    Box() {
            Image(
                painter = painterResource(id = R.drawable.bg),
                contentDescription = "background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
            )
            Text1(
                text = stringResource1(id = R.string.aboutus),
                style = TextStyle(
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color(94, 48, 35),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(top = 30.dp)
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .border(
                        width = 3.dp,
                        brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                        shape = RoundedCornerShape(50.dp)
                    ),
                textAlign = TextAlign.Center
            )
            TextField(
                modifier = Modifier
                    .padding(top = 125.dp),
                value = about_us,
                onValueChange = { about_us = it },
                visualTransformation = PasswordVisualTransformation(),
                placeholder = { Text(text = stringResource(id = R.string.about_us)) },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )

            )
    }
}






@Preview
@Composable
fun AboutPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    About(navController)
}