package com.perry.annotation;

import java.lang.annotation.Annotation;

/**
 * @Title: XXXX
 * @Description:
 * @author: zenghuapei
 * @date 2016/9/5
 * @update [修改人] [修改时间] [变更描述]
 */
public class AbsTestComponent implements TestComponent {
    @Override
    public String value() {
        return null;
    }

    /**
     * Returns the annotation type of this annotation.
     */
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
