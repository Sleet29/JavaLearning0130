// LinkedList 사용 예
/* LinkedList와 ArrayList의 차이점
  - 데이터의 추가 또는 삭제시 ArrayList보다 속도가 빠릅니다.
    ArrayList의 경우 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 LinkedList보다 빠릅니다.
    하지만 중간에 데이터를 추가하려면 빈자리를 만들기 위해 다른 데이터를 복사해서 이동해야 하고
    삭제인 경우에는 데이터를 재배치해야 하지만
    LinkedList의 경우에는 각 요소간 연결만 변경해주면 되기 때문에 처리속도가 상당히 빠릅니다.

  - 검색에 ArrayList는 연속적으로 메모리상에 존재하기 때문에 찾는데 빠르지만
    불연속적으로 위치한 LinkedList는 처음부터 차례대로 따라가야
    원하는 값을 얻을 수 있어 검색시간이 느립니다.
*/
package ex_15_1LinkedList;
import java.util.*;
public class LinkedList2_set_remove {
	public static void main(String args[]) {
		// LinkedList 	객체 생성
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");
		pLinkedList(list);
		
		list.set(0, "오렌지");
		pLinkedList(list);
		
		list.remove(1);
		pLinkedList(list);
		
		list.remove("키위");
		pLinkedList(list);
	}
	
	private static void pLinkedList(LinkedList<String> list) {
		System.out.println("=====================");
		for(int i=0;i<list.size();i++) {
		System.out.println("index="+i+" 데이터="+list.get(i));
		}
	}
}
