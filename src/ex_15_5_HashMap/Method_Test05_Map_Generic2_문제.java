package ex_15_5_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Method_Test05_Map_Generic2_문제 {
	static HashMap<String, Integer> max_min(int data[]) {
        HashMap<String, Integer> m = new HashMap<>();

		int result[] = {data[0],data[0]};
		
		for(int i=1;i<data.length;i++) {
			if(result[0] < data[i]) result[0] = data[i]; // max
			if(result[1] > data[i]) result[1] = data[i]; // min
		}
		
		m.put("최댓값", result[0]);
		m.put("최솟값", result[1]);
		
		return m;
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

/*
data[0] = 1
data[1] = 2
data[2] = 3
data[3] = 4
data[4] = 5

/*
 * import java.util.HashMap;

public class Method_Test05_Map_Generic2_문제 {
    static HashMap<String, Integer> max_min(int data[]) {
        HashMap<String, Integer> result = new HashMap<>();
        if (data.length == 0) {
            return result; // Return an empty map if the array is empty
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

 */


/*
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
 
public class Main
{
    public static void main(String[] args)
    {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('A', 1);
        hm.put('B', 2);
        hm.put('C', 3);
        hm.put('D', 4);
 
        Map.Entry<Character, Integer> maxEntry = hm.entrySet().stream()
                                .max(Comparator.comparing(Map.Entry::getValue))
                                .orElse(null);
 
        System.out.println(maxEntry);
    }
}
*/