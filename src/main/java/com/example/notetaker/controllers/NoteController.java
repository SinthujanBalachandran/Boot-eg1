package com.example.notetaker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.notetaker.entity.Note;
import com.example.notetaker.repositories.NoteRepo;

@RestController
@RequestMapping("/api")
public class NoteController {
	@Autowired
	NoteRepo noteRepo;
	
	@GetMapping("/notes")
	public List<Note> getAllNotes(){
		return noteRepo.findAll();
	}
	
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note note) {
		return noteRepo.save(note);
	}
	
	@GetMapping("/notes/{id}")
	public Optional<Note> getNoteById(@PathVariable (value = "id" )Long noteId) {
		return noteRepo.findById(noteId);
	}
	
	
}
