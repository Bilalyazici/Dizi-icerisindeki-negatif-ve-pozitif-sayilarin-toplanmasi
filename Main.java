package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> dizi = Arrays.asList(2,-2,4,-4,-3,0,2 );
    static List<Integer> sıfırdanKüçük = dizi.stream()
            .filter(x -> x < 0)
            .collect(Collectors.toList());
    static List<Integer> sıfırdanBüyük = dizi.stream()
            .filter(x -> x > 0)
            .collect(Collectors.toList());

    public static void main(String[] args) {
         int sum = 0;
         int sum1 = 0;
         for (int i:sıfırdanBüyük)
             sum += i;
        System.out.println("Pozitif Sayilar Toplami "+sum);
        for (int i:sıfırdanKüçük)
            sum1 += i;
        System.out.println("Negatif Sayilar Toplami "+sum1);
    }
}
