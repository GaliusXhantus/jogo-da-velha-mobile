package br.com.xhantusgalius.meus_apps

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import br.com.xhantusgalius.meus_apps.databinding.FragmentSobreBinding


class fragmentSobre : Fragment() {

    private lateinit var binding: FragmentSobreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sobre, container, false)

        return binding.root
    }
}

