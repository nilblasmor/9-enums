package enums.level1.exercise3;

public enum Level {

    LOW {
        @Override
        public String getColor() {
            return "Black";
        }
    },
    MEDIUM {
        @Override
        public String getColor() {
            return "White";
        }
    },
    HIGH {
        @Override
        public String getColor() {
            return "Red";
        }
    };

    public abstract String getColor();

    }
