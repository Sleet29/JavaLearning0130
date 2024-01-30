/*
 *  TreeMap
 *  	이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장.
 * 		검색과 정렬에 적합한 컬랙션 클래스입니다.
 */


package ex_15_4_TreeMap;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap_Generics {
	public static void main(String[] args) {
		// 밥법1. 업캐스팅
		// Map<String, String> tm = new TreeMap<String,String();
		
		// 방법2. 구현 클래스를 통한 객체 생성
		TreeMap<String, String> tm = new TreeMap<String,String>();
		
		// Key와 Value 쌍을 삽입
		// Map의 put()을 이용해 (Key,Value) 쌍으로 자료 저장
		tm.put ("woman", "재미있니");
		tm.put ("man", "좋은하루");
		tm.put ("age", new String("10"));
		tm.put ("city", "Seoul");
		tm.put ("city", "Busan");
		
		
		// HashMap에 있는 객체들을 출력
		// 출력 방법 1. 해당 객체 명으로 출력
		System.out.println( tm );
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		// 출력 방법 2. Key 값만 출력
		System.out.println( tm.keySet() ); // [woman,city,man,age]
		
		// 출력 방법 3. Value 값만 출력
		System.out.println( tm.values() );
		
		// 출력 방법 4. 
		// get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println( tm.get("woman") ); // 재미있니
		System.out.println( tm.get("city") );  // Busan
		
		// 출력 방법 5. 
		System.out.println("============================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}	
	}

}
