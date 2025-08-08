package br.com.franco.service;

import java.util.concurrent.atomic.AtomicLong;

import br.com.franco.interfaces.IPersonService;
import br.com.franco.model.Person;

public class PersonService implements IPersonService {

  @Override
  public Person createPerson(Person person) {
    var id = new AtomicLong().incrementAndGet();
    person.setId(id);

    if (person.getEmail() == null || person.getEmail().isBlank()) {
      throw new IllegalArgumentException("Email cannot be null or empty");
    }
    return person;
  }
  
}
