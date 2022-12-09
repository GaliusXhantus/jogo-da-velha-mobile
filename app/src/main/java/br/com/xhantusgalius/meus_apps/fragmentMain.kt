@file:Suppress("DEPRECATION")

package br.com.xhantusgalius.meus_apps

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import br.com.xhantusgalius.meus_apps.databinding.FragmentMainBinding


class fragmentMain : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var listButtons: List<Button>
    private var jogador = "x"
    private var arrayVencedor: List<List<Int>> = listOf(
        0, 1, 2,
        3, 4, 5,
        6, 7, 8,
        0, 3, 6,
        1, 4, 7,
        2, 5, 8,
        0, 4, 8,
        2, 4, 6
    ).windowed(3, 3)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        listButtons = listOf(binding.button1, binding.button2, binding.button3, binding.button4,
            binding.button5, binding.button6, binding.button7, binding.button8, binding.button9)

        jogo()

        setHasOptionsMenu(true)
        return binding.root
    }


    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


    private fun resetarTela() {
        binding.resetar.setOnClickListener{
            finalDoJogo()
        }
    }

    private fun jogo(){
        for (button in listButtons){
            button.setOnClickListener{
                if (button.text == ""){
                    button.text = jogador
                    trocarJogador()
                    mostrarJogador()
                    vencedor()
                    resetarTela()
                }
            }
        }
    }

    private fun trocarJogador(){
        if(jogador == "x"){
            jogador = "o"
        }
        else{
            jogador = "x"
        }
    }

    private fun mostrarJogador(){
        binding.apply{
            binding.nomeJogador.text = jogador
        }
    }

    private fun vencedor() {
        val vencedor = arrayVencedor.any{ array ->
            array.all{linha ->
                listButtons[linha].text.toString().equals(jogador)
            }
        }
        if(vencedor){
            finalDoJogo()
        }
        else return
    }

    private fun finalDoJogo() {
        jogador = "x"
        mostrarJogador()
        for (button in listButtons){
            button.text = ""
        }
    }

}
