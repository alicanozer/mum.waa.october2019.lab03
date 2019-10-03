package mum.waa.october2019.lab03.validator;

import java.util.List;

public interface Validator {

    public List<String> validate(Object domainObject);
}
