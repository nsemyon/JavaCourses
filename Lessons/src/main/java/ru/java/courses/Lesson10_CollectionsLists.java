package ru.java.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        List<String> result = new ArrayList<>(source.size());
        Collections.sort(source);
        //result.add(String.valueOf(source.get(0)));
        for(int i = 0; i < source.size(); i++){
            if(i == 0){
                result.add(String.valueOf(source.get(i)));
            }
            else if(!source.get(i).equals(source.get(i-1))){
                result.add(String.valueOf(source.get(i)));
            }
        }
        /*int i = 0;
        while (i < source.size()){
            result.add(String.valueOf(source.get(i)));
            i = source.lastIndexOf(source.get(i))==i ? i+1 : source.lastIndexOf(source.get(i)) + 1;
        }*/
        /*result.add(String.valueOf(source.get(0)));
        for(int i = 1; i < source.size(); i++){
            if(!source.get(i).equals(source.get(i-1))){
                result.add(String.valueOf(source.get(i)));
            }
        }*/
        /*for (int item : source){
            if (result.lastIndexOf(String.valueOf(item)) == -1){
                result.add(String.valueOf(item));
            }
        }*/
        return result;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> result = new ArrayList<>(5);
        int i = 3;
        while(i < array.length && i < 8){
            result.add(array[i] % 2 == 0 ? array[i]+1 : array[i] ); // что-то всплыло в памяти от первых уроков и разбора домашки
            i +=1;
        }
        return result;
    }
}
