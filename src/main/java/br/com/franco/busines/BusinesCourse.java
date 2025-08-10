package br.com.franco.busines;

import java.util.ArrayList;
import java.util.List;

import br.com.franco.interfaces.ICourseService;

// SUT -> System (method ) under test
public class BusinesCourse   {
  
  // Course service is a dependency
  private ICourseService courseService;

  // Injecting the dependency
  public BusinesCourse(ICourseService courseService) {
    this.courseService = courseService;
  }

  public List<String> retriveCoursesRelatedToSpring(String student){
    
    var filteredCourses = new ArrayList<String>();

    var allCourses = courseService.retrieveCourses(student);

    for (String course : allCourses) {
        if(course.contains("Spring")){
          filteredCourses.add(course);
        }
    }

    return filteredCourses;
  }

    public void deleteCoursesRelatedToSpring(String student){
    
    

    var allCourses = courseService.retrieveCourses(student);

    for (String course : allCourses) {
        if(!course.contains("Spring")){
          courseService.deleteCourse(course);
        }
    }
  }

  
}
