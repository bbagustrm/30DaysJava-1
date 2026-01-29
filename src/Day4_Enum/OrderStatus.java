package Day4_Enum;

import java.util.Set;

public enum OrderStatus {
    CREATED{
        @Override
        public Set<OrderStatus> next(){
            return Set.of(PAID, CANCELLED);
        }
    },
    PAID{
        @Override
        public Set<OrderStatus> next(){
            return Set.of(SHIPPED, REFUNDED);
        }
    },
    SHIPPED{
        @Override
        public Set<OrderStatus> next(){
            return Set.of(DELIVERED);
        }
    },
    DELIVERED {
        @Override
        public Set<OrderStatus> next() {
            return Set.of();
        }
    },
    CANCELLED {
        @Override
        public Set<OrderStatus> next() {
            return Set.of();
        }
    },
    REFUNDED {
        @Override
        public Set<OrderStatus> next() {
            return Set.of();
        }
    };

    public abstract Set<OrderStatus> next();

    public boolean canMoveTo(OrderStatus target) {
        return next().contains(target);
    }
}
