package com.sanjeet.kotlinconcepts.database.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "PostItem")
data class PostItem(
    @PrimaryKey
    val id: Int,
    val body: String,
    val title: String,
    val userId: Int
): Parcelable