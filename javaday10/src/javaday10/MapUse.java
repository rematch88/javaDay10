package javaday10;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Map 인스턴스 생성
		HashMap<String, Object> map =
			new HashMap<String, Object>();
		
		//데이터 저장
		map.put("baseball", "야구");
		map.put("soccer", "축구");
		map.put("volleyball", "배구");
		
		//데이터 가져오기 - 출력할 때는 강제 형 변환이 필요없지만 다른 용도로 사용할 때는 강제 형 변환을 해서 가져옵니다.
		String obj = (String)map.get("soccer");
		System.out.println(obj.toUpperCase());
		//없는 key의 값 가져오기 - 언어마다 다르므로 확인
		Object value = map.get("basketball");
		System.out.println(value);
		
		//동일한 key에 데이터를 삽입하면 업데이트
		map.put("soccer", "발로하는 축구");
		obj = (String)map.get("soccer");
		System.out.println(obj.toUpperCase());
		
		//Map의 모든 데이터 출력 - Key의 이름을 사용하지 않음
		System.out.println("=========================");
		//모든 key의 값을 가져오기
		Set<String> keys = map.keySet();
		//Set을 순회
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
	}

}
