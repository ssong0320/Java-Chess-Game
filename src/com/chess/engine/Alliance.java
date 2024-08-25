package com.chess.engine;

public enum Alliance {
    WHITE {
        @Override
        public boolean isBlack() {
            return false;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public int getDirection() {
            return -1;
        }
    },
    BLACK {
        @Override
        public boolean isBlack() {
            return true;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public int getDirection() {
            return 1;
        }
    };

    public abstract boolean isBlack();

    public abstract boolean isWhite();

    public abstract int getDirection();

}
