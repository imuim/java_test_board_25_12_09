package com.ljw;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalCount =0;
        while (true) {
            System.out.println("== 자바 게시판 시작 ==");
            System.out.print("명령)");
            String input = sc.nextLine();



            if(input.equals("/usr/article/write")) {

                System.out.print("제목:");
                String title = sc.nextLine();
                System.out.print("내용:");
                String contents = sc.nextLine();
                totalCount++;
                System.out.printf("%d 번 게시물이 등록 되었습니다.\n",totalCount);

            } else if(input.equals("exit")) {
                System.out.println("== 자바 게시판 종료 ==");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}