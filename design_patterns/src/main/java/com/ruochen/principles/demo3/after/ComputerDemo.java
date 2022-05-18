package com.ruochen.principles.demo3.after;

public class ComputerDemo {

    public static void main(String[] args) {
        // 创建计算机的组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCPU();
        Memory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
