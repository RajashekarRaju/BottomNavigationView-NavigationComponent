package com.example.bottomnavigationbar.destinations.favourites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationbar.R
import com.example.bottomnavigationbar.destinations.albums.Album
import com.example.bottomnavigationbar.destinations.albums.AlbumsAdapter


class FavouritesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.favourites_recycler_view)
        val adapter = FavouritesAdapter(Favourites.favourites())
        recyclerView.adapter = adapter
    }
}