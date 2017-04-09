package com.game_base.stage;

import java.util.Map;

/**
 * 用来检查回合
 * @author Mr.H
 *
 */
public interface StageChecker {
    
    Map<String, Object> initChecker();
    Map<String, Object> attackChecker();
    Map<String, Object> defChecker();
    /**
     * 死亡检查
     * @return
     */
    Map<String, Object> diedChecker();
    Map<String, Object> endChecker();
}
