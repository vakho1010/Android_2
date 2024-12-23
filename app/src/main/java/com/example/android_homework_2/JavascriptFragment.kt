package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentJavaBinding
import com.example.android_homework_2.databinding.FragmentJavascriptBinding

class JavascriptFragment : Fragment() {


    private lateinit var binding: FragmentJavascriptBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val JavascriptCourse = listOf(
        Course("Module 1", "Beginner level", "22 Themes","12 weeks", 200),
        Course("Module 2", "Intermediate level", "33 Themes","14 weeks", 400),
        Course("Module 3", "Advanced level", "27 Themes","20 weeks", 600)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJavascriptBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        JavascriptRecycler.layoutManager = LinearLayoutManager(activity)
        adapter= RecyclerViewAdapter(JavascriptCourse)
        JavascriptRecycler.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = JavascriptFragment()
    }
}