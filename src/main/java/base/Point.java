package base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhangshimin on 2017/6/3 0003.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Point<T> {
    //定义一个标记  T 使用时动态变化
    T x;
    T y;
}
