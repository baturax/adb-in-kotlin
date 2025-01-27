import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import texts.adbTexts
import texts.bloatsText
import texts.fastbootTexts

@Composable
fun Texts(){
	MaterialTheme {
		Row(
			modifier = Modifier.fillMaxWidth(),
			horizontalArrangement = Arrangement.SpaceBetween
		) { // main menu
			adbTexts()
			fastbootTexts()
			bloatsText()
		}
	}
}
//deneme