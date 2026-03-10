package com.example.downloadder.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShowAllComposeFn() {
    val isDetailValueVisible = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (isDetailValueVisible.value) {
            CheckCompose() {
                isDetailValueVisible.value = false
            }
        } else {
            CheckCompose2() {
                isDetailValueVisible.value = true
            }
        }
        Spacer(modifier = Modifier.height(20.dp)) //

    }

}


@Composable
fun CheckCompose(function: () -> Unit) {



    val counter = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()   //
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Log.d("cvv", "CheckCompose: start")

        LaunchedEffect(Unit) {
            Log.d("cvv", "CheckCompose: LaunchedEffect")
        }

        SideEffect {
            Log.d("cvv", "CheckCompose: SideEffect")
        }

        DisposableEffect(Unit) {
            onDispose {
                Log.d("cvv", "CheckCompose: Disposed")
            }
        }

        Text(text = "${counter.value}")

        Button(
            onClick = { function() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Increment compose1")
        }

        Log.d("cvv", "CheckCompose: end")
    }
}


@Composable
fun CheckCompose2(function: () -> Unit) {
    val counter = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()   // ✅ FIXED
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Log.d("cvv", "CheckCompose2: start")

        LaunchedEffect(Unit) {
            Log.d("cvv", "CheckCompose2: LaunchedEffect")
        }

        SideEffect {
            Log.d("cvv", "CheckCompose2: SideEffect")
        }

        DisposableEffect(Unit) {
            onDispose {
                Log.d("cvv", "CheckCompose2: Disposed")
            }
        }

        Text(text = "${counter.value}")

        Button(
            onClick = {
                function()
                counter.value++
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Increment compose2")
        }

        Log.d("cvv", "CheckCompose2: end")
    }
}
