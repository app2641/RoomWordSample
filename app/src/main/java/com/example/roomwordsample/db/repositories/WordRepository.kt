package com.example.roomwordsample.db.repositories

import androidx.annotation.WorkerThread
import com.example.roomwordsample.db.dao.WordDao
import com.example.roomwordsample.db.entities.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}