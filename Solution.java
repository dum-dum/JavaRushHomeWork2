package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int result = 0;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0])))
        {
            int index;
            while (!((index = reader.read()) == -1)) {
                if (index >= 65 && index <= 90) result++;
                else if (index >= 97 && index <= 122) result++;
            }
            System.out.println(result);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
