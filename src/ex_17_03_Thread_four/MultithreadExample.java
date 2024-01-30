// 알파벳만 출력하는 프로그램
package ex_17_03_Thread_four;
class MultithreadExample {
	public static void main(String args[]) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}