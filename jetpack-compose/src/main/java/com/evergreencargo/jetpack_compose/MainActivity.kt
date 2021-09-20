package com.evergreencargo.jetpack_compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        setContent {
            HelloScreen()
        }
    }
}

@Composable
fun HelloScreen() {
    Column {
        var name  = ""
        Text(text = "Hello, ${name}")
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
    }
}

//@Composable
//fun NewsStory() {
//    val image = imageResource(R.drawable.header)
//    MaterialTheme {
//        val typography = MaterialTheme.typography
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            val imageModifier = Modifier
//                .preferredHeight(180.dp)
//                .fillMaxWidth()
//                .clip(shape = RoundedCornerShape(4.dp))
//
//            Image(
//                image, modifier = imageModifier,
//                contentScale = ContentScale.Crop
//            )
//            Spacer(Modifier.preferredHeight(16.dp))
//
//            Text(
//                "A day wandering through the sandhills " +
//                        "in Shark Fin Cove, and a few of the " +
//                        "sights I saw.I dont why,byeeeeeeeeeeeeeeee",
//                style = typography.h6,
//                maxLines = 2
//            )
//            Text(
//                "Davenport, California",
//                style = typography.body2,
//                maxLines = 2
//            )
//            Text(
//                "December 2018",
//                style = typography.body2
//            )
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun NewsStoryPreview(){
//    NewsStory()
//}