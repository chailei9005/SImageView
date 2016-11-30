package com.szysky.customize.simageview.effect;

import android.graphics.Canvas;

import com.szysky.customize.simageview.SImageView;

/**
 * Author :  suzeyu
 * Time   :  2016-11-29  下午6:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 控件内部图片的显示策略
 */

public interface IDrawingStrategy {
    /**
     * 根据提供的画布, 和可绘制的位置实现具体效果
     *
     * @param canvas    {@link SImageView#onDraw(Canvas)} 中的画布
     * @param info      每个内部元素应该摆放的位置信息类
     */
    void algorithm(Canvas canvas , SImageView.ConfigInfo info);
}