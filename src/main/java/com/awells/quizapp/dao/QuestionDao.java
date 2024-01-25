package com.awells.quizapp.dao; //main job is to interact with the database - handles all operations related to fetching and storing data in datbase  (Data Access Object) 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awells.quizapp.model.Question;
import java.util.List;

@Repository // A specific type of DAO- Uses spring JPA (Java Persisitant Api) to make DB
            // interactions easier and more efficient. Fetchong data and querying the DB
            // will be handled by JPA. must be an interface though.
public interface QuestionDao extends JpaRepository<Question, Integer> { // JPA will ask for two things: The name of the
                                                                        // table and the type of the primary key. in
                                                                        // this case the we are mentioning the class
                                                                        // name that maps to the table name.
  List<Question> findByCategory(String category); // JPA is smart to find this query because its an actual column inside
                                                  // of the table
}
