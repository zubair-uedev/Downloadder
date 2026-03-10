import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.downloadder.presentation.textfieldviewmodel.TextRepeatViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun TextRepeatScreen(viewModel: TextRepeatViewModel = koinViewModel()) {
    val state by viewModel.state.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {

        OutlinedTextField(
            value = state.text,
            onValueChange = { value ->
                viewModel.updateText(value)
            },
            label = {
                Text("Enter Text")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = state.count,
            onValueChange = { value ->
                viewModel.updateCount(value)
            },
            label = {
                Text("Repetition")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = state.isNewLine,
                onCheckedChange = { checked ->
                    viewModel.updateCheck(checked)
                }
            )
            Text("Repeat in new line")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                viewModel.generateText()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Repeat Text")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxWidth()

        ) {

            if (state.isNewLine) {

                LazyColumn(
                    modifier = Modifier
                        .height(300.dp)
                        .padding(16.dp)

                ) {

                    items(state.result) { item ->
                        Text(item)

                    }

                }

            } else {

                Text(

                    text = state.result.joinToString(" "),

                    modifier = Modifier.padding(16.dp)

                )

            }

        }

    }

}