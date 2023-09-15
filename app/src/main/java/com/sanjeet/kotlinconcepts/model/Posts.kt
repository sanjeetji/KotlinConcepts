package com.sanjeet.kotlinconcepts.model

import com.sanjeet.kotlinconcepts.database.entity.PostItem

data class Posts(
    val postItems:List<PostItem>
)