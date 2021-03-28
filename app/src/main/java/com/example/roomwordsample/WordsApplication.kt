package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.db.WordRoomDatabase
import com.example.roomwordsample.db.repositories.WordRepository

class WordsApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}