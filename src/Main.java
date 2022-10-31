import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] language = {"C", "JAVA", "Go", "Python", "JS"};
        Random random = new Random();
//        System.out.println(random);
        String lan = language[random.nextInt(5)];

        System.out.println("선택된 언어: " + lan);

        Random random1 = new Random();
        if (lan == "C") {
            String[] C = {"게임", "실생활용"};
            String c1 = C[random1.nextInt(2)];
            System.out.println("선택된 범위: " + c1);
            Random random2 = new Random();
            if (c1 == "게임") {
                String[] game_c = {"테트리스", "오목", "뱀게임", "틱택토 게임", "팩맨"};
                String ga_c = game_c[random2.nextInt(5)];
                System.out.println("최종 선택: " + ga_c);
            } else if (c1 == "실생활용") {
                String[] project_c = {"계산기", "달력", "단위 변환기", "행렬계산기"};
                String pro_c = project_c[random2.nextInt(4)];
                System.out.println("최종 선택: " + pro_c);
            }
        } else if (lan == "JAVA") {
            String[] java = {"웹", "안드로이드", "exe"};
            String ja1 = java[random1.nextInt(3)];
            System.out.println("선택된 범위: " + ja1);
            Random random3 = new Random();
            if (ja1 == "웹" || ja1 == "안드로이드") {
                String[] project_java = {"여행사", "약국찾기", "SNS서비스"};
                String ja2 = project_java[random3.nextInt(3)];
                System.out.println("최종 선택: " + ja2);
            } else if (ja1 == "exe") {
                String[] pro_java = {"게임", "유틸리티"};
                String ja3 = pro_java[random3.nextInt(3)];
                System.out.println("최종 선택: " + ja3);
            }
        } else if (lan == "Go") {
            String[] go = {"웹서비스", "etc"};
            String go1 = go[random1.nextInt(2)];
            System.out.println("최종 선택: " + go1);
        } else if (lan == "Python") {
            String[] python = {"유틸리티", "게임", "웹크롤링", "웹개발", "머신?딥러닝"};
            String py1 = python[random1.nextInt(5)];
            System.out.println("최종 선택: " + py1);
        } else if (lan == "JS") {
            String[] js = {"실시간 채팅", "카카오톡 봇", "인스타그램? 같은것"};
            String js1 = js[random1.nextInt(3)];
            System.out.println("최종 선택: " + js1);
        }
    }
}