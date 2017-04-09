package com.game_base.base.action;

/**
 * 战斗事件
 * @author PVer
 *
 */
public interface FightEvent {

	/**
	 * 收到伤害
	 */
	void getHurt();
	
	void loseHealth();
	void getHealed();
	
	void died();
}
