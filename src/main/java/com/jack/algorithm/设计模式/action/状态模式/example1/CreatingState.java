package com.jack.algorithm.设计模式.action.状态模式.example1;

public class CreatingState implements State{
    @Override
    public void handle(Document document) {
        document.setState(new CreatedState());
        System.out.println("公文已创建完成");
    }
}