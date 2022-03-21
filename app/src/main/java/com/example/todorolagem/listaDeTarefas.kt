package com.example.todorolagem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todorolagem.Adapter.adapter
import com.example.todorolagem.model.tarefa

class listaDeTarefas: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista_de_tarefas, container, false)
        val listAtividades = mutableListOf(
            tarefa("Limpar a Casa",
            "Iniciar na parte da manhã",
            "Henrique", "2022 - 21 - 03",
            true, "Dia a dia"),

            tarefa("Ir ao parque",
                "Encontrar com o pessoal no metro",
                "Henrique",
                "2022 - 26 - 03",
                false, "Lazer")
        )


        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)



        val adapter = adapter()


        recyclerTarefa.layoutManager = LinearLayoutManager(context)


        recyclerTarefa.adapter = adapter


        recyclerTarefa.setHasFixedSize(true)


        var listTarefas : String
        adapter.setLista(listAtividades)
        return inflater.inflate(R.layout.fragment_lista_de_tarefas, container, false)

    }

}

