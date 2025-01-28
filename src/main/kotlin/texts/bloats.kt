package texts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tools.downloadTools

@Composable

fun bloatsText() {
	Column (
		modifier = Modifier.offset(x = (-10).dp)
	){
				Text(text = "Blaots",
					 fontSize = 25.sp,
 	  				 fontWeight = FontWeight.Bold,
 				     fontStyle = FontStyle.Italic)
				Button(onClick = { downloadTools() }) { Text("Download Tools")}
			}
}