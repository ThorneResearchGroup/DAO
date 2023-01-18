package tech.tresearchgroup.dao.model;

import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;

import java.util.Date;

public interface BasicObjectInterface {
    @Serialize(order = 0)
    @SerializeNullable Date getCreated();

    @Serialize(order = 1)
    @SerializeNullable Date getUpdated();

    @Serialize(order = 2)
    @SerializeNullable Long getId();

    @Serialize(order = 3)
    @SerializeNullable LockType getLockType();

    void setCreated(Date created);

    void setUpdated(Date updated);

    void setId(Long id);

    void setLockType(LockType lockType);
}
