package com.example.bottomnavigationbar.destinations.albums

data class Album(
    val name: String
) {
    companion object{
        fun albumList(): List<Album> {
            val list = listOf(
                Album("Ultraviolence"),
                Album("Born to Die"),
                Album("Rebel heart"),
                Album("Positions"),
                Album("2012"),
                Album("fearless"),
                Album("Speak Now"),
                Album("Blue Banisters"),
                Album("Pink"),
                Album("Paradise")
            )
            return list
        }
    }
}