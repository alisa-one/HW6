package com.company;

public  class Main {



    public static void main(String[] args) {
        // write your code here
        Boss BigBoss = new Boss("BigBoss",4500, 300, "backfight");
        System.out.println(
                BigBoss.toString()
            );

    }

    public static class Boss {
        public Boss(String bossname,int healtheBoss, int damageBoss, String DefenceTypeBoss ) {
        }
    }

}
