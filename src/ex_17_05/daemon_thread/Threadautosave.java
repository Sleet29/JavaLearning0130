package ex_17_05.daemon_thread;

public class Threadautosave implements Runnable {
	static boolean autoSave = false;
	public void run() {
		while (true) {
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}


/*import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTime implements Runnable {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(1000); // 1초마다 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PrintTime printTime = new PrintTime();
        Thread thread = new Thread(printTime);
        thread.start();
    }
}

 * 
 */
