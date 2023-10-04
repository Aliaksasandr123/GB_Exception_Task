package main.java.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        boolean isLine = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!isLine) {
                try {
                    System.out.println("Введите строку");
                    System.out.print("Вы ввели строку:" + getInputLine(reader));
                    isLine = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения с консоли");
        }
    }

    private static String getInputLine(BufferedReader reader) throws Exception {
        String line = reader.readLine();
        if (line.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }
        return line;
    }
}