package ffm.slc.dispatch;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Handler {
    Class<? extends ActionHandler> value();
}
