package masson.jorge.misnotas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MainActivity : AppCompatActivity() {
    var notas = ArrayList<Nota>()
    lateinit var adaptador: AdaptadorNotas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notasDePrueba()

        adaptador = AdaptadorNotas(this, notas)
        listview.adapter = adaptador
    }

    fun notasDePrueba() {
        notas.add(Nota("prueba 1", "Contenido de la nota 1"))
        notas.add(Nota("prueba 2", "Contenido de la nota 2"))
        notas.add(Nota("prueba 3", "Contenido de la nota 3"))
    }

}

