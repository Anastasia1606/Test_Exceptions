package org.example.controller;

import org.example.model.Person;
import org.example.view.ViewConsole;

import java.text.ParseException;

public class Controller {
    public void start()  {
        try {
            String data = (String) ViewConsole.InputData();

            String[] arrData = data.split(" ");
            if (arrData.length != 6) {
                throw new Exception("Введено неверное количество данных, должно быть введено строго 6 значений через пробел");
            }
            Person person = new Person(arrData);
            person.writePersonInFile();
        }
        catch (ParseException e) {
            System.out.println("Дата рождения должна указываться в формате dd.mm.yyyy");
        } catch (NumberFormatException e) {
            System.out.println("Номер телефона должен указываться целым беззнаковым числом без форматирования");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
