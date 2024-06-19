package com.example.learnandroid.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandroid.Greeting
import com.example.learnandroid.R

@Composable
fun FaqScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White))
    {
        Image(
            painter = painterResource(id = R.drawable.ic_faqscreen) ,
            contentDescription ="FAQ",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(5.dp))
        Text(
            text = "1. What happens if I enter the wrong OTP during account verification?",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Red
        )

        Spacer(modifier = Modifier.size(5.dp))

        Text(
            text = "If you enter the wrong OTP, you will be shown an error message and will have to re-enter the correct code. Please mention the correct OTP that you receive on your registered mobile number via SMS to proceed with the verification process successfully.",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
        )
        Spacer(modifier = Modifier.size(5.dp))
        Text(
            text = "2. Where can I contact if I face any issues while booking a hotel room using the app?",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Red
        )
        Spacer(modifier = Modifier.size(5.dp))
        Text(
            text = "If you face any issues during your booking process you can reach out to our customer support team by at dummy@book_nest.com or call us at 9999999999.",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(5.dp))
        Text(
            text = "Is my personal information secure when using this app?",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Red
        )
        Spacer(modifier = Modifier.size(5.dp))
        Text(
            text = "Yes, we value the trust of our users and prioritise the security of their personal information. All your data, including personal details and booking information is secure with us and protected using encryption protocols to ensure confidentiality.",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FaqPreview() {
    FaqScreen()
}
