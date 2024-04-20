package org.example.model;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.util.Date;

public class Person  {
    private String surname;
    private String name;
    private String patronymic;
    private Date dateOfBirth;
    private long phoneNumber;
    private String gender;

    public Person(String[] inputData) throws Exception {

        surname = inputData[0];
        name = inputData[1];
        patronymic = inputData[2];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        dateFormat.setLenient(false);
        dateOfBirth = dateFormat.parse(inputData[3]);
        phoneNumber = Long.parseLong(inputData[4]);
        gender = inputData[5];
        if (!gender.equals("f") && !gender.equals("m")){
            throw new IllegalArgumentException("Пол должен указываться в формате 'f' или 'm'");
        }
    }

    public void writePersonInFile() throws IOException {
        String fileName = surname + ".txt";

        FileWriter fileWriter = new FileWriter("src/main/java/org/example/persons/"+fileName, true);
        StringBuilder stringBuilder = new StringBuilder();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.mm.yyyy");
        stringBuilder.append(surname).append(" ").append(name).append(" ")
                .append(patronymic).append(" ").append(formatForDateNow.format(dateOfBirth)).append(" ")
                .append(phoneNumber).append(" ").append(gender).append("\n");
        fileWriter.write(stringBuilder.toString());
        fileWriter.close();

    }
}
