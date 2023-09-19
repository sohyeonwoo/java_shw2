package p0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J0919_12파일저장하는코드 {

	public static void main(String[] args) {
		//OutputStream
		try {
			OutputStream os = new FileOutputStream("c:/aaa/5.txt");
			String str = "[세종=뉴시스]임소현 기자 = 후쿠시마 오염수 방류 관련 정부가 19일 우리 측 전문가 세 명을 후쿠시마 현지로 파견했다.\r\n"
					+ "박구연 국무조정실 국무1차장은 이날 '후쿠시마 오염수 방류 관련 일일 브리핑 및 향후계획'에서 \"정부는 한국원자력안전기술원(KINS) 소속 전문가를 후쿠시마 현지로 파견했다\"며 \"이번 파견은 지난 9월11일 1차 방류 종료 이후 처음으로 이뤄지는 현지 활동\"이라고 밝혔다.\r\n"
					+ "박 차장은 \"국제원자력기구(IAEA) 현장사무소 및 원전 시설 방문, IAEA 측과 화상회의 등 일정으로 구성됐다\"며 \"IAEA 현장사무소 방문 및 화상회의 시에는 주요 점검 활동 등을 공유하고 원전 시설 중에서는 중앙감시제어실과 해수배관헤더를 방문할 예정\"이라고 설명했다.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "!!";
					byte[] bytes = str.getBytes(); //getByte() : 문자열을 바이트 단위로 분리
			for(byte b:bytes) {
				os.write(b);
			}
			os.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");

	}

}
