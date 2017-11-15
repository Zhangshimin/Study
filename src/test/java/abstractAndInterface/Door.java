package abstractAndInterface;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhangsm on 2017/8/28.
 */
@Data
@NoArgsConstructor
public abstract class Door {
    String caiZhi = "sssss";

     void open(){
        System.out.print("傻吊");
    };

    abstract void close();
}
