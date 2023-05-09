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

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    private val titles = arrayOf(
        "Gazpacho de cereza",
        "Pizza con masa de brócoli",
        "Ensalada de pollo y aguacate",
        "Salmón a la parrilla con espárragos",
        "Arroz integral con verduras",
        "Ensalada de quinoa y lentejas",
        "Tacos de pavo y aguacate"
    )

    private val details = arrayOf(
        "Tiempo: 20 minutos",
        "Tiempo: 30 minutos",
        "Tiempo: 15 minutos",
        "Tiempo: 15 minutos",
        "Tiempo: 30 minutos",
        "Tiempo: 20 minutos",
        "Tiempo: 25 minutos"
    )

    private val ingredients = arrayOf(
        "Ingredientes:\n" +
                "200 g de cerezas\n" +
                "1 kg de tomates pera\n" +
                "1 cebolleta o ½ cebolla½ pimiento verde italiano\n" +
                "1 diente de ajo\n" +
                "10 g de vinagre de jerez\n" +
                "100 g de miga de pan\n" +
                "100 g de Aceite de Oliva\n" +
                "Sal\n",
        "Ingredientes:\n" +
                "1 ramillete de brócoli\n" +
                "1 huevo\n" +
                "150 g queso rallado (cheddar, mozarella...)\n" +
                "Especias e ingredientes para la pizza al gusto\n",
        "Ingredientes:\n" +
                "1 pechuga de pollo cocida y desmenuzada\n" +
                "1 aguacate cortado en cubos\n" +
                "1 taza de tomates cherry cortados por la mitad\n" +
                "2 tazas de lechuga picada\n" +
                "1/2 pepino cortado en cubos\n" +
                "1/4 de cebolla picada\n" +
                "2 cucharadas de aceite de oliva\n" +
                "1 cucharada de vinagre balsámico\n" +
                "Sal y pimienta al gusto\n",
        "Ingredientes:\n" +
                "4 filetes de salmón\n" +
                "1 manojo de espárragos\n" +
                "2 cucharadas de aceite de oliva\n" +
                "Sal y pimienta al gusto\n",
        "Ingredientes:\n" +
                "1 taza de arroz integral\n" +
                "2 tazas de agua\n" +
                "1/2 taza de brócoli cortado en floretes\n" +
                "1/2 taza de zanahoria cortada en cubos\n" +
                "1/2 taza de cebolla picada\n" +
                "2 cucharadas de aceite de oliva\n" +
                "Sal y pimienta al gusto\n",
        "Ingredientes:\n" +
                "1 taza de quinoa cocida\n" +
                "1 taza de lentejas cocidas\n" +
                "1 taza de tomates cherry cortados por la mitad\n" +
                "1/2 pepino cortado en cubos\n" +
                "1/4 de cebolla picada\n" +
                "2 cucharadas de aceite de oliva\n" +
                "1 cucharada de vinagre balsámico\n" +
                "Sal y pimienta al gusto\n",
        "Ingredientes:\n" +
                "1/2 libra de pavo\n" +
                "1 aguacate cortado en cubos\n" +
                "1 taza de lechuga picada\n" +
                "1 taza de tomates cortados en cubos\n" +
                "1/4 de cebolla picada\n" +
                "Tortillas de maíz o hojas de lechuga para servir\n" +
                "2 cucharadas de aceite de oliva\n" +
                "1 cucharada de jugo de limón\n" +
                "Sal y pimienta al gusto\n"
        )

    private val steps = arrayOf(
        "Pasos:\n" + "1. Antes de nada, lavamos bien todos los ingredientes: los tomates, el pimiento, y las cerezas. Reservamos.\n"
        + "2. Cortamos los tomates en 4 o 6 trozos y los colocamos en un recipiente grande.\n" +
                "3. Picamos la cebolla y el pimiento en cuadraditos y los agregamos al recipiente.\n" +
                "4. Cortamos la miga de pan en cubos y la agregamos al recipiente junto con el ajo picado.\n" +
                "5. Agregamos el vinagre, el aceite de oliva y la sal al recipiente y removemos bien. Tapamos el recipiente con papel film y lo reservamos en la nevera por 3-8 horas.\n" +
                "6. En este tiempo, quitamos el hueso de las cerezas y las reservamos en la nevera.\n" +
                "7. Una vez que ha pasado el tiempo de maceración, trituramos la mezcla del recipiente en un robot de cocina. Agregamos las cerezas y seguimos triturando hasta obtener una textura deseada. Rectificamos de sal al gusto\n" +
                "8. Guardamos el gazpacho en un tupper o en tarros en la nevera hasta que esté bien frío.\n",
        "Pasos:\n" + "1. Precalentar el horno a 200°C." +
                "2. Triturar la masa de brócoli y mezclar con el huevo, el queso rallado y la sal.\n" +
                "3. Extender la mezcla sobre una bandeja para hornear y darle forma de pizza.\n" +
                "4. Hornear durante 15 minutos.\n" +
                "5. Agregar la salsa de tomate, queso mozzarella rallado y todo lo que quieras añadir a la pizza (jamón, cebolla...).\n" +
                "6. Hornear durante otros 10-15 minutos hasta que la pizza esté dorada y crujiente.\n" +
                "7. Servir caliente.",
        "Pasos:\n" +
        "1. En un tazón grande, mezcla el pollo cocido desmenuzado, el aguacate cortado en cubos, los tomates cherry cortados por la mitad, la lechuga picada, el pepino cortado en cubos y la cebolla picada.\n" +
                "2. Agrega el aceite de oliva, el vinagre balsámico, la sal y la pimienta al gusto y mezcla bien.",
        "Pasos:\n" +
                "1. Sazona los filetes de salmón con sal y pimienta.\n" +
                "2. Ásalos en la parrilla junto con los espárragos durante unos 8-10 minutos.",
        "Pasos:\n" +
                "1. Cocina el arroz integral.\n" +
                "2. Agrega vegetales como brócoli, zanahorias y cebolla salteados.",
        "Pasos: \n" +
                "1. Mezcla en un tazón quinoa cocida, lentejas, tomates cherry, pepino y cebolla.\n" +
                "2. Adereza con aceite de oliva y vinagre balsámico.",
        "Pasos:\n" +
                "1. En una sartén, cocina el pavo molido hasta que esté dorado.\n" +
                "2. Sirve en tortillas de maíz o lechuga con aguacate, lechuga, tomate y cebolla."
    )

    private val images = intArrayOf(
        R.drawable.gazpachocereza,
        R.drawable.pizzabrocoli,
        R.drawable.ensaladaaguapollo,
        R.drawable.salmonesparragos,
        R.drawable.arrozverduras,
        R.drawable.ensaladaquinejas,
        R.drawable.tacospavoaguacate,
    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardviewrecetas, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
        viewHolder.itemIngredients.text = ingredients[i]
        viewHolder.itemSteps.text = steps[i]

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemIngredients: TextView
        var itemSteps: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemIngredients = itemView.findViewById(R.id.item_moredetail)
            itemSteps = itemView.findViewById(R.id.item_steps)
        }
    }

    class RecetasActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            this.supportActionBar?.hide()
            setContentView(R.layout.activity_recetas)

            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            val adapter = CustomAdapter()

            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter


        }
    }
}
