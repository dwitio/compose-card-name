package tgs.app.cardname

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tgs.app.cardname.ui.theme.CardNameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardNameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeCardName()
                }
            }
        }
    }
}

@Composable
fun ComposeCardName() {
    CardName(
        backgroundColor = Color(color = 0xFF003A4A),
        image = painterResource(id = R.drawable.android_logo),
        call = painterResource(id = R.drawable.ic_call),
        share = painterResource(id = R.drawable.ic_share),
        email = painterResource(id = R.drawable.ic_email)
    )
}

@Composable
fun CardName(
    backgroundColor: Color,
    image: Painter,
    call: Painter,
    share: Painter,
    email: Painter
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundColor),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                Modifier.width(100.dp)
            )
            Text(
                text = "Dwitio",
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                color = Color.White,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Android Developer Extraordinaire",
                textAlign = TextAlign.Center,
                color = Color(0xFF3DDC84),
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 30.dp, vertical = 14.dp),
        ) {
            Row(
                modifier = Modifier
                    .padding(bottom = 12.dp)
            ) {
                Image(painter = call, contentDescription = null, modifier = Modifier.padding(end = 18.dp))
                Text(text = "+6289658002843", color = Color.White)
            }
            Row(modifier = Modifier
                .padding(bottom = 12.dp)) {
                Image(painter = share, contentDescription = null, modifier = Modifier.padding(end = 18.dp))
                Text(text = "@AndroidDev", color = Color.White)
            }
            Row() {
                Image(painter = email, contentDescription = null, modifier = Modifier.padding(end = 18.dp))
                Text(text = "tiothebook@gmail.com", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardNameTheme {
        ComposeCardName()
    }
}