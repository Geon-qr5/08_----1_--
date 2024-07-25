package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
// import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
        Student[] sArr = new Student[3];
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        sArr[0] = new com.kh.inherit.practice.Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        sArr[1] = new com.kh.inherit.practice.Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        sArr[2] = new com.kh.inherit.practice.Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        // 위의 학생 정보 모두 출력
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i].information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
        Employee[] eArr = new Employee[10];
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
        // 한 명씩 추가 될 때마다 카운트함
        while (true) {
            int age = 0, salary = 0;
            double height = 0.0, weight = 0.0;
            String name = null, dept = null;

            for (int i = 0; i < eArr.length; i++) {
                if (eArr[i] == null) {
                    System.out.print("이름을 입력하세요 : ");
                    name = scan.nextLine();
                    System.out.print("나이를 입력하세요 : ");
                    age = scan.nextInt();
                    scan.nextLine();
                    System.out.print("신장을 입력하세요 : ");
                    height = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("몸무게를 입력하세요 : ");
                    weight = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("급여를 입력하세요 : ");
                    salary = scan.nextInt();
                    scan.nextLine();
                    System.out.print("부서를 입력하세요 : ");
                    dept = scan.nextLine();

                    eArr[i] = new Employee(name, age, height, weight, salary, dept);
                    System.out.printf("%d번째 사원 정보가 등록되었습니다.\n", i + 1);

                    // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
                    // ‘n’일 경우 더 이상 그만 입력 받도록..
                    while (i<9) {
                        String Add = null;
                        System.out.print("사원을 추가로 등록하시겠습니까? (Y/N) : ");
                        Add = scan.nextLine();
                        if (Add.equalsIgnoreCase("N")) {
                            System.out.println("사원 등록을 종료합니다.");
                            scan.close();
                            return;
                        } else if (Add.equalsIgnoreCase("Y")) {
                            break;
                        } else {
                            System.out.println("잘못입력하셨습니다.");
                        }
                    }
                }
            }
            System.out.println("사원 등록을 종료합니다.");
            for (Employee e : eArr) {
                System.out.println(e.information());
            }
            scan.close();
            break;
        }
        // 배열에 담긴 사원들의 정보를 모두 출력
    }
}