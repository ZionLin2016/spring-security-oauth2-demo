package cn.lsd.security.domain;

import lombok.Data;

/**
 * Created on 2018/5/24.
 *
 * @author zlf
 * @since 1.0
 */
@Data
public class SimpleResponse<T> {
    public SimpleResponse(Object content){
        this.content = content;
    }

    private Object content;
}
