package br.com.franco.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.franco.interfaces.IPersonService;
import br.com.franco.model.Person;
import br.com.franco.service.PersonService;

public class PersonServiceTest {
  
  Person person;
   IPersonService service;

  @BeforeEach
  void setUp(){
   service = new PersonService();
    person = new Person(
        "Franco", // Name
        "Borba", // LastName
        "franco.borba14@gmail.com", //email
        "VCA- Bahia" , // Adress
        "Male" // Gender
      );
  }

  @Test
  @DisplayName("When create a person with sucess should return a person object")
  void testCreatePerson_WhenSucess_ShouldReturnPersonObject(){

      // Given ; Arrange
     

      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
  }

   @Test
  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject(){

      // Given ; Arrange
   


      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertEquals(person.getFirstName(), actual.getFirstName() , () -> "The first name is deferent");
  }

    @Test
  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  void testCreatePerson_WhenSucess_ShouldContainsLasttNameInReturnedPersonObject(){

      // Given ; Arrange
      


      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertEquals(person.getLastName(), actual.getLastName() , () -> "The last name is diferent");
  }

    @Test
  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  void testCreatePerson_WhenSucess_ShouldContainsEmailInReturnedPersonObject(){

      // Given ; Arrange
   


      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertEquals(person.getEmail(), actual.getEmail() , () -> "The email is diferent");
  }

  
    @Test
  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  void testCreatePerson_WhenSucess_ShouldContainsAdressInReturnedPersonObject(){

      // Given ; Arrange
  


      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertEquals(person.getAdress(), actual.getAdress(), () -> "The adress is diferent");
  }

    @Test
  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  void testCreatePerson_WhenSucess_ShouldContainsGenderInReturnedPersonObject(){

      // Given ; Arrange



      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertEquals(person.getGender(), actual.getGender(), () -> "The gender is diferent");
  }

  @DisplayName("When create a person with sucess should contains first name in returned  person object")
  @Test
  void testCreatePerson_WhenSucess_ShouldContainsIDInReturnedPersonObject(){

      // Given ; Arrange



      // When ; Act
      Person actual = service.createPerson(person);

      // Then ; Assert
      assertNotNull(actual, () -> "The created person should not have returned null");
      assertNotNull(actual.getId() , () -> "The id can not be null");
   
   
  }

  @Test
  @DisplayName("When create a person with null email shol throw exception")
  void testCreatePerson_WithNullEmail_ShoulThrowIlegalArgumentException(){
    // Given

   
    person.setEmail(null);

    var expectMessage = "Email cannot be null or empty";

    // When
    // Then
  var exception =  assertThrows(IllegalArgumentException.class,  
    () -> service.createPerson(person), () -> "Empty email should throw illegal argument exception");

    assertEquals(expectMessage , exception.getMessage());
    
  }
}
