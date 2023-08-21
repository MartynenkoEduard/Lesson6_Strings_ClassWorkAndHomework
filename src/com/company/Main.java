package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
//        classWorkExamples();
//        classWorkExercise_PasswordChecking();
//        classWorkExercise_NameChecking();
//        examples();
//        homeWorkTask1();
//        homeWorkTask2();
//        homeWorkTask3();
//        homeWorkTask4();
//        homeWorkTask5();
//        homeWorkTask6();
//        homeWorkTask7();
//        homeWorkTask8();
//        homeWorkTask9();
//        homeWorkTask10();
//        homeWorkTask11();
//        coding("CAESAR", 3);
//        de_Coding("FDHVDU", 3);
//        shift_Cipher("CAESAR", 3);
//        regularExpression();

        getAlphabetForVigenereCoding(text);
        fillVigenereArray();
        genKey(numberOfSymbols);
        cyphierVigenere(alphabetVigenere, key);
        de_cyphierVigenere(cyphieredText, key);
    }

    public static void classWorkExamples() {
        String number1 = "1";
        int number2 = Integer.parseInt(number1);
        System.out.println(number2 + 1);

        String password = "eduard";
        int hashPassword = password.hashCode();
        System.out.println(hashPassword);

    }

    public static void classWorkExercise_NameChecking() {
        String name = " Eduard  ";
        final String LETTERS = "ABCDEFGHIKLMNOPQRSTUWXYZ";

        name = name.strip().toUpperCase(Locale.ROOT);
        for (int i = 0; i < name.length(); i++) {
            if (!LETTERS.contains("" + name.charAt(i))) {
                System.out.println(" Incorrect symbol in name! " + name.charAt(i));
                return;
            }
        }
        System.out.println("Correct name: " + name);
    }


    public static void examples() {
        String s = "abc";
//        System.out.println(s.substring(2,4));
        System.out.println(s.length());
        System.out.println(s.split(" "));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s.trim());
        s.strip();

        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        String s2 = "ABC";
        System.out.println(s.compareToIgnoreCase(s2));
        System.out.println(s.concat(s2));

        if (s.contains("b"))
            System.out.println(s.indexOf("b"));

        String number = " BH 1234 AA";
        System.out.println(number);
        number = number.strip();
        while (number.contains(" ")) {
            number = number.replace(" ", "");
        }
        System.out.println(number);
    }

    public static void classWorkExercise_PasswordChecking() {

        String password = " pa$$Word";
        boolean hasUpperCase = false, hasLowerCase = false, hasDigit = false, hasNonAlphabetSymbol = false, hasCorrectSize = false;

        password = password.strip();
        if (password.length() == 8)
            hasCorrectSize = true;

        for (int i = 0; i < password.length(); i++) {
            if (!hasDigit && Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (!hasLowerCase && Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            }
            if (!hasUpperCase && Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }
            if (!hasNonAlphabetSymbol && !Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                hasNonAlphabetSymbol = true;
            }
        }

        System.out.println(hasCorrectSize ? "good size" : "not OK");
    }

    public static void homeWorkTask1() {
        // Составить из разных букв введенной строки слова

        /*· s - введенная строка;
· w - составляемое очередное слово;
· ls, lw - длины введенной строки и составляемого слова;
· i - счетчик слов (номер составляемого слова);
· j - счетчик букв (номер буквы) составляемого слова;
· let - номер взятой буквы из введенной строки.
После ввода строки определяем ее длину и запишем полученное значение в переменную ls.
Допустим, надо составить пять случайных буквосочетаний.
Следовательно, все дальнейшие действия будут выполняться в цикле,
количество итераций которого равно 5.
Пусть длина очередного слова определяется случайно и может варьировать от 2 символов до 7.
Тогда переменной lw надо присвоить случайное число от 2 до 7.
Ее значение определяет, сколько раз надо будет взять букву из введенной строки.
Перед тем как собирать слово, переменной w присваивается пустая строка,
 а j присваивается 0. Далее в цикле (пока j < lw) берется случайный символ из строки.
  Для этого используется переменная ls (длина строки).
  Если этот символ не пробел, то он добавляется в конец строки w,
  а переменная j увеличивается на 1. После того как слово собрано, оно выводится на экран.
         */

        String s = "abcdefghiklmnoprst";
        int ls = s.length();
        int lw = 0;
        String w = "";
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            lw = (int) (Math.random() * 5 + 3);
            System.out.println(lw);
            for (int j = 0; j < lw; j++) {
                w = w + s.charAt(random.nextInt(ls));
            }
            System.out.println(w);
            w = "";
        }
    }

    public static void homeWorkTask2() {
        /*Является ли строка идентификатором
Определить, является ли введенное слово идентификатором,
т.е. начинается ли оно с английской буквы в любом регистре или
 знака подчеркивания и не содержит других символов,
 кроме букв английского алфавита (в любом регистре), цифр и знака подчеркивания.

При решении задачи следует проверить:
1.Принадлежит ли первый символ слова множеству английских букв, или является символом подчеркивания?
2.Принадлежат ли все остальные символы слова множеству английских букв или множеству символов цифр или
 являются символами подчеркивания?

Если хотя бы один символ не принадлежит указанным множествам,
 то делается вывод, что слово идентификатором не является.
 При этом дальнейшую проверку символов можно опустить.
         */
        String indeficator = "_indeficator";
        String symbol = "_";
        System.out.println("Answers: " + System.lineSeparator());
        boolean isCorrect = false;
        for (int i = 0; i < indeficator.length(); i++) {

            if (i == 0 && Character.isAlphabetic(indeficator.charAt(i)) || symbol.equals("" + indeficator.charAt(i))) {
                System.out.println("1. Correct first symbol");
            }
            if (i > 0 && Character.isDigit(indeficator.charAt(i)) || Character.isAlphabetic(indeficator.charAt(i)) || symbol.equals("" + indeficator.charAt(i))) {
                isCorrect = true;
            } else {
                isCorrect = false;
                System.out.println("2. Not correct symbol on position : " + (i + 1));
                return;
            }
        }
        if (isCorrect)
            System.out.println("2. Correct all symbols");
    }

    public static void homeWorkTask3() {
        //Удалить из строки пробелы и определить, является ли она перевертышем
        //Вводится строка. Удалить из нее все пробелы. После этого определить,
        // является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.
        //Задача состоит из двух подзадач: 1) удаление всех пробелов из строки и 2) проверка строки на "палиндромность".
        //Для удаления пробелов надо перебрать по символам строку. Если очередной символ пробел, то удалить его.
        // При этом следующий символ окажется на месте текущего,
        // а значит не следует увеличивать значение счетчика.
        // Если очередной символ не пробел, то надо перейти к проверке следующего,
        // т.е. увеличить значение счетчика.
        //Для проверки, является ли строка палиндромом, надо сравнить первую и вторую половины строк.
        // При этом половинки сравниваются так, что первый символ сравнивается с последним,
        // второй - с предпоследним, третий - с третьим с конца, и т. д.
        // То есть если длина строки l, а символ первой половины i, то символ второй половины имеет индекс l-i+1.


        String str = "  abc  c b a ";
        boolean isPalindromic = false;
        System.out.println(str);
        String currentSymbol;

        str = str.replaceAll(" ", "");
        System.out.println(str);

        for (int i = 0; i < str.length() / 2; i++) {
            currentSymbol = str.charAt(i) + "";
            if (currentSymbol.equals(str.charAt(str.length() - i - 1) + "")) {
                isPalindromic = true;
            } else {
                isPalindromic = false;
            }
        }
        System.out.println("String " + ((isPalindromic) ? "is palindromic" : "is not palindromic"));
    }

    public static void homeWorkTask4() {
        //Замена подстроки
        //Найти в строке указанную подстроку и заменить ее на новую.
        // Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        //1. Найти начало (индекс первой буквы) подстроки в строке.
        //2. Измерить длину подстроки.
        //3. Удалить подстроку из строки, начиная с позиции ее первой буквы и на ее длину.
        //4. Вставить новую подстроку в позицию, где раньше была первая буква старой подстроки.

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write text : ");
//        String str = scanner.nextLine();
        String str = "gbgbgfh for hkjgffv";
        System.out.println(str);
        String target = " for";
        String newWord = " aloha ";

        int position = -1;
        do {
            position = str.indexOf(target);
            if (position >= 0) {
                str = str.substring(0, position) + newWord + str.substring(position + target.length(), str.length());
            }
        } while (position >= 0);

        System.out.println(str);
    }

    public static void homeWorkTask5() {
        //Отфильтровать из строки числа
        //Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
        // Требуется все числа, которые встречаются в строке,
        // поместить в отдельный целочисленный массив.
        // Например, если дана строка "data 48 call 9 read13 blank0a",
        // то в массиве должны оказаться числа 48, 9, 13 и 0.
        //Если очередной символ строки оказывается цифрой (принадлежит диапазону от '0' до '9'),
        // то его надо добавить в отдельную изначально пустую строку.
        // Проверяя последующие после него символы на принадлежность тому же диапазону,
        // добавлять их в конец той же строки. Это следует делать до тех пор,
        // пока очередной символ окажется не цифрой. В этом случае надо сформированную
        // до этого строку из цифр преобразовать в число и добавить в целочисленный массив.
        // Саму же строку "очистить", т.е. присвоить пустую строку.

        String str = "data 48 call 9 read13 blank0a";
        int counter = 0;
        String temp = "";
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                list.add(str.charAt(i) + "");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);
        double number = Integer.parseInt(temp);
