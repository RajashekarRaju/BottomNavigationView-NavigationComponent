package com.developersbreach.bottomnavigationview.destinations.albums

data class Album(
    val name: String,
    val artist: String
) {
    companion object{
        fun albumList(): List<Album> {
            return listOf(
                Album("Ultraviolence", "Lana Del Rey"),
                Album("21", "Adele"),
                Album("Born to Die", "Lana Del Rey"),
                Album("Rebel heart", "Madonna"),
                Album("Sound & Color", "Alabama Shakes"),
                Album("Positions", "Ariana Grande"),
                Album("2012", "Taylor Swift"),
                Album("One Twice Melody", "Beach House"),
                Album("Speak Now", "Taylor Swift"),
                Album("Blue Banisters", "Lana Del Rey"),
                Album("Paradise", "Lana Del Rey")
            )
        }
    }
}