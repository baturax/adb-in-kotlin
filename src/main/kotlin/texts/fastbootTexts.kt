package texts

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import tools.fastbootDevices

@Composable

fun fastbootTexts() { Column {
	Text(text = "FastBoot Tools",
		 fontSize = 25.sp,
		 fontWeight = FontWeight.Bold,
		 fontStyle = FontStyle.Italic
	)
	Button(onClick = { fastbootDevices() }) { Text("Fastboot Devices")}
}
}