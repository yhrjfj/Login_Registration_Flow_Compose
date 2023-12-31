package com.yhr.jfj.login_registration_flow_compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yhr.jfj.login_registration_flow_compose.ui.theme.BgColor
import com.yhr.jfj.login_registration_flow_compose.ui.theme.ComponentsShape
import com.yhr.jfj.login_registration_flow_compose.ui.theme.Primary
import com.yhr.jfj.login_registration_flow_compose.ui.theme.TextColor

@Composable
fun TextComponent(
    value: String,
    minHeight: Dp = 40.dp,
    fontSize: TextUnit = 24.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    fontStyle: FontStyle = FontStyle.Normal
) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = minHeight),
        style = TextStyle(
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontStyle = fontStyle
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

//@Composable
//fun HeadingTextComponent(
//    value: String
//) {
//    Text(
//        text = value,
//        modifier = Modifier
//            .fillMaxWidth()
//            .heightIn(),
//        style = TextStyle(
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Normal
//        ),
//        color = TextColor,
//        textAlign = TextAlign.Center
//    )
//}

@Composable
fun MyTextFieldComponent(
    labelValue: String,
    leadingIcons: ImageVector
) {
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(BgColor)
            .clip(ComponentsShape.small),
        label = { Text(text = labelValue) },
        colors = OutlinedTextFieldDefaults.colors(
            cursorColor = Primary,
            focusedBorderColor = Primary,
            focusedLabelColor = Primary,
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
        leadingIcon = {
            Icon(imageVector = leadingIcons, contentDescription = "Person")
        }
    )
}