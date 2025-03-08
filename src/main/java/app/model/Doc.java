package app.model;

import org.springframework.stereotype.Component;

@Component
public class Doc extends Animal {
    @Override
    public String toString() {
        return "Im a Doc";
    }
}
