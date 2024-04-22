package com.mjm.mjm077

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mjm.mjm077.ui.theme.Mjm077Theme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mjm077Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    registration()

                }
            }
        }
    }
}
@Composable
fun registration() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember{ mutableStateOf("") }
    val context= LocalContext.current


    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.White)

    ) {
        Text(text = "MJM077",
            color = Color.Blue,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(value = username,
            onValueChange = {username=it},
            label = { Text(text = "Enter Username",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()

        )

        OutlinedTextField(value = email, onValueChange = {email=it},
            label = { Text(text = "Enter Email Address",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()

        )
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = confirmpassword,
            onValueChange = {confirmpassword=it},
            label = { Text(text = "Confirm Password",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )

        Button(onClick = {
            val intent=Intent(context,MainActivity::class.java)
            context.startActivity(intent)
                         },
            modifier=Modifier.fillMaxWidth()) {

            Text(text = "Register",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive)
        }

    }


}
@Preview
@Composable
private fun regprev() {
    registration()
}
