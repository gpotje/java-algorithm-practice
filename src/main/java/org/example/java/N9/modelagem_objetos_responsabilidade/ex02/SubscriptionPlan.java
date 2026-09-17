package org.example.java.N9.modelagem_objetos_responsabilidade.ex02;

public enum SubscriptionPlan {
    BASIC(3),
    PREMIUM(10),
    UNLIMITED(Integer.MAX_VALUE);

        private final int limit;

        SubscriptionPlan(int limit) {
            this.limit = limit;
        }

        public boolean canUse(int currentUseCount) {
            return currentUseCount < this.limit;
        }

}
