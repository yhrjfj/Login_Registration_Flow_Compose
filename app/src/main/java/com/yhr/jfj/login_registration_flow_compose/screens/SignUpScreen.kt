package com.yhr.jfj.login_registration_flow_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yhr.jfj.login_registration_flow_compose.R
import com.yhr.jfj.login_registration_flow_compose.components.MyTextFieldComponent
import com.yhr.jfj.login_registration_flow_compose.components.TextComponent

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            TextComponent(
                value = stringResource(id = R.string.hello)
            )
            TextComponent(
                value = stringResource(id = R.string.create_account),
                minHeight = 40.dp,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}