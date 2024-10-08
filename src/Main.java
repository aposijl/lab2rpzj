public class Main {

    /* C3 = 2: тип текстових змінних - StringBuffer
    C17 = 14: в кожному слові заданого тексту, видалити всі наступні входження першої літери цього слова.*/

    public static void main(String[] args) {
        String text = "Ллаборлалторна роборта з рорзрорбки пропграмнопго забезпезченняз на плаптфопрмі Java.";
        System.out.println("початковий текст:");
        System.out.println(text);
        String processedText = processText(text);
        System.out.println("\nопрацьований текст:");
        System.out.println(processedText);
    }

    // метод для обробки тексту (видалення повторних входжень першої літери у кожному слові)
    public static String processText(String text) {
        StringBuffer result = new StringBuffer(); // використовуємо StringBuffer за варіантом
        String[] words = text.split(" "); // розбиваємо текст на окремі слова за пробілами
        for (String word : words) {
            result.append(removeRepeats(word)).append(" ");// проходимо через кожне слово і обробляємо його
        }
        return result.toString().trim();
    }

    // метод для видалення всіх наступних входжень першої літери у слові
    public static String removeRepeats(String word) {
        if (word.isEmpty()) return word;
        StringBuffer buffer = new StringBuffer(word);
        char firstLetter = buffer.charAt(0);  // отримуємо першу літеру слова
        for (int i = 1; i < buffer.length(); i++) {
            if (Character.toLowerCase(buffer.charAt(i)) == Character.toLowerCase(firstLetter)) {
                buffer.deleteCharAt(i); // видаляємо символ
                i--;
            }
        }
        return buffer.toString();
    }
}