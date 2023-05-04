import java.util.Scanner;
import java.util.regex.Pattern;

public class A1091267_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入電子郵件地址: ");
        String email = scanner.nextLine();

        // 定義正則表示式
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";

        // 進行正則表達式匹配
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()) {
            System.out.println("電子郵件地址格式正確。");
        } else {
            System.out.println("電子郵件地址格式錯誤。");
        }
    }
}