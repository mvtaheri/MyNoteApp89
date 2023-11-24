package com.vahid.note89.feature_note.domain.use_case

import com.vahid.note89.feature_note.domain.model.Note
import com.vahid.note89.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
   operator suspend fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}