package com.awells.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awells.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
