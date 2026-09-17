package org.example.java.N9.modelagem_objetos_responsabilidade.ex02;

public class Ex02 {
    public static void main(String[] args) {
        User user = new User("Gabriel");

        for(int i = 0; i <= 3 ; i++){
            System.out.println(user.useFeature());
        }

        user.upgradePlan(SubscriptionPlan.PREMIUM);
        System.out.println();
        for(int i = 0; i <= 7 ; i++){
            System.out.println(user.useFeature());
        }

    }
}
