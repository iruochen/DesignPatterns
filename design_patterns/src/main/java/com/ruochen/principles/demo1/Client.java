package com.ruochen.principles.demo1;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // 1. 创建输入法对象
        SougouInput input = new SougouInput();
        // 2. 创建皮肤对象
        // DefaultSkin skin = new DefaultSkin();
        RuochenSkin skin = new RuochenSkin();
        // 3. 将皮肤设置到输入法中
        input.setSkin(skin);
        // 4. 显示皮肤
        input.display();
    }
}
