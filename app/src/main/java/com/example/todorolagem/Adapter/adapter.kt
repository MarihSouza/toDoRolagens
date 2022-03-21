package com.example.todorolagem.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todorolagem.R
import com.example.todorolagem.model.tarefa

class adapter :  RecyclerView.Adapter<adapter.TarefaViewHolder>(){

    private var listTarefas = emptyList<tarefa>()

    class TarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val textNome = view.findViewById<TextView>(R.id.nomeTarefa)
        val textDescricao = view.findViewById<TextView>(R.id.descricao)
        val textResponsavel = view.findViewById<TextView>(R.id.responsavel)
        val textData = view.findViewById<TextView>(R.id.data)
        val switchCardAtivo = view.findViewById<Switch>(R.id.andamento)
        val textCategoria = view.findViewById<TextView>(R.id.categoria)
        val buttonDeletar = view.findViewById<Button>(R.id.deletarTarefa)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {


        val layout =LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview, parent, false)

        return TarefaViewHolder(layout)
    }


    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

        val tarefa = listTarefas[position]

        holder.textNome.text = tarefa.nome
        holder.textDescricao.text = tarefa.descricao
        holder.textResponsavel.text = tarefa.responsavel
        holder.textData.text = tarefa.data
        holder.switchCardAtivo.isChecked = tarefa.andamento
        holder.textCategoria.text = tarefa.categoria

    }

    override fun getItemCount(): Int {
        return listTarefas.size
    }

    fun setLista(lista: List<tarefa>){
        listTarefas = lista
        notifyDataSetChanged()
    }
}