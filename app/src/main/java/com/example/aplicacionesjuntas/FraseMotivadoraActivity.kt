package com.example.aplicacionesjuntas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class FraseMotivadoraActivity : AppCompatActivity() {

    private lateinit var mQuoteTextView: TextView
    private lateinit var mNextButton: Button

    private val mQuotes = arrayOf(
        "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.",
        "El fracaso es solo la oportunidad de comenzar de nuevo, pero esta vez de manera más inteligente.",
        "El éxito no es definitivo, el fracaso no es fatal: lo que cuenta es el coraje para continuar.",
        "No es la altura, ni el peso, ni los músculos, ni la belleza que nos hacen grandes, es el corazón.",
        "La verdadera felicidad proviene del interior, no es necesario buscarla afuera.",
        "Si no te gusta algo, cámbialo. Si no lo puedes cambiar, cambia tu actitud.",
        "A veces las cosas malas que nos suceden en la vida nos colocan directamente en el camino hacia las mejores cosas que nos pueden pasar.",
        "Aprende a escuchar. La oportunidad quizá golpee solo una vez.",
        "El éxito en la vida se mide no por lo que has logrado, sino por los obstáculos que has superado.",
        "La única forma de hacer un gran trabajo es amando lo que haces.",
        "La salud es riqueza.",
        "La vida es como andar en bicicleta, para mantener el equilibrio, tienes que seguir moviéndote.",
        "El éxito en la vida depende de la buena salud: la mente y el cuerpo trabajan juntos sin interrupción.",
        "Cuida tu cuerpo, es el único lugar que tienes para vivir.",
        "Tu cuerpo es tu templo. Mantenlo puro y limpio para la alma que mora en él.",
        "La salud no es algo que puedas comprar, pero puede ser una cuenta de ahorros extremadamente valiosa.",
        "Cada día hago elecciones saludables porque respeto a mi cuerpo y valoro mi bienestar.",
        "La mejor inversión que puedes hacer es en tu propia salud.",
        "La salud es la mayor riqueza, la felicidad es el mayor tesoro, la fe es el mejor amigo.",
        "El éxito no es solo lo que ves en la superficie, sino también lo que haces por tu cuerpo todos los días.",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase)

        mQuoteTextView = findViewById(R.id.frase_textview)
        mNextButton = findViewById(R.id.next_button)

        mNextButton.setOnClickListener {
            // Generar una nueva frase al azar
            val random = Random()
            val index = random.nextInt(mQuotes.size)
            val quote = mQuotes[index]

            // Mostrar la nueva frase en el TextView
            mQuoteTextView.text = quote
        }
    }
}


