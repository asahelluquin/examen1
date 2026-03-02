package luquin.asahel.examen1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import luquin.asahel.examen1.R
import luquin.asahel.examen1.R.drawable.courseoff
import luquin.asahel.examen1.R.drawable.giraf
import luquin.asahel.examen1.ui.theme.MuseoFontFamily


@Composable
fun pantalla2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0FAF0)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                "Onion Math",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = MuseoFontFamily,
                textAlign = TextAlign.Center,
                color = Color(0xFF333333)
            )
        }

        Box(modifier = Modifier.weight(4f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pp),
                    contentDescription = "Foto de perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(100.dp).clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    "kyzamiz",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = MuseoFontFamily,
                    color = Color(0xA4000000)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    "Grade 4",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                    color = Color(0x56000000)
                )
            }
        }

        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Button(
                onClick = {},
                modifier = Modifier.size(300.dp, 50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFEEF8EF))
            ) {
                Text(
                    text = "Deadline is coming!",
                    textAlign = TextAlign.Center,
                    fontFamily = MuseoFontFamily,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0x7E333333)
                )
            }
        }

        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f))
                Box(modifier = Modifier.weight(4f)) {
                    Text(
                        "Learning",
                        fontFamily = MuseoFontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Start,
                        color = Color(0xFF404040)
                    )
                }
                Box(modifier = Modifier.weight(9f))
            }
        }

        Box(modifier = Modifier.weight(6f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Card(
                modifier = Modifier.fillMaxWidth(0.95f).fillMaxHeight(0.95f),
                shape = RoundedCornerShape(25.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF9191FB))
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.align(Alignment.CenterStart).padding(start = 20.dp)) {
                        Text(
                            "Autumn Term",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF0FAF0)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            "Week 1",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(0xFFF0FAF0)
                        )
                        Spacer(modifier = Modifier.height(25.dp))
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color(0xFF9070FF))
                        ) {
                            Text("Start")
                        }
                    }
                    Image(
                        painter = painterResource(id = giraf),
                        contentDescription = "Foto jirafa",
                        modifier = Modifier.padding(10.dp).size(150.dp).align(Alignment.BottomEnd)
                    )
                }
            }
        }

        Box(modifier = Modifier.weight(6f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Card(
                modifier = Modifier.fillMaxWidth(0.95f).fillMaxHeight(0.95f),
                shape = RoundedCornerShape(25.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF64D2FD))
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.align(Alignment.CenterStart).padding(start = 20.dp)) {
                        Text(
                            "Try for 7 days",
                            fontSize = 28.sp,
                            fontFamily = MuseoFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF0FAF0)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            "Day 2",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(0xFFF0FAF0)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color(0xFF50F0FF))
                        ) {
                            Text("Start")
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.penguin),
                        contentDescription = null,
                        modifier = Modifier.padding(10.dp).size(150.dp).align(Alignment.BottomEnd)
                    )
                }
            }
        }

        Box(modifier = Modifier.weight(2f).fillMaxSize().background(Color(0xFFFDFDFD)), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = courseoff),
                        contentDescription = "Seccion courses",
                        modifier = Modifier.size(70.dp)
                    )
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.me_on),
                        contentDescription = "Seccion me",
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun previewpantalla2() {
    pantalla2()
}
