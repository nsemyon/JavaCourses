package ru.java.courses;

public class Lesson5_Strings {

    /**
     * Дан массив строк, необходимо удалить из него все дубли,
     * оставшиеся строки объединить в одну в порядке следования в массиве.
     *
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк
     *
     * @return полученную строку.
     */
    public static String task1(String[] strings) {
        StringBuilder sb = new StringBuilder();
        if (strings.length > 0){
            sb.append(strings[0]);
            for (int i=0; i<strings.length-1;i++){
                for (int j = i+1; j<strings.length; j++){
                    if (strings[i].equals(strings[j]) && !strings[i].equals("")){
                        strings[j] = "";
                    }
                }
                sb.append(strings[i+1]);
            }
        }
        return sb.toString();
    }

    /**
     * Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
     * “Название книги” И.И.Автора
     * <p>
     * Подсказка: Кавычек может не быть, а вместо инициалов полное имя
     *
     * @param pairs массив из пар строк
     *
     * @return  массив из полученных строк отсортированный по названию книг по алфавиту.
     */
    public static String[] task2(String[][] pairs) {
        String[] str = new String[pairs.length];
        for (int i = 0; i< pairs.length; i++){
            StringBuilder sb = new StringBuilder();
            if (pairs[i][0] != null){
                if (pairs[i][0].charAt(0) != '"') {
                    sb.append("\"");
                }
                sb.append(pairs[i][0]);
                if (pairs[i][0].charAt(pairs[i][0].length()-1) != '"'){
                    sb.append("\"");
                }
            }

            if (pairs[i][1] != null){
                String[] fio = pairs[i][1].split(" ");
                sb.append(" ");
                sb.append(fio[0].charAt(0)).append(". ");
                sb.append(fio[1].charAt(0)).append(". ").append(fio[2]);
            }
            str[i] = sb.toString();
        }
        return str;
    }

    /**
     * Дана строка, необходимо найти два символа и вернуть подстроку между ними.
     * <p>
     * Подсказка: одного или обоих символов может нет быть
     *
     * @param str исходная строка
     * @param symb1 первый символ
     * @param symb2 второй символ
     *
     * @return подстроку между найденными символами
     */
    public static String task3(String str, char symb1, char symb2) {
        StringBuilder sb = new StringBuilder();
        int a = -1;
        int b = -1;
        int i = 0;
        while ((a == -1 || b == -1) && i < str.length() ){
            if (a == -1 && (str.charAt(i) == symb1 || str.charAt(i) == symb2)) {
                a = i;
            } else if (b == -1 && (str.charAt(i) == symb1 || str.charAt(i) == symb2)) {
                b = i;
            }
            i++;
        }
        if (a != -1 && b != -1){
            for (i=a+1; i<b; i++){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
