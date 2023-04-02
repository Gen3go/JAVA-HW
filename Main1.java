public class Main1 {
    public static void main(String[] args) {

        String JsonString = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        parseString(JsonString);
        String filePath = "test1.txt";
    }

    public static void parseString(String JsonString) {
        /*
         * Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
         * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
         * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}}
         * Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
         * Студент Иванов получил 5 по предмету Математика.
         * Студент Петрова получил 4 по предмету Информатика.
         * Студент Краснов получил 5 по предмету Физика.
         * Используйте StringBuilder для подготовки ответа
         */
        //StringBuilder stringBuilder = new StringBuilder();
        String [] newJsonString = JsonString.split(":");
        System.out.println(newJsonString);

    }

    static void writeToFile(String s1, String filePath) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath, false);
            writer.write();
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
