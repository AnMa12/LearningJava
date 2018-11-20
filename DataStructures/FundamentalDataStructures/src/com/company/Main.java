package com.company;

import java.util.Arrays;

class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return this.score;
    }
}

class Scoreboard {
    private int numEntries = 0; // number of actual entries
    private GameEntry[] board; // array of game entries (names & scores)

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void addEntry(GameEntry newEntry) {

        if(this.board[this.board.length-1] != null) {
            //the board is full
            if(newEntry.getScore() > this.board[0].getScore()) {
                //the worst(position 0) player is kicked out
                //we add the new player at the proper position
                for(int i = 1; i < this.board.length; i++)
                    if(newEntry.getScore() <= this.board[i].getScore())
                        this.board[i-1].setScore(this.board[i].getScore());
                    else {
                        this.board[i-1].setScore(newEntry.getScore());
                        break;
                    }
            }
        } else {
            for(int i = this.board.length-1; i >= 0 ; i--)
                if(this.board[i] != null) {
                    if (newEntry.getScore() <= this.board[i].getScore())
                        this.board[i+1].setScore(this.board[i].getScore());
                    else {
                        this.board[i+1].setScore(newEntry.getScore());
                        break;
                    }
                }
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
