package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class ApiJson {
	private static final String JSONParser = null;

	public static void main(String[] args) throws IOException {
		// "https://api.upbit.com/v1/market/all"
		// coin 전체정보(한글명, 영문명,거래코드)
		String mainUrl = "https://api.upbit.com/v1/market/all";
		// markets = <- 코드값에 해당하는 실시간 상세정보
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=KRW-BTC";
		
		
		// URL 클래스 원격자원에 접근
		URL url = new URL(mainUrl);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		// 요청 방식 설정(get or post)
		conn.setRequestMethod("GET");
		// 연결 타임아웃설정
		conn.setConnectTimeout(5000);
		// 일기 타임아웃 설정
		conn.setReadTimeout(5000);
		conn.setDoOutput(true); // 디폴드
		int responseCode = conn.getResponseCode(); // 응답에 따른 요청값 리턴
		// 정상응답 체크
		if(responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			// 내용이 없을때까지 버퍼에 담기
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
			
			
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(response.toString());
			
			
			
			
			
			
		}
		
		
		
	}
}
