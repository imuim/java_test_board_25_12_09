package com.ljw;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
                System.out.println("==자바 게시판 시작==");
                String cmd = scanner.nextLine();
                if(cmd.equals("exit")) {
                System.out.println("명령"+cmd);
                System.out.println("==자바 게시판 종료==");
                break;

                }
            }
        }
    }