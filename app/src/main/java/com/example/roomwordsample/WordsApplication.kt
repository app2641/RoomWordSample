package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.db.WordRoomDatabase
import com.example.roomwordsample.db.repositories.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDatabase(this, this.applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}