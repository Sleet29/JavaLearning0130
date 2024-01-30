package ex_17_test_currenttime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PrintTime implements Runnable {

	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY"+"년"+"MM"+"월"+"DD"+"일"+" HH"+"시"+"mm"+"분"+"ss"+"초");
		while (true) {
	        System.out.println(sdf.format(new Date()));
	        try {
	            Thread.sleep(1000); // 1초마다 출력
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void main(String args[]) {
		PrintTime printTime = new PrintTime();
		Thread thread = new Thread(printTime);
		thread.start();
	}
}



/*
import java.text.SimpleDateFormat;
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
*/