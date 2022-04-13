public class Wheel {
    public static void main(String[] args) {
        String[] phrase = {
                "������� �� ������� ������",
                "� ��� �� ������ �����",
                "������ ����� ���� ������ ������",
                "�������� �� ����",
                "���� ������ ����� ���"
        };
        int[] letterCount = new int[32];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ((lett >= '�') & (lett <= '�')) {
                    letterCount[lett - '�']++;
                }
            }
        }
        for (char count = '�'; count < '�'; count++) {
            System.out.print(count + ": " + letterCount[count - '�'] + " ");
            if (count == '�') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
