package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트

        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회ㅣ

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //추가

        list.addFirst("서장훈");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("----------------");

        list.addLast("김희철");
        for(String s : list){
            System.out.println(s);
        }


        list.add(2, "김영철");


        for(String s : list){
            System.out.println(s);






        }


        //삭제
        System.out.println("남은 학생 수 (제외 전) : "+list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 전) : "+list.size());


        System.out.println("---------------------");

        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());

        list.set(0, "이수근");

        System.out.println(list.get(0));
        //확인

        System.out.println(list.indexOf("김종국"));






    }

}
