package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {

    private lateinit var binding:FragmentMovieBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val Movies = listOf(
        Movie("The Shawshank Redemption","Frank Darabont"),
        Movie("The godfather","Francis Ford Coppola"),
        Movie("Pulp fiction","Quentin tarantino")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        MovieRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(Movies)
        MovieRecycler.adapter=adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = MovieFragment()
    }
}