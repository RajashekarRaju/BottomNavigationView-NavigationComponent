package com.developersbreach.bottomnavigationview.destinations.albums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationview.R

class AlbumsAdapter : RecyclerView.Adapter<AlbumsAdapter.AlbumViewHolder>() {

    private val albumList = Album.albumList()

    class AlbumViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val nameTextView: TextView = itemView.findViewById(R.id.item_album_name)
        private val artistTextView: TextView = itemView.findViewById(R.id.item_artist_name)

        fun bind(album: Album) {
            nameTextView.text = album.name
            artistTextView.text = album.artist
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlbumViewHolder {
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_album, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album: Album = albumList[position]
        holder.bind(album)
    }

    override fun getItemCount() = albumList.size
}