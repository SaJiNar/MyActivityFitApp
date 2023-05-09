package com.example.aplicacionesjuntas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter2 : RecyclerView.Adapter<CustomAdapter2.ViewHolder>() {


    private val titles2 = arrayOf(
        "Subir Escaleras",
        "Estocadas",
        "Las Zancadas",
        "Sentadillas con apoyo en la pared",
        "El escalador",
        "Flexiones de rodillas",
        "Flexiones con toque de rodilla"

        )

    private val detail2 = arrayOf(
        "Este ejercicio se hace en el gimnasio con una escalera mecánica, pero no te preocupes, porque en casa también lo podrás hacer si tu hogar es de dos pisos. Para ello, puedes subir y bajar las escaleras, haz tres series de 15 repeticiones cada una.  Otra alternativa es colocar una silla: sube totalmente y para en ella y luego baja cuidadosamente para evitar cualquier accidente\n" +
                "Si te da un poco de miedo puedes optar por un banco más bajo y empezar allí y poco a poco ir adquiriendo más confianza hasta hacerlo con la silla. Este ejercicio te ayuda a fortalecer las piernas y glúteos.",
        "De pie y con las piernas juntas, da un paso hacia adelante, flexiona la rodilla y asegúrate de que el pie se encuentre bien apoyado en el suelo. Luego, baja todo tu cuerpo; la espalda y las caderas tienen que estar derechas mientras que con la rodilla de la otra pierna tratas de tocar el suelo. Mantén el equilibrio apretando los músculos abdominales, y luego cambia de pierna.\n" +
                "Puedes hacer tres series de 12 a 15 repeticiones, esto te permite trabajar todo el tren inferior y así llegar a desarrollar unas piernas bien definidas.",
        "Las zancadas, o lunges, como también se las conoce, constituyen un ejercicio mediante el cual trabajas los cuádriceps, los glúteos y los isquiotibiales (músculos que se encuentran por debajo de los glúteos), además ayuda a fortalecer el abdomen.\n" +
                "De pie con las manos apoyadas en la cintura y las piernas un poco separadas a la misma distancia de los hombros, da un paso hacia adelante, manteniendo el tronco recto. El paso dado no debe ser muy amplio, solo lo suficiente para que la pierna se mueva hacia adelante; el pie que avanza debe ser apoyado completamente en el suelo y la pierna que queda atrás debe doblarse hasta tocar ligeramente el suelo con la punta del pie. Expiramos y volvemos a la posición inicial y cambiamos de lado.",
        "Con esta opción estás trabajando la espalda y las piernas. Colócate apoyado en una pared y mantén la espalda muy recta y las piernas en un ángulo de 90 grados, baja y conserva esta posición por 30 segundos. Haz tres series.",
        "Es un buen ejercicio para fortalecer los brazos, y una de las rutinas de ejercicios a realizar en casa más fáciles.\n" +
                "Colócate en el suelo con los brazos y palmas de las manos apoyadas en el piso; el cuerpo tiene que permanecer completamente recto. Coloca las piernas hacia atrás con las puntas de los pies apoyados en el suelo, dobla la pierna derecha y lleva la rodilla hacia tu pecho, mientras que la otra pierna permanece recta y el abdomen permanece contraído.\n" +
                "Luego, vuelve a la posición inicial y se realiza con la pierna izquierda. Haz tres set con 15 repeticiones cada una.",
        "Coloca una colchoneta en el suelo y túmbate boca abajo, apoya las palmas de las manos conservando la anchura de los hombros. Las piernas se cruzan, los pies se levantan y todo el apoyo recae en las rodillas. Se flexionan los codos y se baja el torso, hasta que la punta de la barbilla toque el suelo.\n" +
                "Luego, regresa a la posición inicial y vuelve a repetir entre 10 a 15 veces.",
        "Este ejercicio es otra variante de las flexiones de brazos o planchas, y consiste en colocarse boca abajo en el suelo, con brazos y piernas extendidas, manos y punta de pies apoyados en el suelo, y espalda completamente recta. Flexiona los brazos hasta llegar al suelo y al subir tocarse el hombro derecho con la mano izquierda, al volver a repetir el procedimiento se toca el hombro izquierdo con la mano derecha. Se pueden hacer tres series con 10 a 12 repeticiones."
        )


    override fun onCreateViewHolder(viewGroup: ViewGroup, r: Int): ViewHolder {
        val x = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardviewrutinas, viewGroup, false)
        return ViewHolder(x)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, r: Int) {
        viewHolder.itemTitle2.text = titles2[r]
        viewHolder.itemDetail2.text = detail2[r]

    }

    override fun getItemCount(): Int {
        return titles2.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle2: TextView
        var itemDetail2: TextView

        init {
            itemTitle2 = itemView.findViewById(R.id.item_title2)
            itemDetail2 = itemView.findViewById(R.id.item_detail2)
        }
    }

}

class RutinasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_rutinas)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter2()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
