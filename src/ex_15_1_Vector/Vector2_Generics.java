// Generic 사용
/*
 * Vector 클래스 - ArrayList의 구버전
 * 				 ArrayList와 거의 비슷, 둘 중에서 ArrayList를 더 많이 사용
 	*무조건 동기화를 하기 때문에 단일 스레드 처리에서는 ArrayList나 LinkedList보다 성능이 떨어집니다.
	 참고)동기화란 공유 데이터 사용 중에 그 공유 데이터를 
	 다른 스레드(실행 중인 프로그램을 프로세스라고 하며 프로세스를 구성하는 세부 작업 단위)가 
	 사용하지 못하도록 만드는 것을 의미합니다.
*/

package ex_15_1_Vector;
import java.util.Vector;

public class Vector2_Generics {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		for(int i=0; i<vec.size();i++) {
			String temp = vec.get(i);
			System.out.println(temp+"=>"+temp.toUpperCase());
		}
	}
}