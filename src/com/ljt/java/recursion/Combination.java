package com.ljt.java.recursion;

/**
 * 选人组合问题
 */
public class Combination {

    private char[] person;
    private boolean[] selects;

    public Combination(char[] person) {
        this.person = person;
        selects = new boolean[person.length];
    }

    public void showTeams(int teamNumber) {
        combination(teamNumber, 0);
    }

    private void combination(int teamNumber, int index) {
        if (teamNumber == 0) {
            for (int i = 0; i < selects.length; i++) {
                if (selects[i] == true) {
                    System.out.print(person[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        if (index >= person.length) {
            return;
        }
        selects[index] = true;
        combination(teamNumber - 1, index + 1);
        selects[index] = false;
        combination(teamNumber, index + 1);

//        if(teamNumber == 0){//当teamNumber=0时，找到一组
//            for(int i = 0 ; i < selects.length ; i++){
//                if(selects[i] == true){
//                    System.out.print(person[i]+" ");
//                }
//            }
//            System.out.println();
//            return;
//        }
//        //index超过组中人员总数，表示未找到
//        if(index >= person.length ){
//            return;
//        }
//        selects[index] = true;
//        combination(teamNumber-1, index+1);
//        selects[index] = false;
//        combination(teamNumber, index+1);
    }

    public static void main(String[] args) {
        char[] persons = {'A', 'B', 'C', 'D', 'E'};
        Combination cb = new Combination(persons);
        cb.showTeams(3);
    }
}
