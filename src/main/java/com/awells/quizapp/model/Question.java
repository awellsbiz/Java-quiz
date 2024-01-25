package com.awells.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//we use an annotation to get mapped with a class
@Entity
@Data // comes from lombok so that yiou dont have to write getters and setters
public class Question {
  // Question class is the model so this is where we design our DB tabels. All of
  // the field in this block will represent the DB columns. the number of objects
  // we have for this class can represent a row.

  // here we are designing the modle

  @Id // makes sue that its a primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) //
  private Integer id;
  private String questionTitle;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String rightAnswer;
  private String difficultyLevel;
  private String category;

}
