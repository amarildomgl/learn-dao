
/*
 * Uma classe abstrata em Java é uma classe que não pode ser instanciada
 * diretamente,
 * mas serve como um modelo ou esqueleto para outras classes derivadas.
 * Ela contém métodos abstratos, que são métodos que não possuem uma
 * implementação na classe abstrata
 * e devem ser implementados nas classes derivadas. Além disso, uma classe
 * abstrata pode ter métodos concretos,
 * que são métodos com uma implementação definida na classe abstrata.
 */
package org.ucan.dao;

import java.util.List;

/**
 *
 * @author Amarildo Miguel
 */
public abstract class EntityAbstractDAO <Entity, Key> {

    public abstract List<Entity> list();
    public abstract Entity create(Entity entity);
    public abstract Entity read(Key key);
    public abstract Entity update(Entity entity);
    public abstract boolean delete(Entity entity);
    

}
