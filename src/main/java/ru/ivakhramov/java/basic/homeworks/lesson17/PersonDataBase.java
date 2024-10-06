package ru.ivakhramov.java.basic.homeworks.lesson17;

// Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы,
// со следующей асимптотической сложностью:
// - Person findById(Long id) - найти Person по id - O(1)
// - void add(Person person) - добавить Person - O(1)
// - isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
// - isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {

    private Map<Long, Person> personDataBase;

    public PersonDataBase() {
        personDataBase = new HashMap<>();
    }

    public Person findById(Long id) {

        if (!personDataBase.containsKey(id)) {
            throw new IllegalArgumentException("Сотрудника с id = " + id + " нет в базе");
        }
        return personDataBase.get(id);
    }

    public void add(Person person) {

        if (personDataBase.containsKey(person.getId())) {
            throw new IllegalArgumentException("Сотрудник с id = " + person.getId() + " уже есть в базе");
        }
        personDataBase.put(person.getId(), person);
    }

    public boolean isManager(Person person) {

        return person.getPosition() == Position.MANAGER ||
               person.getPosition() == Position.DIRECTOR ||
               person.getPosition() == Position.BRANCH_DIRECTOR ||
               person.getPosition() == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {

        return !isManager(findById(id));
    }

    @Override
    public String toString() {
        return personDataBase.toString();
    }
}
