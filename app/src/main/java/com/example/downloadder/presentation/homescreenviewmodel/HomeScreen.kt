package com.example.downloadder.presentation.homescreenviewmodel

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.downloadder.R
import com.example.downloadder.domain.EmplyeData
import org.koin.androidx.compose.koinViewModel
import androidx.compose.foundation.lazy.items


@Composable
fun HomeScreen(viewModel: HomeScreenViewModel = koinViewModel()) {
    val userList by viewModel.getAllData().collectAsState(initial = emptyList())

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(
            text = "Enter Employee All Detail", modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontSize = 15.sp,
            textAlign = TextAlign.Center

        )
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = name,
                onValueChange = { name = it },
                placeholder = { Text("Enter your name") }
            )
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = age,
                onValueChange = { age = it },
                placeholder = { Text("Enter your age") }
            )
            Spacer(Modifier.height(12.dp))

            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = id,
                onValueChange = { id = it },
                placeholder = { Text("Enter your id ") }
            )
            Spacer(Modifier.height(12.dp))
            Row {
                Button(onClick = {
                    val ageInt = age.toIntOrNull()
                    val idInt = id.toIntOrNull()

                    if (name.isNotEmpty() && ageInt != null && idInt != null) {
                        val obj = EmplyeData(name = name, age = ageInt, id = idInt)
                        viewModel.insertData(obj)

                        name = ""
                        age = ""
                        id = ""
                    }
                }) {
                    Text("Save Employee")
                }

                Spacer(Modifier.width(12.dp))

                Button(onClick = {
                    val ageInt = age.toIntOrNull()
                    val idInt = id.toIntOrNull()

                    if (name.isNotEmpty() && ageInt != null && idInt != null) {
                        val update = EmplyeData(name = name, age = ageInt, id = idInt)
                        viewModel.updateData(update)

                        name = ""
                        age = ""
                        id = ""
                    }
                }) {
                    Text("Update Employee")
                }
            }


        }
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        ) {
            items(userList) { user ->
                EmployeeItem(
                    modifier = Modifier.padding(8.dp),
                    id = user.id,
                    name = user.name,
                    age = user.age,
                    onDelete = { viewModel.deleteById(user.id) }
                )
            }
        }

    }
}

@Composable
fun EmployeeItem(
    modifier: Modifier = Modifier,
    id: Int,
    name: String,
    age: Int,
    onDelete: (Int) -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .border(width = 1.dp, color = Color.Yellow, shape = RoundedCornerShape(12.dp))
            .padding(horizontal = 12.dp)
            .padding(top = 8.dp, bottom = 8.dp)
            .fillMaxWidth()
    ) {

        Column(modifier = Modifier.weight(1f)) {
            Text(name, style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.height(12.dp))
            Text(age.toString(), style = MaterialTheme.typography.bodyLarge)
        }

        IconButton(onClick = { onDelete(id) }) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
        }
    }
}