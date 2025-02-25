package com.example.rxjava;

/**
 * 抽象观察者
 */
public interface Observer<T> {
    // 接收消息
    void onNext(T t);
    // 建立关联时调用
    void onSubscribe();
    // 接收异常消息
    void onError(Throwable e);
    // 接收消息完成
    void onComplete();
}
