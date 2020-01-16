package javaday10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		//각 팀별 선수명단
		ArrayList<String> kia = new ArrayList<String>();
		kia.add("최형우");
		kia.add("김주찬");
		kia.add("김선빈");
				
		ArrayList<String> dusan = new ArrayList<String>();
		dusan.add("권혁");
		dusan.add("정수빈");
		dusan.add("최주환");
		
		
		ArrayList<String> hanhwa = new ArrayList<String>();
		hanhwa.add("김태균");
		hanhwa.add("이성열");
	
		
		
		//팀별 명단을 다시 List로 만들기
		ArrayList<ArrayList<String>> players =
				new ArrayList<ArrayList<String>>();
		players.add(kia);
		players.add(dusan);
		//팀이 추가되는 경우 팀 이름을 출력하기 위해서 출력하는 로직을 수정
		players.add(hanhwa);
		
		//데이터 출력하기
		//전체 리스트를 하나 하나의 리스트로 imsi에 대입
		for(int i = 0; i < players.size(); i = i +1) {
			if(i == 0) {
				System.out.print("기아: ");
			}else {
				System.out.print("두산: ");
			}
			
			ArrayList<String> imsi = players.get(i);
			//imsi의 데이터를 하나씩 temp에 대입
			for(String temp : imsi) {
				System.out.print(temp + "\t");
			}
			System.out.print("\n");
		}

		System.out.println("=============================");
		//앞에서의 문제는 List의 List를 만들 때 각 List의 특징을 같이 저장하지 못한다는데 있습니다.
		//팀이름은 문자열이고 팀의 선수 명단은 배열이라서 같이 List에 저장을 못합니다.
		//이 부분을 Map이나 Class로 해결해야 합니다.
		
		//List와 팀이름을 갖는 Map을 생성
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("team", "기아");
		map1.put("player", kia);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "두산");
		map2.put("player", dusan);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "한화");
		map3.put("player", hanhwa);
		
		
		//Map의 List를 생성
		ArrayList<Map<String, Object>> kbo =
				new ArrayList<Map<String, Object>>();
		kbo.add(map1);
		kbo.add(map2);
		kbo.add(map3);
		
		//출력하는 부분
		for(Map<String, Object> map : kbo) {
			System.out.print(map.get("team") + ":");
			ArrayList<String> p = (ArrayList<String>)map.get("player");
			for(String temp : p) {
				System.out.print(temp + "\t");
			}
			System.out.print("\n");
		}
		
	}

}
