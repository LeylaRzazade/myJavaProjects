package Lesson8;
/*
Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
 а с помощью метода get() искать номер телефона по фамилии.
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
  тогда при запросе такой фамилии должны выводиться все телефоны.

Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для
вывода результатов проверки телефонного справочника.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    private Map<String, Set<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    // Method to add an entry to the directory
    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneNumber);
    }

    // Method to get phone numbers by last name
    public Set<String> get(String lastName) {
        return directory.getOrDefault(lastName, new HashSet<>());
    }

}
