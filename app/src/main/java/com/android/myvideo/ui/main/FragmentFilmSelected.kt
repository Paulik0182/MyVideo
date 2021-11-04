package com.android.myvideo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.android.myvideo.R
import com.android.myvideo.data.db.FilmRepository
import com.android.myvideo.databinding.ActivityMainBinding
import com.android.myvideo.databinding.FilmSelectedBinding

class FragmentFilmSelected : Fragment(R.layout.fragment_list_ditail) {

    private val binding by viewBinding(FilmSelectedBinding::bind)
//    private var _binding: FilmSelectedBinding? = null
//    private val binding get() = _binding!!

    companion object {
        val BUNDLE_EXTRA= "FilmRepository"

        private const val FILM_ID_EXTRA = "FILM_ID_EXTRA"
        fun newInstance(Bundle: Bundle): FragmentFilmSelected {
            val fragment = FragmentFilmSelected()
            fragment.arguments = Bundle
            return fragment
        }
    }

//    private var filmId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_list_ditail, container, false)
//    }

//        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//            super.onViewCreated(view, savedInstanceState)
//            _binding = FilmSelectedBinding.bind(view)
//        }

    override fun onStart() {
        super.onStart()
        binding.name.text = "My"
    }

//        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//            filmId = arguments?.getInt(Companion.FILM_ID_EXTRA) ?: 0
//            with(FilmRepository(filmId)) {
//                view.findViewById<TextView>(R.id.film_name).text = this.name
//                view.findViewById<TextView>(R.id.descr).text = this.descriptionDetail
//
//                initToolbar(this.name, this.imageID)
//            }
//        }

//        private fun initToolbar(name: String, imageID: Int) {
//            TODO()
//
//        }


//        override fun onDestroyView() {
//            super.onDestroyView()
//        }
//
//        override fun onDestroy() {
//            super.onDestroy()
//        }

}