package kr.co.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetDayOfWeekTest {
    // 오늘 날짜 구하기
    static LocalDate today = LocalDate.now();

    // 요일 구하기
    static DayOfWeek dayOfWeek = today.getDayOfWeek();
    static int dayOfWeekValue = dayOfWeek.getValue(); // 1(월요일) ~ 7(일요일) 까지의 정수 값

    // 한글 요일 이름 구하기
    static String dayOfWeekName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

    public static void main(String[] args) {
        System.out.println("오늘 요일 정수 값: " + dayOfWeekValue);
        System.out.println("오늘 요일 한글 이름: " + dayOfWeekName);
    }
}
