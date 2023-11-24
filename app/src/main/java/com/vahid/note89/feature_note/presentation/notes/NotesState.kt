package com.vahid.note89.feature_note.presentation.notes

import com.vahid.note89.feature_note.domain.model.Note
import com.vahid.note89.feature_note.domain.util.NoteOrder
import com.vahid.note89.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> =emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
