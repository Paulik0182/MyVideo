package com.android.myvideo.data.db

interface Repository {
    fun getFilmRepositoryFromServer(): FilmRepository

}