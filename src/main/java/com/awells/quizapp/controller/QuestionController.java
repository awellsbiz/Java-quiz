package com.awells.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awells.quizapp.model.Question;
import com.awells.quizapp.service.QuestionService;

import java.util.List;

//main controller(question) layer is here 

@RestController // to accept request-
@RequestMapping("question") // mentioning the path- only work with question
public class QuestionController {

  @Autowired // for Dependecy Injection. Tells spring to inject an instance of a class into
             // anotther class
  QuestionService questionService; // need object of service for dependency injection- question controller depends
                                   // on question - creating service reference

  @GetMapping("allQuestions")
  // below i want to get data from service layer
  public List<Question> getAllQuestions() {
    return questionService.getAllQuestions();
  }

  @GetMapping("category/{category}")
  // add a controller to return a list of questions getQuestionsByCategory
  public List<Question> getQuestionsByCategory(@PathVariable String category) {
    return questionService.getQuestionsByCategory(category);
  }

  @PostMapping("add")
  public String addQuestion(@RequestBody Question question) {
    return questionService.addQuestion(question);
  }

}
