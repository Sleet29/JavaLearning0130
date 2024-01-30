/*
 *  -java.lang.Thread 클래스와 이 클래스의 서브 클래스를 Thread(스레드) 클래스라고 합니다.
 *  -스레드가 할 일을 run 메소드 안에 작성해야 합니다.
 *  -public void run()의 형식으로 작성 합니다. 
 */
package ex_17_03_Thread_four;
class AlphabetThread extends Thread {
	public void run() {
		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}