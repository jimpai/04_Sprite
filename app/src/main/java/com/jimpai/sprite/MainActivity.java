package com.jimpai.sprite;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;
import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    private CCGLSurfaceView view = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new CCGLSurfaceView(this);

        setContentView(view);

        CCDirector director = CCDirector.sharedDirector();

        director.attachInView(view);
        director.setDisplayFPS(true);
        director.setAnimationInterval(1.0f / 30.0f);
        CCScene scene = CCScene.node();
        GameLayer gamelayer = new GameLayer();
        scene.addChild(gamelayer);

        director.runWithScene(scene);
    }

}
