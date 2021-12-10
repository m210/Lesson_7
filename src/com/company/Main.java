package com.company;

public class Main {

    public static void main(String[] args) {
        String firstNamme = "Alexander";
        String middleName = "Sergeevich";
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

        task5();

        task6();

        task7();

        task8();
    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] arr = new String[3];

        int curr = -1, prev = 0, pos = 0;
        do {
            curr = fullName.indexOf(" ", curr) + 1;
            arr[pos++] = (curr != 0) ? fullName.substring(prev, curr) : fullName.substring(prev);
            prev = curr;
        } while (curr != 0);

        String lastName = arr[0];
        String firstName = arr[1];
        String middleName = arr[2];

        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Отчество: " + middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";

        char[] arr = fullName.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char s = arr[i];
            if (Character.isLowerCase(s) && (i == 0 || arr[i - 1] == ' '))
                arr[i] = Character.toUpperCase(s);
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void task7() {
        String a = "135";
        String b = "246";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (a.length() + b.length()) / 2; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static void task8() {
        String message = "aabccddefgghiijjkk";
        for (int i = 0; i < message.length(); ) {
            char currSym = message.charAt(i++);
            if (i < message.length() && currSym == message.charAt(i))
                System.out.print(currSym);
        }
        System.out.println();
    }
}
