
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = List.of(
                new Cat("ジジ",10,"ボンベイ","黒"),
                new Cat("はな",3,"スコティッシュフォールド","茶色"),
                new Cat("ぷん",5,"エキゾチックロングヘア","茶色"),
                new Cat("とうふ",3,"マンチカン","灰色"));

        System.out.println("【茶色い猫の紹介】");
        for(Cat cat : catList){
            if(cat.getColor().equals("茶色")){
                System.out.println("名前；" + cat.getName());
                System.out.println("年齢；" + cat.getAge() + "才");
                System.out.println("猫種；" + cat.getBreed());
                System.out.println();
            }
        }
    }
}
