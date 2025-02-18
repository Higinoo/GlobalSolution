package br.com.fiap.atividade.telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.teste3.R

@Composable
fun FerramentasTela() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        color = MaterialTheme.colorScheme.background

    ) {
        Image(
            painter = painterResource(id = R.drawable.oceani1),
            contentDescription = "Wallpaper",
            contentScale = ContentScale.Crop

        )
        Column(
            modifier = Modifier
                .padding(8.dp)
                .offset(y = 250.dp)
                .verticalScroll(ScrollState(0))
                .fillMaxWidth()
                .height(450.dp)


        )


        {
            Text(
                text = "",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Left
            )
            Column(
                modifier = Modifier
                    .verticalScroll(ScrollState(0))
                    .fillMaxWidth()
                    .height(450.dp)
                    .padding(16.dp)
            )
            {//Denuncia
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(top = 8.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0x860C0C0C)
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        Color.White
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Card(
                            modifier = Modifier
                                .size(
                                    width = 80.dp,
                                    height = 80.dp
                                ),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.denuncia1),
                                contentDescription = "Wallpaper",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    vertical = 16.dp,
                                    horizontal = 16.dp
                                )
                        ) {
                            Text(
                                text = "Denuncia",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "Faça uma denuncia do local!",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "Acione ongs ou autoridade.",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }
                    }
                }
                Column {//Monitoramento


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.monitoramento),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Monitoramento",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Monitore denuncias",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Veja em tempo real.",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                Column {//Rotas


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.rotas),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Relatorios",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Acompanhe os relatorios enviados",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Acompanhe historico.",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Column {//Clima


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.clima),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Clima",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Confira a previsão",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Dias e Horarios",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
@Preview
@Composable
fun vertela() {
    FerramentasTela()

}

