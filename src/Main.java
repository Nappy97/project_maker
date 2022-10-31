import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] language = {"C", "JAVA", "Go", "Python", "JS"};
        double random = Math.random();
        int num = (int) Math.round(random * (language.length - 1));


        System.out.println("선택된 언어: " + language[num]);

        if (language[num] == "C") {
            String[] C = {"게임", "실생활용"};
            int num1 = (int) Math.round(random * (C.length - 1));
            System.out.println("선택된 범위: " + C[num1]);
            if (C[num1] == "게임") {
                String[] game_c = {"테트리스", "오목", "뱀게임", "틱택토 게임", "팩맨"};
                int num2 = (int) Math.round(random * (game_c.length - 1));
                System.out.println("최종 선택: " + game_c[num2]);
            } else if (C[num1] == "실생활용") {
                String[] project_c = {"계산기", "달력", "단위 변환기", "행렬계산기"};
                int num3 = (int) Math.round(random * (project_c.length - 1));
                System.out.println("최종 선택: " + project_c[num3]);
            }
        } else if (language[num] == "JAVA") {
            String[] java = {"웹", "안드로이드", "exe"};
            int num4 = (int) Math.round(random * (java.length - 1));
            System.out.println("선택된 범위: " + java[num4]);
            if (java[num4] == "웹" || java[num4] == "안드로이드") {
                String[] project_java = {"여행사", "약국찾기", "SNS서비스"};
                int num5 = (int) Math.round(random * (project_java.length - 1));
                System.out.println("최종 선택: " + project_java[num5]);
            } else if (java[num4] == "exe") {
                String[] pro_java = {"게임", "유틸리티"};
                int num6 = (int) Math.round(random * (pro_java.length - 1));
                System.out.println("최종 선택: " + pro_java[num6]);
            }
        } else if (language[num] == "GO") {
            String[] go = {"웹서비스", "etc"};
            int num7 = (int) Math.round(random * (go.length - 1));
            System.out.println("최종 선택: " + go[num7]);
        } else if (language[num] == "Python") {
            String[] python = {"유틸리티", "게임", "웹크롤링", "웹개발", "머신?딥러닝"};
            int num8 = (int) Math.round(random * (python.length - 1));
            System.out.println("최종 선택: " + python[num8]);
        } else if (language[num] == "JS") {
            String[] js = {"실시간 채팅", "카카오톡 봇", "인스타그램? 같은것"};
            int num9 = (int) Math.round(random * (js.length - 1));
            System.out.println("최종 선택: " + js[num9]);
        }

    }
}