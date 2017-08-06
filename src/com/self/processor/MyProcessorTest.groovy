package com.self.processor

import com.self.processor.annotaions.TestAnnotation

/**
 * Created by xugangwen on 06/08/2017.
 */
class MyProcessorTest {
    @TestAnnotation(value = 5,what ="testst")
    public  static  String msg="dsf";
    public static void main(String[] args) {
        System.out.print(msg);
    }
}
