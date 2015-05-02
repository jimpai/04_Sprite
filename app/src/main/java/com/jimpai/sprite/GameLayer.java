package com.jimpai.sprite;

import org.cocos2d.actions.base.CCAction;
import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.particlesystem.CCPointParticleSystem;
import org.cocos2d.types.CGPoint;

/**
 * Created by jimpai on 15/4/24.
 */
public class GameLayer extends CCLayer {

    // 聲明一個精靈對象
    CCSprite player;

    public GameLayer() {
        // 初始化精靈對象
        player = CCSprite.sprite("player.png");
        CGPoint point = CGPoint.ccp(100, 100);

        player.setPosition(point);
        this.addChild(player);
        
        CGPoint target = CGPoint.ccp(400, 100);
        CCJumpTo jumpTo = CCJumpTo.action(3, target, 200, 3);
        player.runAction(jumpTo);


    }
}
