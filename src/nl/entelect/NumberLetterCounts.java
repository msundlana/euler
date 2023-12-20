package nl.entelect;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NumberLetterCounts {
    public static String generateNumberWords(int original,int number,String numberWord){

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirteen");
        map.put(14,"fourteen");
        map.put(15,"fifteen");
        map.put(16,"sixteen");
        map.put(17,"seventeen");
        map.put(18,"eighteen");
        map.put(19,"nineteen");
        map.put(20,"twenty");
        map.put(30,"thirty");
        map.put(40,"forty");
        map.put(50,"fifty");
        map.put(60,"sixty");
        map.put(70,"seventy");
        map.put(80,"eighty");
        map.put(90,"ninety");
        map.put(100,"hundred");
        map.put(1000,"thousand");
        String str = Integer.toString(number);
        numberWord = (numberWord.length()>0 && !numberWord.contains("and") && number!=0 && original>100)?numberWord.concat("and"):numberWord.concat("");
        if(number == 0){
            return numberWord;
        } else if(number<20){
            return numberWord.concat(map.get(number));
        }else{
            if(str.length()==2){
                numberWord = numberWord.concat(map.get(Character.getNumericValue(str.charAt(0))*10));
            }else if(str.length()==3){
                numberWord = numberWord.concat(map.get(Character.getNumericValue(str.charAt(0)))).concat(map.get(100));
            }else if(str.length()==4){
                numberWord = numberWord.concat(map.get(Character.getNumericValue(str.charAt(0)))).concat(map.get(1000));
            }else if(str.length() > 4){
                numberWord = numberWord.concat(map.get(Integer.parseInt(str.substring(0,str.length()-3)))).concat(map.get(1000));
            }

            int trimmedNumber = str.length() > 4 ? Integer.parseInt(str.substring(str.length()-3,str.length())):Integer.parseInt(str.substring(1,str.length()));
            return generateNumberWords(original,trimmedNumber,numberWord);
        }
    }

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i=1; i<=1000; i++){
            System.out.println(generateNumberWords(i,i,""));
            sum = sum.add(BigInteger.valueOf(generateNumberWords(i,i,"").length()));
        }

        System.out.println("length of the number words is " + sum);
    }

}
