package com.ruochen.principles.demo3.before;

public class ComputerDemo {

    public static void main(String[] args) {
        // 创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCPU cpu = new IntelCPU();
        KingstonMemory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();

        // 组装计算机
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
