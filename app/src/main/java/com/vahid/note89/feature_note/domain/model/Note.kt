package com.vahid.note89.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vahid.note89.ui.theme.BabyBlue
import com.vahid.note89.ui.theme.LightGreen
import com.vahid.note89.ui.theme.RedOrange
import com.vahid.note89.ui.theme.RedPink
import com.vahid.note89.ui.theme.Violet
import java.sql.Timestamp

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)