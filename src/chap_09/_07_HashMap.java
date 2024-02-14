package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)

        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-------------------------");

        if(map.containsKey("서장훈")){

            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서중훈님의 누적 포인트 : "+map.get("서장훈"));

        }
        else{
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");

            System.out.println("---------------------");
        }


        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("---------------");


        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수 : "+map.size());
            System.out.println("가게 접자");
        }

        System.out.println("---------------");

        // 다시 고객들이 막 찾아옴


        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // Key 확인

        for (String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("------------------");


        for( int value : map.values()){
            System.out.println(value);
        }
        System.out.println("------------------");



        // key value 함꼐 확인하는법
        for (String key : map.keySet()){
            System.out.println(" 고객 이름 : " + key + "       포인트 : " + map.get(key));
        }

        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);

        for (String key : map.keySet()){
            System.out.println(" 고객 이름 : " + key + "       포인트 : " + map.get(key));
        }

    }
}
