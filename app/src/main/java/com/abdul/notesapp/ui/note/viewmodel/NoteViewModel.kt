package com.abdul.notesapp.ui.note.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdul.notesapp.models.NoteRequest
import com.abdul.notesapp.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//Step17.2: create a note view-model

@HiltViewModel
class NoteViewModel @Inject constructor(private val noteRepository: NoteRepository) : ViewModel() {

    val notesLiveData get() = noteRepository.notesLiveData
    val statusLiveData get() = noteRepository.statusLiveData

    fun createNote(noteRequest: NoteRequest) {
        viewModelScope.launch {
            noteRepository.createNote(noteRequest)
        }
    }

    fun getAllNotes() {
        viewModelScope.launch {
            noteRepository.getNotes()
        }
    }

    fun updateNote(id: String, noteRequest: NoteRequest){
        viewModelScope.launch {
            noteRepository.updateNote(id, noteRequest)
        }
    }

    fun deleteNote(noteId: String) {
        viewModelScope.launch {
            noteRepository.deleteNote(noteId)
        }
    }
}