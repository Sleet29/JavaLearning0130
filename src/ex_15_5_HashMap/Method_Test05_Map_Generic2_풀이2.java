package ex_15_5_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Method_Test05_Map_Generic2_풀이2 {
	static HashMap<String, Integer> max_min(int data[]) {
        HashMap<String, Integer> result = new HashMap<>();
        if (data.length == 0) {
            return result;
        }
        int max = data[0];
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }

        result.put("최댓값", max);
        result.put("최솟값", min);
        return result;
        }
	
	
	public static void main(String args[]) {
        int data[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요?");
        for (int i = 0; i < data.length; i++)
            data[i] = sc.nextInt();

        HashMap<String, Integer> m = max_min(data);
        System.out.println("최댓값 = " + m.get("최댓값"));
        System.out.println("최솟값 = " + m.get("최솟값"));

        sc.close();
    }
}

