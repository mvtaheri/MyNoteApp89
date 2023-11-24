package com.vahid.note89.feature_note.domain.use_case

import com.vahid.note89.feature_note.domain.model.InvalidNoteException
import com.vahid.note89.feature_note.domain.model.Note
import com.vahid.note89.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The Title Note Can Not be Empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The Content Note Can Not Be Empty")
        }
        repository.insertNote(note)
    }
}