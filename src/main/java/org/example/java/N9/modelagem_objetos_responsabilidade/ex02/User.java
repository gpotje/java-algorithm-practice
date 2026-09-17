package org.example.java.N9.modelagem_objetos_responsabilidade.ex02;

public class User {
    private SubscriptionPlan plan;
    private String name;
    private int useCount = 0;

    public User(String name) {
        this(name, SubscriptionPlan.BASIC);
    }

    public User(String name, SubscriptionPlan plan) {
        this.name = name;
        this.plan = plan;
        this.useCount = 0;
    }

    public boolean useFeature() {
        if (this.plan.canUse(this.useCount)) {
            this.useCount++;
            return true;
        }
        return false;
    }

    public void upgradePlan(SubscriptionPlan newPlan) {
        this.plan = newPlan;
    }

    public int getUseCount() {
        return useCount;
    }

    public SubscriptionPlan getPlan() {
        return plan;
    }

}
