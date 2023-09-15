package com.sanjeet.kotlinconcepts.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sanjeet.kotlinconcepts.database.dao.PostDao
import com.sanjeet.kotlinconcepts.database.entity.PostItem

@Database(entities = [PostItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun postDao(): PostDao
}