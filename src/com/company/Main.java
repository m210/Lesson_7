package com.company;

public class Main {

    public static void main(String[] args) {
        String firstNamme = "Alexander";
        String middleName ="Sergeevich";
        String lastName = "Makarov";

        String fullName = lastName + " " + firstNamme + " " + middleName;
        System.out.println("ФИО: " + fullName);

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника заполения отчета - " + upperFullName);

        String newFullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + newFullName);

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}