//        System.out.println(number);
        int digits = (int) Math.ceil(Math.log10(number));
        System.out.println(digits);

        int array[] = new int[digits];
        for (int i = 0; i < digits; i++) {
            array[i] = (int) (number % 10);
            number /= 10;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void homeWorkTask6() {
        //Удаление из строки повторяющихся символов
        //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
        // Например, если было введено "abc cde def", то должно быть выведено "abcdef".

        String str = "abc cde def";
        String strResult = "";
        String template = "", current = "";
        StringBuilder newString = new StringBuilder();

        /*for (int i = 0; i < str.length(); i++) {
            current = str.substring(i, i + 1);
            if (i == 0) {
                strResult = current;
                template = current;
            }
            if (template.indexOf(current) == -1) {
                strResult += current;
                template += current;
            }
        }
        System.out.println(strResult);*/

        char array[] = str.toCharArray();
        System.out.println(Arrays.toString(array));
        int currentPosition = 1;
        int j = 0;
        for (int i = 1; i < str.length(); i++) {
            for (j = 0; j < currentPosition; ++j) {
                if (array[j] == array[i]) {
                    break;
                }
            }
            if (j == currentPosition) {
                array[currentPosition] = array[i];
                currentPosition++;
            } else {
                array[currentPosition] = 0;
                currentPosition++;
            }
        }
        for (char character : array) {
            if (character != 0 && character != ' ') {
                newString.append(character);
            }
        }
        System.out.println(newString);
    }

    public static void homeWorkTask7() {
        //Удаление лишних пробелов
        //Вводится ненормированная строка, у которой могут быть пробелы в начале,
        // в конце и между словами более одного пробела.
        // Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце,
        // а между словами оставить только один пробел.

        String str = "      abab    b  hahaha    lkf      ";
//        str = str.strip();
        StringBuilder strBuild = new StringBuilder(str);
//        str = str.replaceAll("  ", " ");
        System.out.println(str);
        do {
            if (strBuild.charAt(0) == ' ') {
                strBuild.delete(0, 1);
            }
        }
        while (strBuild.charAt(0) == ' ');
        System.out.println(strBuild);

        do {
            if (strBuild.charAt(strBuild.length() - 1) == ' ') {
                strBuild.delete(strBuild.length() - 1, strBuild.length());
            }
        }
        while (strBuild.charAt(strBuild.length() - 1) == ' ');
        System.out.println(strBuild + "|");

        for (int i = 0; i < strBuild.length(); i++) {
            if (strBuild.charAt(i) == ' ') {
                if (strBuild.charAt(i + 1) == ' ') {
                    strBuild.delete(i, i + 1);
                    i--;
                }
            }
        }
        System.out.println(strBuild);
    }

    public static void homeWorkTask8() {
        //Самая длинная строка в массиве
        //Вводятся строки. Определить самую длинную строку
        // и вывести ее номер на экран.
        // Если самых длинных строк несколько, то вывести номера всех таких строк.

        String str = "Самаясамаясамая длинная строка в массиве";
        str = str.strip();
        String temporary = "";
        int position = 0;
//        var variable = str.split(" ");
//        System.out.println(Arrays.toString(variable));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                position++;
            }
        }
        String[] stringsArray = new String[position + 1];
        position = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                temporary = str.substring(start, i);
                stringsArray[position] = temporary;
                position++;
                start = i + 1;
            }
            if (i == str.length() - 1) {
                temporary = str.substring(start, str.length());
                stringsArray[position] = temporary;
            }
        }
        System.out.println(Arrays.toString(stringsArray));

        int maxPossition = 0;
        String maxWord = "";
        for (int i = 0; i < stringsArray.length; i++) {

            if (stringsArray[i].length() > maxWord.length()) {
                maxWord = stringsArray[i];
                maxPossition = i;
            }
        }
        System.out.println("Саммая длинная строка : " + maxWord + ",  позиция : " + maxPossition);
    }

    public static void homeWorkTask9() {
        //Самое длинное слово в строке
        //Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
        // Случай, когда самых длинных слов может быть несколько, не обрабатывать.

        String str = "Самаясамаясамая длинная строка в массивемассивемассивемассиве";
        int maxLetters = 0;
        int position = 0;
        int tempCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                tempCount++;
            }
            if (str.charAt(i) == ' ') {
                if (tempCount > maxLetters)
                    maxLetters = tempCount;
                position = i;
                tempCount = 0;
            }
            if (str.length() - 1 == i) {
                if (tempCount > maxLetters)
                    maxLetters = tempCount;
                position = i + 1;
                tempCount = 0;
            }
        }
        String longestWord = str.substring(position - maxLetters, position);
        System.out.println("Max letters in word : " + longestWord + ";  letters : " + maxLetters);
    }

    public static void homeWorkTask10() {
        //Количество строчных и прописных букв в строке
        //Посчитать количество строчных (маленьких) и
        // прописных (больших) букв в введенной строке.
        // Учитывать только английские буквы.

        String str = "ABABAgalamaga";
        int upperCase = 0;
        int lowerCase = 0;
        char[] string = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (string[i] > 64 && string[i] < 91)
                upperCase++;
            if (string[i] > 96 && string[i] < 123)
                lowerCase++;
        }
        System.out.println("upper Case : " + upperCase + "; lower case : " + lowerCase);
    }

    public static void homeWorkTask11() {
        //Количество слов в строке
        //Вводится строка, состоящая из слов,
        // разделенных пробелами.
        // Требуется посчитать количество слов в ней.

//        String str = "Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = input;
        str = str.trim();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
            if (i == str.length() - 1)
                counter++;
        }
        System.out.println("Quantity of words : " + counter);
    }


    /**
     * use for coding symbol by Caesar algorithm
     */
    public static String coding(final String TEXT, final int KEY) {

        return shift_Cipher(TEXT, KEY);
    }

    /**
     * use for DE_coding symbol by Caesar algorithm
     */
    public static String de_Coding(final String TEXT, final int KEY) {

        return shift_Cipher(TEXT, -KEY);
    }


    public static String shift_Cipher(final String text, final int KEY) {


        String result = "";

        for (int i = 0; i < text.length(); i++) {
            result += (char) ((int) text.charAt(i) + KEY);
        }
        System.out.println(result);

        return result;
    }


    public static void regularExpression() {
        String text = " Alla Anatoliyvna Anton";
        Pattern pattern = Pattern.compile("A.+a");
        Matcher matcher = pattern.matcher(text);
        matcher.find();

        System.out.println(text.substring(matcher.start(), matcher.end()));

        System.currentTimeMillis();
    }

    //////////////////////////////////////////////////////

    public static String text = "Vigenere coding for training";

    public static String getAlphabetForVigenereCoding(String text) {
        String alphabet = "";
        for (char c : text.toCharArray()) {
            if (!alphabet.contains(c + "")) {
                alphabet += c;
            }
        }
//        System.out.println("alphabet : " + alphabet);
        return alphabet;
    }

    public static String alphabetVigenere = getAlphabetForVigenereCoding(text);

    public static char vigenereTable[][];

    public static void fillVigenereArray() {
        String text = "Vigenere coding for training";

        vigenereTable = new char[alphabetVigenere.length()][alphabetVigenere.length()];
        for (int column = 0; column < vigenereTable.length; column++) {
            System.out.println();
            for (int row = 0; row < vigenereTable[column].length; row++) {

                vigenereTable[column][row] = alphabetVigenere.charAt((column + row) % alphabetVigenere.length());
                System.out.print(vigenereTable[column][row]);
            }
        }
    }

    public static int numberOfSymbols = 5;

    public static String key = "";
    public static String genKey(int numberOfSymbols) {

        String result = "";
        Random random = new Random();
        int index = 0;
        char c = 0;
        while (index != numberOfSymbols) {
            do {
                c = alphabetVigenere.charAt(random.nextInt(alphabetVigenere.length()));
            } while (result.contains(c + ""));
            result += c;
            index++;
        }

        System.out.println(System.lineSeparator() + "Key :" + result);
        key = result;
        return result;
    }

    public static String cyphieredText = "";

    public static String cyphierVigenere(final String alphabetVigenere, String key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int posH = alphabetVigenere.indexOf(text.charAt(i));
            int posV = alphabetVigenere.indexOf(key.charAt(i % key.length()));
            result += vigenereTable[posH][posV];
        }
        System.out.println(System.lineSeparator() + "Cyphiered text:  " + result);
        cyphieredText = result;
        return result;

    }

    public static String de_cyphierVigenere(String cyphieredText, String key) {
        String result = "";
        int posH = 0;
        int posV = 0;

        for (int i = 0; i < text.length(); i++) {
            posH = alphabetVigenere.indexOf(key.charAt(i % key.length()));
            for (int j = 0; j < alphabetVigenere.length(); j++) {
                if ( vigenereTable[posH][j] == cyphieredText.charAt(i)) {
                    posV = j;}
            }
            result += vigenereTable[0][posV];
        }
        System.out.println("Text :  " + text);
        System.out.println("Decrypted text:  " + result);
        return result;
    }


}






