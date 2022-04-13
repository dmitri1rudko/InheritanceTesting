public class Wheel {
    public static void main(String[] args) {
        String[] phrase = {
                "цмюрэяъ гю дкхммшл псакел",
                "б вюя он вюимни кнфйе",
                "йюфдши йскхй ябне анкнрн убюкхр",
                "гюпсахрэ мю мняс",
                "щрнр дхбмши мнбши лхп"
        };
        int[] letterCount = new int[32];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ((lett >= 'ю') & (lett <= 'ъ')) {
                    letterCount[lett - 'ю']++;
                }
            }
        }
        for (char count = 'ю'; count < 'ъ'; count++) {
            System.out.print(count + ": " + letterCount[count - 'ю'] + " ");
            if (count == 'л') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
