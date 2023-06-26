package app.model;

import org.springframework.stereotype.Component;

/**
 * @author Alfazard on 26.06.2023
 */
@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
