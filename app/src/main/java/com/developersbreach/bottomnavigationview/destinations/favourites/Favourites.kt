package com.developersbreach.bottomnavigationview.destinations.favourites

data class Favourites(
    val albumName: String,
    val songName: String
) {
    companion object{
        fun favourites(): List<Favourites> {
            return listOf(
                Favourites("Ultraviolence", "Shades of cool"),
                Favourites("Born to Die", "Blue Jeans"),
                Favourites("Rebel heart", "Devil pray"),
                Favourites("Positions", "Motive"),
                Favourites("2012", "Blank Space"),
                Favourites("fearless", "Change"),
                Favourites("Speak Now", "Sparks fly"),
                Favourites("Blue Banisters", "Text Book"),
                Favourites("PinkFriday", "Roman's Revenge")
            )
        }
    }
}