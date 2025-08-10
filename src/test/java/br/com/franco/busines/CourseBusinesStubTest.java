package br.com.franco.busines;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.franco.interfaces.ICourseService;
import br.com.franco.service.stub.CourseServiceStub;

public class CourseBusinesStubTest {
  

  @Test
  void testCoursesRelatedToSpring_When_UsingAStub(){
    // Given // Arrange
    ICourseService stubService = new CourseServiceStub();
    BusinesCourse businesCourse = new BusinesCourse(stubService);

    // When // Act
    var filteredCourses = 
    businesCourse.retriveCoursesRelatedToSpring("Franco");

    // Then // Assert
    assertEquals(4, filteredCourses.size());
  }

}
