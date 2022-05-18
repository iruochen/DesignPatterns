package com.ruochen.principles.demo5;

public class Client {

    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();
        // 创建明星对象
        Star star = new Star("若尘");
        agent.setStar(star);
        // 创建粉丝对象
        Fans fans = new Fans("张三");
        agent.setFans(fans);
        // 创建媒体公司对象
        Company company = new Company("xx公司");
        agent.setCompany(company);

        // 粉丝见面
        agent.meeting();
        // 媒体公司洽谈
        agent.business();
    }
}
