import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //犬種リスト
        List<String> dogList = new ArrayList<>();
        dogList.add("柴犬");
        dogList.add("ブルテリア");
        dogList.add("ダックスフント");
        dogList.add("コーギー");
        dogList.add("ジャックラッセルテリア");
        //上記リスト内からのテリア犬リスト
        List<String> terrierDog = dogList.stream().filter(terrier -> terrier.contains("テリア")).toList();

        System.out.println("【犬種リスト】");
        dogList.forEach(System.out::println);

        System.out.println();//改行

        System.out.println("【テリア犬】");
        terrierDog.forEach(System.out::println);

    }
}