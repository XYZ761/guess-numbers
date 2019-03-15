import java.util.Random;
import java.util.Scanner;

public class anonymous {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总共玩游戏人数：");
        int pepole = sc.nextInt();
        int[] time = new int[pepole];
        System.out.println("请输入范围：");
        int fanwei = sc.nextInt();
        int winner = 0;
        int winnertime = fanwei;
        for (int i = 0; i < pepole; i++) {
            System.out.println("第" + (i + 1) + "位玩家开始输入数字，范围为：1~" + fanwei);
            int num = r.nextInt(fanwei) + 1;
            while (true) {
                time[i]++;
                System.out.println("第" + time[i] + "次输入数字：");
                int n = sc.nextInt();
                if (n > num) {
                    System.out.println("大了");
                } else if (n < num) {
                    System.out.println("小了");
                } else {
                    System.out.println("对了，就是 " + num + "你猜了" + time[i] + "次，下一位玩家");
                    if (winnertime > time[i]) {
                        winner = i + 1;
                        winnertime = time[i];
                    }
                    break;
                }
            }
        }
        System.out.println("第" + winner + "位玩家胜利，他仅仅猜了" + winnertime + "次");
    }
}