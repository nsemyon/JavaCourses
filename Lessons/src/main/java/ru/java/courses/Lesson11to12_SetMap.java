package ru.java.courses;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.swing.tree.TreeCellEditor;

public class Lesson11to12_SetMap {

    public static class User {

        private String name;
        private int age;
        private String phone;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем коллекцию пользователей
     * 2. Удаляем все дубли (одинаковое имя и возраст)
     * 3. Сортируем по имени и возрасту
     * 4. Возвращаем последнего пользователя
     */
    public static User task1(Collection<User> source) {
        TreeSet<User> users = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        users.addAll(source);
        return users.last();
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем коллекцию пользователей
     * 2. Преобразовываем его в справочник [номер телефона -> пользователь]
     * 3. Один номер телефона на одного пользователя
     * 4. Вернуть количество записей в справочнике
     */
    public static int task2(Collection<User> source) {
        HashMap<String, String> users = new HashMap<>();
        for(User item : source){
            users.put(item.getPhone(), null);
        }
       return users.size();
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем список названий книг
     * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
     * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
     * 4. Количество полок константное - 5 штук
     * 5. Вернуть книги распределенные по полкам
     *
     * Нумерация полок начинается с единицы!
     */
    public static Map task3(Collection<String> source) {
        final int shelfCount = 5;
        HashMap<Integer, List<String>> shelf = new HashMap<>();
        if (source.size() > 0) {
            List<String> books = new ArrayList<>();
            books.addAll(source);
            Collections.sort(books);
            int booksPerShelf = books.size() / shelfCount;
            int firstBook;
            int lastBook = 0;
            for (int i = 0; i < shelfCount; i++) {
                firstBook = lastBook;
                lastBook = i < shelfCount - booksPerShelf ? lastBook + booksPerShelf : lastBook + booksPerShelf + 1;
                shelf.put(i + 1, books.subList(firstBook, lastBook));
            }
        }
        return shelf;
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем книги, распределенные по полкам
     * 5. Вернуть справочник [название книги -> номер полки]
     */
    public static Map task4(Map<Integer, String> source) {
        HashMap<String, Integer> result = new HashMap<>();
        for (int key : source.keySet()){
            result.put(source.get(key), key);
        }
        return result;
    }
}
