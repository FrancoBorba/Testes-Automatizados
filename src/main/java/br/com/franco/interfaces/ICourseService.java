package br.com.franco.interfaces;

import java.util.List;

public interface ICourseService {
  
  public List<String> retrieveCourses(String student);

   public List<String> doSomething(String student);

   public void deleteCourse(String course);
}
