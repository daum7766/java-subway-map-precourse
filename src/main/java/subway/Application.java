package subway;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        DataInitService.init();
        UserInterfaceView userInterfaceView = new UserInterfaceView(scanner);
        userInterfaceView.start();
    }
}
