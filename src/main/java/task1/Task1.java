package main.java.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(getFloatInput(reader));
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }

    private static float getFloatInput(BufferedReader reader) {
        boolean isFloat = false;
        float number = 0f;
        System.out.println("Введите дробное число");
        while (!isFloat) {
            try {
                number = Float.parseFloat(reader.readLine());
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите дробное число.");
            } catch (IOException e) {
                System.out.println("Ошибка чтения");
            }
        }
        return number;
    }
}