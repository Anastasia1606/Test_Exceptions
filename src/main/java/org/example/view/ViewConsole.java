package org.example.view;

import java.util.Scanner;

public class ViewConsole {
    public static Object InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные Фамилия Имя Отчество дата_рождения номер_телефона пол через пробел, где: \n"+
                           "фамилия, имя, отчество - строки\n" +
                           "дата_рождения - строка формата dd.mm.yyyy\n" +
                           "номер_телефона - целое беззнаковое число без форматирования\n" +
                           "пол - символ латиницей f или m.\n");
        return sc.nextLine();
    }
}
