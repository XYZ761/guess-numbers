import java.util.Random;
import java.util.Scanner;

public class anonymous {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ܹ�����Ϸ������");
        int pepole = sc.nextInt();
        int[] time = new int[pepole];
        System.out.println("�����뷶Χ��");
        int fanwei = sc.nextInt();
        int winner = 0;
        int winnertime = fanwei;
        for (int i = 0; i < pepole; i++) {
            System.out.println("��" + (i + 1) + "λ��ҿ�ʼ�������֣���ΧΪ��1~" + fanwei);
            int num = r.nextInt(fanwei) + 1;
            while (true) {
                time[i]++;
                System.out.println("��" + time[i] + "���������֣�");
                int n = sc.nextInt();
                if (n > num) {
                    System.out.println("����");
                } else if (n < num) {
                    System.out.println("С��");
                } else {
                    System.out.println("���ˣ����� " + num + "�����" + time[i] + "�Σ���һλ���");
                    if (winnertime > time[i]) {
                        winner = i + 1;
                        winnertime = time[i];
                    }
                    break;
                }
            }
        }
        System.out.println("��" + winner + "λ���ʤ��������������" + winnertime + "��");
    }
}