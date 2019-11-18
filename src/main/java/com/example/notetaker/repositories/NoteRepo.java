package com.example.notetaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notetaker.entity.Note;

public interface NoteRepo extends JpaRepository<Note, Long> {

}
