package mx.itson.edu.e1lopezmarcos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import mx.itson.edu.e1lopezmarcos.ui.theme.E1LopezMarcosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_layout)
        val discountB: Button = findViewById(R.id.discountB)
        val tipB: Button = findViewById(R.id.tipB)
        val originalInp: EditText = findViewById(R.id.originalInp)
        val totalV: TextView = findViewById(R.id.totalV)
        val discountV: TextView = findViewById(R.id.porcentaje)
        val diezperB: Button = findViewById(R.id.diezper)
        val quinceperB: Button = findViewById(R.id.quinceper)
        val veinteperB: Button = findViewById(R.id.veinteper)
        val veinticincoperB: Button = findViewById(R.id.veinticincoper)
        val treintaperB: Button = findViewById(R.id.treintaper)
        val cuarentaperB: Button = findViewById(R.id.cuarentaper)

        var porcentaje = 0.0
        var total = 0.0
        var resultado = 0.0
        var original = 0.0


        diezperB.setOnClickListener {
            porcentaje = 10.0
        }

        quinceperB.setOnClickListener {
            porcentaje = 15.0
        }
        veinteperB.setOnClickListener {
            porcentaje = 20.0
        }

        veinticincoperB.setOnClickListener {
            porcentaje = 25.0
        }

        treintaperB.setOnClickListener {
            porcentaje = 30.0
        }

        cuarentaperB.setOnClickListener {
            porcentaje = 40.0
        }

        discountB.setOnClickListener{
            if(!originalInp.getText().isNullOrBlank()){
                original = originalInp.getText().toString().toDouble()
                if(porcentaje != 0.0){
                    resultado = original - (original*porcentaje/100)
                    discountV.setText((original*porcentaje/100).toString())
                    totalV.setText(resultado.toString())
                }
            }
        }

        tipB.setOnClickListener{
            if(!originalInp.getText().isNullOrBlank()) {
                original = originalInp.getText().toString().toDouble()
                if (porcentaje != 0.0) {
                    resultado = original + (original * porcentaje / 100)
                    discountV.setText((original * porcentaje / 100).toString())
                    totalV.setText(resultado.toString())
                }
            }
        }
    }
}