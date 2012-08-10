package com.wei.test.OOP;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Mytest {
	public static void main(String[] e) {
		CircleGame newGame = new CircleGame(10, 4);
		newGame.play();
		newGame.showResult();
	}
}

class Player {
	private int no;
	private boolean isInCircle;
	private Player next;
	private Player pre;
	private boolean printOnConsole;

	public Player(int no, boolean print) {
		this.no = no;
		isInCircle = true;
		this.printOnConsole =print;
	}

	public int talk(int num, int target) {
		if (isInCircle) {
			if(printOnConsole) System.out.print("玩家【" + no + "】，喊 " + num);
			if (num == target) {
				goOut();
				if(printOnConsole) System.out.print(" 离开");
				num = 1;
			} else {
				num++;
			}
			if(printOnConsole) System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public boolean inCircle() {
		return isInCircle;
	}

	private void goOut() {
		isInCircle = false;
	}

	public Player getPre() {
		return pre;
	}

	public void setPre(Player pre) {
		this.pre = pre;
	}

	public Player getNext() {
		return next;
	}

	public void setNext(Player next) {
		this.next = next;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public boolean equals(Player other){
		if(other == null) return false;
		if(this.no == other.getNo()) return true;
		return false;
	}
}

class CircleGame {
	int playerNum;// 玩家数目
	int targetNum;// 喊到这个数的人离开
	int lastPlayerNo;// 最后留下的人的编号

	public CircleGame(int playerNum, int targetNum) {
		this.playerNum = playerNum;
		this.targetNum = targetNum;
	}

	public void play() {
		Circle newCircle = new Circle(playerNum){};
		lastPlayerNo = newCircle.roll(targetNum);
	}

	public void showResult() {
		System.out.println("游戏结束，最后剩下的玩家是【" + lastPlayerNo + "】号玩家");

	}
}

class Circle {
	private int size;
	private int currentPlayerNo;
	private LinkedHashMap<Integer, Player> players;

	public Circle(int size) {
		this.size = size;
		players = new LinkedHashMap<Integer, Player>();
		// 初始化玩家
		for (int i = 1; i <= size; i++) {
			players.put(i, new Player(i,true));
		}
		currentPlayerNo = 1;
		initPre();
		initNext();
	}
	
	public int roll(int targetNum) {
		int token = 1;
		Player player = players.get(this.currentPlayerNo);
		while(!player.getNext().equals(player)) {
			currentPlayerNo = player.getNo();
			token = player.talk(token, targetNum);
			if(!player.inCircle()) {
				kick();
			}
			player = player.getNext();
		}
		return player.getNo();
	}
	
	private void kick() {
		Player current = players.get(currentPlayerNo);
		Player pre = current.getPre();
		Player next = current.getNext();
		pre.setNext(next);
		next.setPre(pre);
	}

	private void initPre() {
		for (Entry<Integer, Player> entry : players.entrySet()) {
			entry.getValue().setPre(players.get(entry.getKey() - 1));
		}
		players.get(1).setPre(players.get(size));
	}

	private void initNext() {
		for (Entry<Integer, Player> entry : players.entrySet()) {
			entry.getValue().setNext(players.get(entry.getKey() + 1));
		}
		players.get(size).setNext(players.get(1));
	}

	public int getCurrentPlayerNo() {
		return currentPlayerNo;
	}

	public void setCurrentPlayerNo(int currentPlayerNo) {
		this.currentPlayerNo = currentPlayerNo;
	}
}
