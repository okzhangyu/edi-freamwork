package com.avatech.edi.mdm.repository;

import com.avatech.edi.model.bo.IBusinessObject;

public interface BaseBOOperationRepository<M extends IBusinessObject> {

    void save(M model);

    void update(M model);

    void delete(M model);
}
