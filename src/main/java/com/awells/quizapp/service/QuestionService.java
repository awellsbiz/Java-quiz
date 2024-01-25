package com.awells.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awells.quizapp.dao.QuestionDao;
import com.awells.quizapp.model.Question;

//we want spring to handle these objects 

@Service // creates bean essentially
public class QuestionService {

  @Autowired // instead of specifying bean dependecies manually- we instruct the Spring
             // container to Auto matically resolve dependecies by matching beans in the
             // container. Spring will automatically inject the bean with the mayching data
             // type.
  QuestionDao questionDao; // -This is how you are matching the beans by declaring the class right here so
                           // that we can call the methods to get information from the DAO

  public List<Question> getAllQuestions() {
    return questionDao.findAll();// sending this to the DAO to talk with the Database.
  }

  public List<Question> getQuestionsByCategory(String category) { // fetch category from DAO
    return questionDao.findByCategory(category);
  }

  public String addQuestion(Question question) {
    questionDao.save(question);
    return "success";
  }

  public String addQuestion(List<Question> questions) {
    questionDao.saveAll(questions);
    return "success";
  }

}
