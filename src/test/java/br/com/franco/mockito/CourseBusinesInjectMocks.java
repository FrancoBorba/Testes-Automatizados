package br.com.franco.mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.franco.busines.BusinesCourse;
import br.com.franco.interfaces.ICourseService;

@ExtendWith(MockitoExtension.class)
public class CourseBusinesInjectMocks {

  @Mock
  ICourseService mockService;
  
  @InjectMocks
  BusinesCourse businesCourse ;
  List<String> courses;

  
    @BeforeEach
  void setUp(){
    // Given // Arrange
  
   // businesCourse = new BusinesCourse(mockService);

        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
            );

  }

    @Test
  void testCoursesRelatedToSpring_When_UsingAMock(){
    // Given // Arrange
      

      given(mockService.retrieveCourses("Franco"))
      .willReturn(courses);

    // When // Act
    var filteredCourses = 
    businesCourse.retriveCoursesRelatedToSpring("Franco");

    // Then // Assert
    assertThat(filteredCourses.size() , is(4));
  }


  @Test
   void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourse() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Leandro"))
            .willReturn(courses);
        
        // When / Act
        businesCourse.deleteCoursesRelatedToSpring("Leandro");
        
        // Then / Assert
        // verify(mockService)
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, times(1))
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, atLeast(1))
        verify(mockService, atLeastOnce())
            .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        verify(mockService)
            .deleteCourse("Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#");
        verify(mockService, never())
            .deleteCourse("REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker");
    }

      @Test
    void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourseV2() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Leandro"))
            .willReturn(courses);
        
        // When / Act
        businesCourse.deleteCoursesRelatedToSpring("Leandro");
        
        then(mockService)
            .should()
                .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        then(mockService)
            .should()
                .deleteCourse("Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#");
        then(mockService)
            .should(never())
                .deleteCourse("REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker");
    }

  
}
