package luquin.asahel.examen1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import luquin.asahel.examen1.R
import luquin.asahel.examen1.R.drawable.giraf
import luquin.asahel.examen1.R.drawable.penguin
import luquin.asahel.examen1.R.drawable.ran
import luquin.asahel.examen1.ui.theme.MuseoFontFamily


@Composable
fun Pantalla1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0FAF0)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                "Onion Math",
                fontFamily = MuseoFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = Color(0xFF3F3E3E)
            )
        }

        Box(modifier = Modifier.weight(2f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.pp),
                        contentDescription = "profile pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(55.dp).clip(CircleShape)
                    )
                }

                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Spacer(modifier = Modifier.height(25.dp))
                        Text("kyzamiz", fontFamily = MuseoFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Normal, color = Color(0xFF0A0A0A))
                        Spacer(modifier = Modifier.height(5.dp))
                        Text("Grade 4", fontSize = 16.sp, fontWeight = FontWeight.Light, color = Color(0xFF474847))
                    }
                }

                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {}

                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color(0xFFEEF8EF))) {
                        Text(
                            "Grade",
                            fontFamily = MuseoFontFamily,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF4D4B4B)
                        )
                    }
                }
            }
        }

        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f))
                Box(modifier = Modifier.weight(3f)) {
                    Text("Start", fontFamily = MuseoFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                }
                Box(modifier = Modifier.weight(10f))
            }
        }

        Box(modifier = Modifier.weight(6f).fillMaxWidth(), contentAlignment = Alignment.Center) {
            Card(
                modifier = Modifier.fillMaxWidth(0.9f).fillMaxHeight(0.8f),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFA9DB35))
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.align(Alignment.CenterStart).padding(start = 33.dp)) {
                        Text("Numbers", fontFamily = MuseoFontFamily, fontSize = 28.sp, fontWeight = FontWeight.ExtraBold, color = Color(0xFFF0FAF0))
                     //   Image(painter = painterResource(id = hoj), contentDescription = "leaf", modifier = Modifier.size(60.dp))
                        Spacer(modifier = Modifier.height(5.dp))
                        Text("Hello cuddly numbers!", fontSize = 13.sp, fontWeight = FontWeight.Normal, color = Color(0xFFF0FAF0))
                        Spacer(modifier = Modifier.height(25.dp))
                        Button(onClick = {}, shape = RoundedCornerShape(50), colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color(0xFFA8DA35))) {
                            Text("Start", fontFamily = MuseoFontFamily)
                        }
                    }
                    Image(painter = painterResource(id = ran), contentDescription = "rana", modifier = Modifier.size(180.dp).align(Alignment.CenterEnd))
                }
            }
        }

        Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f))
                Box(modifier = Modifier.weight(4f)) {
                    Text("Courses", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color(0xFF404040))
                }
                Box(modifier = Modifier.weight(9f))
            }
        }

        Box(modifier = Modifier.weight(3f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = penguin),
                        contentDescription = "penguin",
                        modifier = Modifier.size(120.dp).clip(RoundedCornerShape(25.dp)).clickable { }.padding(8.dp)
                    )
                }
                Box(modifier = Modifier.weight(1.5f), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
                        Text("Try for 7 Days", fontFamily = MuseoFontFamily, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF404040))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text("Start on Aug. 1st", fontFamily = MuseoFontFamily, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color(0xFF606060))
                    }
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("¥9.9", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color(
                            0xFFEF887F
                        )

                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text("¥98", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFFA0A0A0), textDecoration = TextDecoration.LineThrough)
                    }
                }
            }
        }

        Box(modifier = Modifier.weight(3f).fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = giraf),
                        contentDescription = "giraffe",
                        modifier = Modifier.size(120.dp).clip(RoundedCornerShape(25.dp)).clickable { }.padding(8.dp)
                    )
                }
                Box(modifier = Modifier.weight(1.5f), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
                        Text(
                            "Autumn Term",
                            fontFamily = MuseoFontFamily,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF404040)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            "Start on Sep. 1st",
                            fontFamily = MuseoFontFamily,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF606060)
                        )
                    }
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "¥398",
                            fontSize = 30.sp,
                            fontFamily = MuseoFontFamily, fontWeight = FontWeight.Bold,
                            color = Color(0xFFEF887F)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            "¥1280",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFA0A0A0),
                            textDecoration = TextDecoration.LineThrough
                        )
                    }
                }
            }
        }

        Box(modifier = Modifier.weight(2f).fillMaxSize().background(Color(0xFFF8FDF9)), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(painter = painterResource(id = R.drawable.courseon), contentDescription = "courses", modifier = Modifier.size(70.dp))
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Image(painter = painterResource(id = R.drawable.meoff), contentDescription = "me", modifier = Modifier.size(60.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla1() {
    Pantalla1()
}
