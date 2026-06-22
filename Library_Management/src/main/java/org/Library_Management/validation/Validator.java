package org.Library_Management.validation;

import java.util.List;

public interface Validator<T> {
    List<String> validate(T target);
}
