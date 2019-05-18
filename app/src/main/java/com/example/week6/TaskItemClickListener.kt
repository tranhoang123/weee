package com.example.week6

import java.text.FieldPosition

interface TaskItemClickListener {
    fun onItemClicked(position: Int)
    fun onItemLongClicked(position: Int)
}